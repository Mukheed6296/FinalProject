package com.example.Signup.LoginProcess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional

public class RegisterService {
    @Autowired
    private RegisterRepository repo;

    public List<Register> listAll() {
        return repo.findAll();    }

    public void save(Register register) {
        repo.save(register);
    }

    public RegisterService get(long id) {
        return repo.findById(id);
    }

    public void delete(long id) {
        repo.deleteById(id);
    }
}
