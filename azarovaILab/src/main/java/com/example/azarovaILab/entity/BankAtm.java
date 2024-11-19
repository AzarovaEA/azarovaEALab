package com.example.azarovaILab.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "bank_atm")
public class BankAtm {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    // Id банкомата

    @Column(nullable = false)
    private String name;
    // Имя банкомата

    @Column(nullable = false)
    private String address;
    // Адрес

    @Column(nullable = false)
    private Boolean status;
    // Статус (работает/не работает/нет денег)

    @ManyToOne
    private Bank bank;
    // Банк, которому принадлежит банкомат

    @ManyToOne
    private BankOffice location;
    // Расположение банкомата

    @ManyToOne
    private Employee servicingEmployee;
    // Обслуживающий сотрудник

    @Column(nullable = false)
    private Boolean isIssuingMoney;
    // Работает ли на выдачу денег?

    @Column(nullable = false)
    private Boolean isDepositingMoney;
    // Можно ли внести деньги?

    @Column(nullable = false)
    private Integer amountOfMoney;
    // Кол-во денег в банкомате

    @Column(nullable = false)
    private Integer servicingCost;
    // Стоимость обслуживания банкомата
}

