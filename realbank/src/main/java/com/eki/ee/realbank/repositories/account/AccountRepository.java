package com.eki.ee.realbank.repositories.account;

import com.eki.ee.realbank.domin.account.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;



@Repository
public interface AccountRepository extends JpaRepository < Account , Long  >, JpaSpecificationExecutor < Account > {

    List < Account > findAll ();

    List < Account > findAccountIdByAccountNumber ( @Param("accountNumber") Integer accountNumber );
    Optional < Account > findByAccountNumber ( Integer accountNumber );


    List < Account > deleteAccountIdByAccountNumber( @Param("accountNumber") Integer accountNumber );
    void  deleteByAccountNumber( Integer accountNumber );

}






