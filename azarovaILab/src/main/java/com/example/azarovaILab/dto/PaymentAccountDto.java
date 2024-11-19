package com.example.azarovaILab.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentAccountDto {
    private Long id;
    // Id платёжного счета

    private Long userId;
    // Пользователь, за которым закреплен этот платежный счет

    private Long bankId;
    // Банк, в котором открыт этот счет

    private Integer amount;
    // Сумма, которая лежит в данный момент на счету
}