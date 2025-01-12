package com.example.azarovaILab.service.impl;

import com.example.azarovaILab.dto.BankOfficeDto;
import lombok.RequiredArgsConstructor;
import com.example.azarovaILab.entity.Bank;
import com.example.azarovaILab.entity.BankOffice;
import com.example.azarovaILab.repository.BankOfficeRepository;
import com.example.azarovaILab.repository.BankRepository;
import com.example.azarovaILab.service.BankOfficeService;
import com.example.azarovaILab.service.BankService;
import org.springframework.stereotype.Service;
import com.example.azarovaILab.service.mapper.BankOfficeMapper;


@Service
@RequiredArgsConstructor
public class BankOfficeServiceImpl implements BankOfficeService {

    private final BankOfficeRepository bankOfficeRepository;
    private final BankRepository bankRepository;
    private final BankService bankService;
    private final BankOfficeMapper bankOfficeMapper;

    @Override
    public BankOfficeDto createBankOffice(Long bankId, String name, String address, Boolean status,
                                          Boolean canPlaceAtm, Boolean canIssueLoan, Boolean isIssuingMoney,
                                          Boolean isDepositingMoney, Integer rentalCost) {
        BankOffice bankOffice = new BankOffice();
        Bank bank = bankService.getBankById(bankId);
        bank.setCountOffices(bank.getCountOffices() + 1);
        bankOffice.setBank(bank);
        bankOffice.setName(name);
        bankOffice.setAddress(address);
        bankOffice.setStatus(status);
        bankOffice.setCanPlaceAtm(canPlaceAtm);
        bankOffice.setCountOfAtms(bank.getCountAtms());
        bankOffice.setCanIssueLoan(canIssueLoan);
        bankOffice.setIsIssuingMoney(isIssuingMoney);
        bankOffice.setIsDepositingMoney(isDepositingMoney);
        bankOffice.setAmountOfMoney((int)(Math.random() * bank.getTotalMoney()));
        bankOffice.setRentalCost(rentalCost);
        bankRepository.save(bank);
        bankOfficeRepository.save(bankOffice);
        return bankOfficeMapper.toDto(bankOffice);
    }

    @Override
    public BankOffice getBankOfficeById(Long id) {
        return bankOfficeRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Bank Office not found with id " + id));
    }

    @Override
    public BankOfficeDto getBankOfficeByIdDto(Long id) {
        return bankOfficeMapper.toDto(getBankOfficeById(id));
    }

    @Override
    public BankOfficeDto updateBankOffice(Long id, Long bankId, String name, String address, Boolean status,
                                          Boolean canPlaceAtm, Boolean canIssueLoan, Boolean isIssuingMoney,
                                          Boolean isDepositingMoney, Integer rentalCost) {
        BankOffice bankOffice = getBankOfficeById(id);
        bankOffice.setBank(bankService.getBankById(bankId));
        bankOffice.setName(name);
        bankOffice.setAddress(address);
        bankOffice.setStatus(status);
        bankOffice.setCanPlaceAtm(canPlaceAtm);
        bankOffice.setCanIssueLoan(canIssueLoan);
        bankOffice.setIsIssuingMoney(isIssuingMoney);
        bankOffice.setIsDepositingMoney(isDepositingMoney);
        bankOffice.setRentalCost(rentalCost);
        bankOfficeRepository.save(bankOffice);
        return bankOfficeMapper.toDto(bankOffice);
    }

    @Override
    public void deleteBankOffice(Long id) {
        BankOffice bankOffice = getBankOfficeById(id);
        Bank bank = bankOffice.getBank();
        bank.setCountOffices(bank.getCountOffices() - 1);
        bankRepository.save(bank);
        bankOfficeRepository.deleteById(id);
    }
}
