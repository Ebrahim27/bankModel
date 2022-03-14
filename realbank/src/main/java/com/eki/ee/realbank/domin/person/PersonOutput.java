package com.eki.ee.realbank.domin.person;

;
import com.eki.ee.realbank.controller.BaseDto;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
public class PersonOutput extends BaseDto {
    private Long id ;
    private String personName ;
    private String personLastName ;
    private Integer personSocialCode ;
    private String personPhoneNumber ;
    private String personAddress ;



   public PersonOutput ( Long id,
                         String  personName,
                         String personLastName,
                         Integer personSocialCode,
                         String personPhoneNumber ,
                         String personAddress

    ) {
        this.id = id;
        this.personName = personName;
        this.personLastName = personLastName;
        this.personSocialCode = personSocialCode;
        this.personPhoneNumber = personPhoneNumber;
        this.personAddress= personAddress ;

      }
   }

