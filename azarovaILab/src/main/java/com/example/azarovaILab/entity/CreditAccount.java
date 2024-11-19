package com.example.azarovaILab.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "credit_account")
public class CreditAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    // Id кредитного счета

    @ManyToOne
    private User user;
    // Пользователь, за которым закреплен этот кредитный счет

    @ManyToOne
    private Bank bank;
    // Банк, где взят кредит

    @Column(nullable = false)
    private LocalDate startDate;
    // Дата начала кредита

    @Column(nullable = false)
    private LocalDate endDate;
    // Дата окончания кредита

    @Column(nullable = false)
    private Integer numberOfMonths;
    // Кол-во месяцев, на которые взят кредит

    @Column(nullable = false)
    private Integer loanAmount;
    // Сумма кредита

    @Column(nullable = false)
    private Integer monthlyPayment;
    // Ежемесячный платеж

    @Column(nullable = false)
    private Float interestRate;
    // Процентная ставка

    @ManyToOne
    private Employee issuingEmployee;
    // Сотрудник, который выдал кредит

    @ManyToOne
    private PaymentAccount paymentAccount;
    // Платежный счет
}
