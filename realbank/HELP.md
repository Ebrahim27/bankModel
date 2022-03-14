#Bank Process Application 


This application shows a Bank process , it will save account's information and their Transactions in H2  in-memory Database 
methods to call:

Post  =>    127.0.0.1:8080/api/bank/person                                               this method creates a new person which has name , phone, social code etc .

Post  =>    127.0.0.1:8080/api/bank/person                                              creates a new person
 
Post  =>    127.0.0.1:8080/api/bank/person                                              creates a new person

Post  =>    127.0.0.1:8080/api/bank/account                                            creates new account 

Post  =>    127.0.0.1:8080/api/bank/account                                            creates new account 

Post  =>    127.0.0.1:8080/api/bank/account                                            creates new account 

Post  =>    127.0.0.1:8080/api/bank/bankTransaction                          creates new transaction 

Post  =>    127.0.0.1:8080/api/bank/deposit                                            creates new deposit

Post  =>     127.0.0.1:8080/api/bank/withdraw                                       creates new withdraw

Delete =>  127.0.0.1:8080/api/bank/101010                                           deletes an account

Get   =>    127.0.0.1:8080/api/bank/person                                              this method reads the bank account's


Specification :     Java 8  ,  Spring boot 2.6.3  ,  lombok  , H2 database  ,  Spring web , Java Data JPA , IntelliJ  2020.1

h2  console URL  =>   http://localhost:8080/h2-console    UserName : sa     Password: 36   DatabaseName:  bankdb

Provided By Ebrahim 