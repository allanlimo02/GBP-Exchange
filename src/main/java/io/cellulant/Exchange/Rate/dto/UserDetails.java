package io.cellulant.Exchange.Rate.dto;

import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = ("users"))
@Entity
public class UserDetails {

    @Id
    @GeneratedValue
    int userId;
    @Column(name = "first_name")
    String firstName;
    @Column(name = "last_name")
    String lastName;
    @Column(name = "email")
    String email;
    @Column(name = "msisdn")
    String msisdn;

}
