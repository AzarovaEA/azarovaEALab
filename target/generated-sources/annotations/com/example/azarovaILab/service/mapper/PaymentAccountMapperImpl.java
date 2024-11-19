package com.example.azarovaILab.service.mapper;

import com.example.azarovaILab.dto.PaymentAccountDto;
import com.example.azarovaILab.entity.Bank;
import com.example.azarovaILab.entity.PaymentAccount;
import com.example.azarovaILab.entity.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-19T10:03:24+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Oracle Corporation)"
)
@Component
public class PaymentAccountMapperImpl implements PaymentAccountMapper {

    @Override
    public PaymentAccountDto toDto(PaymentAccount paymentAccount) {
        if ( paymentAccount == null ) {
            return null;
        }

        PaymentAccountDto paymentAccountDto = new PaymentAccountDto();

        paymentAccountDto.setBankId( paymentAccountBankId( paymentAccount ) );
        paymentAccountDto.setUserId( paymentAccountUserId( paymentAccount ) );
        paymentAccountDto.setId( paymentAccount.getId() );
        paymentAccountDto.setAmount( paymentAccount.getAmount() );

        return paymentAccountDto;
    }

    private Long paymentAccountBankId(PaymentAccount paymentAccount) {
        if ( paymentAccount == null ) {
            return null;
        }
        Bank bank = paymentAccount.getBank();
        if ( bank == null ) {
            return null;
        }
        Long id = bank.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long paymentAccountUserId(PaymentAccount paymentAccount) {
        if ( paymentAccount == null ) {
            return null;
        }
        User user = paymentAccount.getUser();
        if ( user == null ) {
            return null;
        }
        Long id = user.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
