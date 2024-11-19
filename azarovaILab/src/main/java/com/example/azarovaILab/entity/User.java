package com.example.azarovaILab.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    // Id клиента

    @Column(nullable = false)
    private String fullName;
    // ФИО

    @Column(nullable = false)
    private LocalDate birthDate;
    // Дата рождения

    @Column(nullable = false)
    private String workplace;
    // Место работы

    @Column(nullable = false)
    private Integer monthlyIncome;
    // Ежемесячный доход

    @ManyToMany
    @JoinTable(name = "user_bank", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "bank_id"))
    private List<Bank> banks;
    // Банки, которыми он пользуется

    @OneToMany
    @JoinTable(name = "user_credit_account", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "id"))
    private List<CreditAccount> creditAccounts;
    // Кредитные счета

    @OneToMany
    @JoinTable(name = "user_payment_account", joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "id"))
    private List<PaymentAccount> paymentAccounts;
    // Платежные счета

    @Column(nullable = false)
    private Integer creditRating;
    // Кредитный рейтинг для банка
}
