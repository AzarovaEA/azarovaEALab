package com.example.azarovaILab.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankDto {
    private Long id;
    // Id банка

    private String name;
    // Имя банка

    private Integer countOffices;
    // Кол-во офисов

    private Integer countAtms;
    // Кол-во банкоматов

    private Integer countEmployees;
    // Кол-во сотрудников

    private Integer countClients;
    // Кол-во клиентов

    private Integer rating;
    // Рейтинг банка

    private Integer totalMoney;
    // Всего денег в банке

    private Float interestRate;
    // Процентная ставка
}