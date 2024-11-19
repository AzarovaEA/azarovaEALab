package com.example.azarovaILab.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
    private Long id;
    // Id сотрудника

    private String fullName;
    // ФИО

    private LocalDate birthDate;
    // Дата рождения

    private String position;
    // Должность

    private String bankName;
    // В каком банке работает

    private Boolean isRemote;
    // Работает ли в банковском офисе или удаленно?

    private String officeName;
    // Банковский офис, в котором работает

    private Boolean canIssueLoans;
    //  Может ли выдавать кредиты?

    private Integer salary;
    // Размер зарплаты
}