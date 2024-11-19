package com.example.azarovaILab.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankAtmDto {
    private Long id;
    // Id банкомата

    private String name;
    // Имя банкомата

    private String address;
    // Адрес

    private Boolean status;
    // Статус (работает/не работает/нет денег)

    private String bankName;
    // Банк, которому принадлежит банкомат

    private String locationAddress;
    // Расположение банкомата

    private String servicingEmployeeName;
    // Обслуживающий сотрудник

    private Boolean isIssuingMoney;
    // Работает ли на выдачу денег?

    private Boolean isDepositingMoney;
    // Можно ли внести деньги?

    private Integer amountOfMoney;
    // Кол-во денег в банкомате

    private Integer servicingCost;
    // Стоимость обслуживания банкомата
}