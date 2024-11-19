package com.example.azarovaILab.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Long id;
    // Id клиента

    private String fullName;
    // ФИО

    private LocalDate birthDate;
    // Дата рождения

    private String workplace;
    // Место работы

    private Integer monthlyIncome;
    // Ежемесячный доход

    private List<String> bankNames;
    // Банки, которыми он пользуется

    private List<Long> creditAccountsId;
    // Кредитные счета

    private List<Long> paymentAccountsId;
    // Платежные счета

    private Integer creditRating;
    // Кредитный рейтинг для банка
}