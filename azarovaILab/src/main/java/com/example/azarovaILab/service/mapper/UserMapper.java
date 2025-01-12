package com.example.azarovaILab.service.mapper;

import com.example.azarovaILab.dto.UserDto;
import com.example.azarovaILab.entity.Bank;
import com.example.azarovaILab.entity.CreditAccount;
import com.example.azarovaILab.entity.PaymentAccount;
import com.example.azarovaILab.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(source = "banks", target = "bankNames", qualifiedByName = "mapBankNames")
    @Mapping(source = "creditAccounts", target = "creditAccountsId", qualifiedByName = "mapCreditAccountsId")
    @Mapping(source = "paymentAccounts", target = "paymentAccountsId", qualifiedByName = "mapPaymentAccountsId")
    UserDto toDto(User user);

    @Named("mapBankNames")
    default List<String> mapBankNames(List<Bank> banks) {
        if (banks == null) {
            return Collections.emptyList();
        }
        return banks.stream()
                .map(Bank::getName)
                .collect(Collectors.toList());
    }

    @Named("mapCreditAccountsId")
    default List<Long> mapCreditAccountsId(List<CreditAccount> creditAccounts) {
        if (creditAccounts == null) {
            return Collections.emptyList();
        }
        return creditAccounts.stream()
                .map(CreditAccount::getId)
                .collect(Collectors.toList());
    }

    @Named("mapPaymentAccountsId")
    default List<Long> mapPaymentAccountsId(List<PaymentAccount> paymentAccounts) {
        if (paymentAccounts == null) {
            return Collections.emptyList();
        }
        return paymentAccounts.stream()
                .map(PaymentAccount::getId)
                .collect(Collectors.toList());
    }

}