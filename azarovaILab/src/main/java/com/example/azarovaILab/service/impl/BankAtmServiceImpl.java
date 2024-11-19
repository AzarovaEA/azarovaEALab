package com.example.azarovaILab.service.impl;

import lombok.RequiredArgsConstructor;
import com.example.azarovaILab.dto.BankAtmDto;
import com.example.azarovaILab.entity.*;
import com.example.azarovaILab.repository.BankAtmRepository;
import com.example.azarovaILab.repository.BankRepository;
import com.example.azarovaILab.service.BankAtmService;
import com.example.azarovaILab.service.BankOfficeService;
import com.example.azarovaILab.service.BankService;
import com.example.azarovaILab.service.EmployeeService;
import org.springframework.stereotype.Service;
import com.example.azarovaILab.service.mapper.BankAtmMapper;

@Service
@RequiredArgsConstructor
public class BankAtmServiceImpl implements BankAtmService {

    private final BankAtmRepository bankAtmRepository;
    private final BankRepository bankRepository;
    private final BankService bankService;
    private final BankOfficeService bankOfficeService;
    private final EmployeeService employeeService;
    private final BankAtmMapper bankAtmMapper;

    @Override
    public BankAtmDto createBankAtm(String name, String address, Boolean status, Long bankId,
                                    Long bankOfficeId, Long employeeId, Boolean isIssuingMoney,
                                    Boolean isDepositingMoney, Integer servicingCost) {
        BankAtm bankAtm = new BankAtm();
        bankAtm.setName(name);
        bankAtm.setAddress(address);
        bankAtm.setStatus(status);
        Bank bank = bankService.getBankById(bankId);
        bank.setCountAtms(bank.getCountAtms() + 1);
        bankAtm.setBank(bank);
        bankAtm.setLocation(bankOfficeService.getBankOfficeById(bankOfficeId));
        bankAtm.setServicingEmployee(employeeService.getEmployeeById(employeeId));
        bankAtm.setIsIssuingMoney(isIssuingMoney);
        bankAtm.setIsDepositingMoney(isDepositingMoney);
        bankAtm.setAmountOfMoney((int)(Math.random() * bank.getTotalMoney()));
        bankAtm.setServicingCost(servicingCost);
        bankRepository.save(bank);
        bankAtmRepository.save(bankAtm);
        return bankAtmMapper.toDto(bankAtm);
    }

    @Override
    public BankAtm getBankAtmById(Long id) {
        return bankAtmRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Bank Atm not found with id " + id));
    }

    public BankAtmDto getBankAtmByIdDto(Long id) {
        return bankAtmMapper.toDto(getBankAtmById(id));
    }

    @Override
    public BankAtmDto updateBankAtm(Long id, String name, String address, Boolean status, Long bankId,
                                    Long bankOfficeId, Long employeeId, Boolean isIssuingMoney,
                                    Boolean isDepositingMoney, Integer servicingCost) {
        BankAtm bankAtm = getBankAtmById(id);
        bankAtm.setName(name);
        bankAtm.setAddress(address);
        bankAtm.setStatus(status);
        Bank bank = bankService.getBankById(bankId);
        bankAtm.setBank(bank);
        bankAtm.setLocation(bankOfficeService.getBankOfficeById(bankOfficeId));
        bankAtm.setServicingEmployee(employeeService.getEmployeeById(employeeId));
        bankAtm.setIsIssuingMoney(isIssuingMoney);
        bankAtm.setIsDepositingMoney(isDepositingMoney);
        bankAtm.setServicingCost(servicingCost);
        bankAtmRepository.save(bankAtm);
        return bankAtmMapper.toDto(bankAtm);
    }

    @Override
    public void deleteBankAtm(Long id) {
        BankAtm bankAtm = getBankAtmById(id);
        Bank bank = bankAtm.getBank();
        bank.setCountAtms(bank.getCountAtms() - 1);
        bankRepository.save(bank);
        bankAtmRepository.deleteById(id);
    }
}