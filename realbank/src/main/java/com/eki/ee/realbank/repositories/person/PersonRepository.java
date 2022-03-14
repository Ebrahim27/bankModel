package com.eki.ee.realbank.repositories.person;

import com.eki.ee.realbank.domin.person.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;



@Repository
public interface PersonRepository extends JpaRepository < Person, Long  >, JpaSpecificationExecutor < Person > {


    List < Person > findAll ();

    List < Person > findPersonIdById ( @Param("id") Long id );
    Optional < Person > findById ( Long id  );


}






