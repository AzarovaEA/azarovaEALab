package com.example.azarovaILab.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditAccountDto {
    private Long id;
    // Id кредитного счета

    private String userName;
    // Пользователь, за которым закреплен этот кредитный счет

    private String bankName;
    // Банк, где взят кредит

    private LocalDate startDate;
    // Дата начала кредита

    private LocalDate endDate;
    // Дата окончания кредита

    private Integer numberOfMonths;
    // Кол-во месяцев, на которые взят кредит

    private Integer loanAmount;
    // Сумма кредита

    private Integer monthlyPayment;
    // Ежемесячный платеж

    private Float interestRate;
    // Процентная ставка

    private String issuingEmployeeName;
    // Сотрудник, который выдал кредит

    private Integer paymentAccountAmount;
    // Платежный счет
}