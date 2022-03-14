package com.eki.ee.realbank.domin.account;


import com.eki.ee.realbank.controller.BaseDto;
import com.eki.ee.realbank.domin.person.Person;
import com.eki.ee.realbank.domin.person.PersonOutput;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Data
public class AccountOutput extends BaseDto {

    private Long      id ;
    private Integer   accountNumber ;
    private Integer   accountBalanceAmount;
    private Double    accountInterestRate ;
    private String    accountType  ;
    private Date      createdAt ;
    private List < Account > accounts ;
    private PersonOutput personOutput ;


    public AccountOutput (Long id ,
                          Integer accountNumber,
                          Integer accountBalanceAmount ,
                          Double  accountInterestRate ,
                          String  accountType ,
                          Person  person ,
                          Date  createdAt
    ) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.accountBalanceAmount = accountBalanceAmount;
        this.accountInterestRate = accountInterestRate;
        this.accountType = accountType;
        this.createdAt = createdAt ;
        this.personOutput = person.toDto();
       }
   }

