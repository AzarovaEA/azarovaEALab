package com.example.azarovaILab.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "bank_office")
public class BankOffice {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    // Id банковского офиса

    @ManyToOne
    private Bank bank;
    // Название офиса

    @Column(nullable = false)
    private String name;
    // Название офиса

    @Column(nullable = false)
    private String address;
    // Название офиса

    @Column(nullable = false)
    private Boolean status;
    // Статус

    @Column(nullable = false)
    private Boolean canPlaceAtm;
    // Можно ли разместить банкомат?

    @Column(nullable = false)
    private Integer countOfAtms;
    //  Кол-во банкоматов в данном офисе

    @Column(nullable = false)
    private Boolean canIssueLoan;
    // Можно ли оформить кредит в данном офисе?

    @Column(nullable = false)
    private Boolean isIssuingMoney;
    // Работает ли на выдачу денег?

    @Column(nullable = false)
    private Boolean isDepositingMoney;
    // Можно ли внести деньги?

    @Column(nullable = false)
    private Integer amountOfMoney;
    // Кол-во денег в банковском офисе

    @Column(nullable = false)
    private Integer rentalCost;
    // Стоимость аренды банковского офиса
}
