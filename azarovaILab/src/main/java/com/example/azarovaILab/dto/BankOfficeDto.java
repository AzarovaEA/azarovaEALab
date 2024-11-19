package com.example.azarovaILab.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankOfficeDto {
    private Long id;
    // Id банковского офиса

    private String bankName;
    // Название офиса

    private String name;
    // Название офиса

    private String address;
    // Название офиса

    private Boolean status;
    // Статус

    private Boolean canPlaceAtm;
    // Можно ли разместить банкомат?

    private Integer countOfAtms;
    //  Кол-во банкоматов в данном офисе

    private Boolean canIssueLoan;
    // Можно ли оформить кредит в данном офисе?

    private Boolean isIssuingMoney;
    // Работает ли на выдачу денег?

    private Boolean isDepositingMoney;
    // Можно ли внести деньги?

    private Integer amountOfMoney;
    // Кол-во денег в банковском офисе

    private Integer rentalCost;
    // Стоимость аренды банковского офиса
}