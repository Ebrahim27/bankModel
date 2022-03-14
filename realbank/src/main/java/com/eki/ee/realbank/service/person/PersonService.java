package com.eki.ee.realbank.service.person;


import com.eki.ee.realbank.domin.account.AccountInput;
import com.eki.ee.realbank.domin.person.Person;
import com.eki.ee.realbank.domin.person.PersonInput;
import com.eki.ee.realbank.domin.bankTransaction.BankTransactionInput;
import org.springframework.http.HttpStatus;
import java.util.List;



public interface PersonService {

    Long createAccount ( AccountInput input  ) throws Exception;

    String createPerson ( PersonInput input) throws Exception;

    Long bankTransaction ( BankTransactionInput input ) throws Exception;

    String accountUpdate () throws Exception;

    List < Person > findAllPeople () throws Exception;

    Integer withdraw (BankTransactionInput input) throws Exception;

    Integer deposit ( BankTransactionInput input ) throws Exception;

    HttpStatus deleteAccount( Integer  accountNumber ) ;


}
