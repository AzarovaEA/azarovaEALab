package com.example.azarovaILab.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "payment_account")
public class PaymentAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    // Id платёжного счета

    @ManyToOne
    private User user;
    // Пользователь, за которым закреплен этот платежный счет

    @ManyToOne
    private Bank bank;
    // Банк, в котором открыт этот счет

    @Column(nullable = false)
    private Integer amount;
    // Сумма, которая лежит в данный момент на счету
}
