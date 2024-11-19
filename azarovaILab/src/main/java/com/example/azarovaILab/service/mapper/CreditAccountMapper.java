package com.example.azarovaILab.service.mapper;

import com.example.azarovaILab.dto.CreditAccountDto;
import com.example.azarovaILab.entity.CreditAccount;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CreditAccountMapper {

    @Mapping(source = "user.fullName", target = "userName")
    @Mapping(source = "bank.name", target = "bankName")
    @Mapping(source = "issuingEmployee.fullName", target = "issuingEmployeeName")
    @Mapping(source = "paymentAccount.amount", target = "paymentAccountAmount")
    CreditAccountDto toDto(CreditAccount creditAccount);

}