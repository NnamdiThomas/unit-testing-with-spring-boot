package com.example.Last.Assignment.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface employeeREPO extends JpaRepository<emloyee, Long> {


    Optional<emloyee> findByEmail(String email);

    Optional<emloyee> findByPassword(String password);
    Optional<emloyee> findByEmailAndPassword(String email, String password);
}
