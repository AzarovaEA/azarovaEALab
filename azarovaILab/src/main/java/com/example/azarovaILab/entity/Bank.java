package com.example.azarovaILab.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "bank")
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    // Id банка

    @Column(nullable = false)
    private String name;
    // Имя банка

    @Column(nullable = false)
    private Integer countOffices;
    // Кол-во офисов

    @Column(nullable = false)
    private Integer countAtms;
    // Кол-во банкоматов

    @Column(nullable = false)
    private Integer countEmployees;
    // Кол-во сотрудников

    @Column(nullable = false)
    private Integer countClients;
    // Кол-во клиентов

    @Column(nullable = false)
    private Integer rating;
    // Рейтинг банка

    @Column(nullable = false)
    private Integer totalMoney;
    // Всего денег в банке

    @Column(nullable = false)
    private Float interestRate;
    // Процентная ставка
}
