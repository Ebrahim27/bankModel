package com.eki.ee.realbank.controller;


import com.eki.ee.realbank.domin.account.Account;
import com.eki.ee.realbank.domin.account.AccountInput;
import com.eki.ee.realbank.domin.bankTransaction.BankTransactionInput;
import com.eki.ee.realbank.domin.person.Person;
import com.eki.ee.realbank.domin.person.PersonInput;
import com.eki.ee.realbank.service.person.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/bank")
@Controller
// controller class which makes HTTP (request-respond)  methods
public class PersonController {

    @Autowired
    PersonService personService ;


    //  this method creates person
    @PostMapping(value = "person", headers = "Accept=application/json;charset = UTF-8")
    public ResponseEntity person (
            @RequestBody PersonInput input ) throws Exception {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.personService.createPerson(input));
        }

    //  this method creates account
    @PostMapping(value = "account", headers = "Accept=application/json;charset = UTF-8")
    public ResponseEntity account (
            @RequestBody AccountInput input ) throws Exception {
            return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(this.personService.createAccount(input));
    }

    //  this method creates bank accounts which contains some properties
    @PostMapping(value = "bankTransaction", headers = "Accept=application/json;charset = UTF-8")
    public ResponseEntity bankTransaction (
            @RequestBody BankTransactionInput input ) throws Exception {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.personService.bankTransaction(input));
          }

    //  this method creates deposit action
    @PostMapping(value = "deposit", headers = "Accept=application/json;charset = UTF-8")
    public ResponseEntity deposit (
            @RequestBody BankTransactionInput input ) throws Exception {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(this.personService.deposit(input));
    }

    //  this method creates withdraw action
    @PostMapping(value = "withdraw", headers = "Accept=application/json;charset = UTF-8")
    public ResponseEntity withdraw (
            @RequestBody BankTransactionInput  input ) throws Exception {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(this.personService.withdraw(input));
    }

    //  this method reads bank table and updates account
    @PutMapping(headers = "Accept=application/json;charset = UTF-8")
    public ResponseEntity < Account > bankUpdate (
            @RequestBody AccountInput input ) throws Exception {
        personService.accountUpdate();
        return new ResponseEntity <>(HttpStatus.CREATED);
    }

    //   this method reads bank properties
    @GetMapping(value = "/person", headers = "Accept=application/json;charset = UTF-8")
    public ResponseEntity < Person > getAllPeople () throws Exception {
        return new ResponseEntity(personService.findAllPeople(), HttpStatus.OK);
    }

    //   this method deletes bank accountNumber
    @DeleteMapping(value = "/{accountNumber}", headers = "Accept=application/json;charset=UTF-8")
    public ResponseEntity < HttpStatus > delete ( @PathVariable("accountNumber") Integer accountNumber ) throws Exception {
        personService.deleteAccount(accountNumber);
            return new ResponseEntity(HttpStatus.OK);
      }
  }