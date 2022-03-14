package com.eki.ee.realbank.domin.person;

import lombok.Data;


@Data
public class PersonInput {
    private Long id ;
    private String personName ;
    private String personLastName ;
    private Integer personSocialCode ;
    private String personPhoneNumber ;
    private String personAddress ;

}
