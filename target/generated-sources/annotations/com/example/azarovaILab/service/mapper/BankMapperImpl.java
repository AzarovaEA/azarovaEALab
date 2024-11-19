package com.example.azarovaILab.service.mapper;

import com.example.azarovaILab.dto.BankDto;
import com.example.azarovaILab.entity.Bank;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-19T17:33:52+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Oracle Corporation)"
)
@Component
public class BankMapperImpl implements BankMapper {

    @Override
    public BankDto toDto(Bank bank) {
        if ( bank == null ) {
            return null;
        }

        BankDto bankDto = new BankDto();

        bankDto.setId( bank.getId() );
        bankDto.setName( bank.getName() );
        bankDto.setCountOffices( bank.getCountOffices() );
        bankDto.setCountAtms( bank.getCountAtms() );
        bankDto.setCountEmployees( bank.getCountEmployees() );
        bankDto.setCountClients( bank.getCountClients() );
        bankDto.setRating( bank.getRating() );
        bankDto.setTotalMoney( bank.getTotalMoney() );
        bankDto.setInterestRate( bank.getInterestRate() );

        return bankDto;
    }
}
