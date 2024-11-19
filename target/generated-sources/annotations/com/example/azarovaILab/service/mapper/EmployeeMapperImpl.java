package com.example.azarovaILab.service.mapper;

import com.example.azarovaILab.dto.EmployeeDto;
import com.example.azarovaILab.entity.Bank;
import com.example.azarovaILab.entity.BankOffice;
import com.example.azarovaILab.entity.Employee;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-19T10:03:24+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.4 (Oracle Corporation)"
)
@Component
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public EmployeeDto toDto(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeDto employeeDto = new EmployeeDto();

        employeeDto.setBankName( employeeBankName( employee ) );
        employeeDto.setOfficeName( employeeOfficeName( employee ) );
        employeeDto.setId( employee.getId() );
        employeeDto.setFullName( employee.getFullName() );
        employeeDto.setBirthDate( employee.getBirthDate() );
        employeeDto.setPosition( employee.getPosition() );
        employeeDto.setIsRemote( employee.getIsRemote() );
        employeeDto.setCanIssueLoans( employee.getCanIssueLoans() );
        employeeDto.setSalary( employee.getSalary() );

        return employeeDto;
    }

    private String employeeBankName(Employee employee) {
        if ( employee == null ) {
            return null;
        }
        Bank bank = employee.getBank();
        if ( bank == null ) {
            return null;
        }
        String name = bank.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String employeeOfficeName(Employee employee) {
        if ( employee == null ) {
            return null;
        }
        BankOffice office = employee.getOffice();
        if ( office == null ) {
            return null;
        }
        String name = office.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }
}
