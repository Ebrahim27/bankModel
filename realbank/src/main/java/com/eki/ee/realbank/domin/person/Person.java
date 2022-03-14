package com.eki.ee.realbank.domin.person;


import com.eki.ee.realbank.domin.account.Account;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@NoArgsConstructor
@Entity
@Data
@Table(name = "PERSON" )
public class Person {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "SEQ_PERSON")
    @SequenceGenerator(name = "SEQ_PERSON", sequenceName = "SEQ_PERSON", allocationSize = 1)
    private long id;

    @Column(name = "PERSON_NAME")
    private String personName;

    @Column(name = "PERSON_LAST_NAME")
    private String personLastName;

    @Column(name = "PERSON_SOCIAL_CODE" )
    private Integer personSocialCode ;

    @Column(name = "PERSON_PHONE_NUMBER")
    private String personPhoneNumber ;

    @Column(name = "PERSON_ADDRESS")
    private String personAddress ;

    @OneToMany( fetch = FetchType.LAZY , mappedBy = "person")
    private List < Account > accounts = new ArrayList <>();


    public PersonOutput toDto (){
        PersonOutput output = new PersonOutput();
        output.setId(id);
        output.setPersonName(personName);
        output.setPersonLastName(personLastName);
        output.setPersonSocialCode(personSocialCode) ;
        output.setPersonPhoneNumber(personPhoneNumber ) ;
        output.setPersonAddress(personAddress) ;
        return output;
      }


      public Person fromDto ( PersonInput input ){
         Person person = new Person();
          person.setId(input.getId());
          person.setPersonName(input.getPersonName());
          person.setPersonLastName(input.getPersonLastName());
          person.setPersonSocialCode(input.getPersonSocialCode());
          person.setPersonPhoneNumber(input.getPersonPhoneNumber());
          person.setPersonAddress(input.getPersonAddress());
         return person ;
        }
   }



