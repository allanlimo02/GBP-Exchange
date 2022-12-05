package io.cellulant.Exchange.Rate.dto;

import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "transaction_id")
@Entity
public class TransactionId {
    @Id
    @GeneratedValue
    @Column(name = "transaction_id")
    private int transactionId;
    @Column(name = "user_id")
    private int userId;
    @Column(name = "transaction_amount")
    private int transaction_amount;
    @Column(name = "user_name")
    private String userName;

}
