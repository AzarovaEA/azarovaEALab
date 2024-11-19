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
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    // Id сотрудника

    @Column(nullable = false)
    private String fullName;
    // ФИО

    @Column(nullable = false)
    private LocalDate birthDate;
    // Дата рождения

    @Column(nullable = false)
    private String position;
    // Должность

    @ManyToOne
    private Bank bank;
    // В каком банке работает

    @Column(nullable = false)
    private Boolean isRemote;
    // Работает ли в банковском офисе или удаленно?

    @ManyToOne
    private BankOffice office;
    // Банковский офис, в котором работает

    @Column(nullable = false)
    private Boolean canIssueLoans;
    //  Может ли выдавать кредиты?

    @Column(nullable = false)
    private Integer salary;
    // Размер зарплаты
}
