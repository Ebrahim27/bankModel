package com.eki.ee.realbank.controller;



import lombok.Data;
import java.util.Date;

@Data
public class BaseDto {
   private static final long serialVersionUID = 1L;

   private Long     id ;
   private String   personName ;
   private String   personLastName ;
   private Integer  personSocialCode ;
   private String   personPhoneNumber ;
   private String   personAddress ;

   private Integer  fromAccountNumber ;
   private Integer  toAccountNumber ;
   private Integer  transferMoneyAmount ;
   private Integer  depositAmount ;
   private Integer  withdrawAmount ;
   private Date     date ;

   private Long     person ;
   private Integer  accountNumber ;
   private Integer  accountBalanceAmount;
   private Double   accountInterestRate ;
   private String   accountType  ;
   private Date     createdAt ;

   public BaseDto (){}
}
