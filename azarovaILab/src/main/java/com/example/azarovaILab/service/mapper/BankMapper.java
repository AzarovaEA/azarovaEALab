package com.example.azarovaILab.service.mapper;

import com.example.azarovaILab.dto.BankDto;
import com.example.azarovaILab.entity.Bank;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BankMapper {

    BankDto toDto(Bank bank);
}