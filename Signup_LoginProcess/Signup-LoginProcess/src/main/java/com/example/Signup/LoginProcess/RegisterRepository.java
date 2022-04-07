package com.example.Signup.LoginProcess;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegisterRepository {
    List<Register> findAll();

    RegisterService findById(long id);

    void deleteById(long id);

    void save(Register register);

    public interface ProductRepository extends JpaRepository<Register, Long> {
    }
}