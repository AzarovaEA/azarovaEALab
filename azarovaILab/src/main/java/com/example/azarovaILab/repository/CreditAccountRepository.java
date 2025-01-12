package com.example.azarovaILab.repository;

import com.example.azarovaILab.entity.CreditAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditAccountRepository extends JpaRepository<CreditAccount, Long> {
}
