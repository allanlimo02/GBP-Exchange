package io.cellulant.Exchange.Rate.dto;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Fetch;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class UserWallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int walletId;
    @Column(name = "user_id")
    private int userId;
    @Column(name = "wallet_amount")
    private int walletAmmount;


}
