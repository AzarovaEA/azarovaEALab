package com.example.azarovaILab.service.mapper;

import com.example.azarovaILab.dto.BankOfficeDto;
import com.example.azarovaILab.entity.BankOffice;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BankOfficeMapper {

    @Mapping(source = "bank.name", target = "bankName")
    BankOfficeDto toDto(BankOffice bankOffice);

}