package com.example.azarovaILab.service;

import com.example.azarovaILab.dto.BankDto;
import com.example.azarovaILab.entity.Bank;

public interface BankService {

    BankDto createBank(String bankName);

    Bank getBankById(Long id);

    BankDto getBankByIdDto(Long id);

    BankDto updateBank(Long id, String name);

    void deleteBank(Long id);
}