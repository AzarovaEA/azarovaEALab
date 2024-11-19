package com.example.azarovaILab.service.mapper;

import com.example.azarovaILab.dto.BankOfficeDto;
import com.example.azarovaILab.entity.Bank;
import com.example.azarovaILab.entity.BankOffice;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-19T10:03:24+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Oracle Corporation)"
)
@Component
public class BankOfficeMapperImpl implements BankOfficeMapper {

    @Override
    public BankOfficeDto toDto(BankOffice bankOffice) {
        if ( bankOffice == null ) {
            return null;
        }

        BankOfficeDto bankOfficeDto = new BankOfficeDto();

        bankOfficeDto.setBankName( bankOfficeBankName( bankOffice ) );
        bankOfficeDto.setId( bankOffice.getId() );
        bankOfficeDto.setName( bankOffice.getName() );
        bankOfficeDto.setAddress( bankOffice.getAddress() );
        bankOfficeDto.setStatus( bankOffice.getStatus() );
        bankOfficeDto.setCanPlaceAtm( bankOffice.getCanPlaceAtm() );
        bankOfficeDto.setCountOfAtms( bankOffice.getCountOfAtms() );
        bankOfficeDto.setCanIssueLoan( bankOffice.getCanIssueLoan() );
        bankOfficeDto.setIsIssuingMoney( bankOffice.getIsIssuingMoney() );
        bankOfficeDto.setIsDepositingMoney( bankOffice.getIsDepositingMoney() );
        bankOfficeDto.setAmountOfMoney( bankOffice.getAmountOfMoney() );
        bankOfficeDto.setRentalCost( bankOffice.getRentalCost() );

        return bankOfficeDto;
    }

    private String bankOfficeBankName(BankOffice bankOffice) {
        if ( bankOffice == null ) {
            return null;
        }
        Bank bank = bankOffice.getBank();
        if ( bank == null ) {
            return null;
        }
        String name = bank.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }
}
