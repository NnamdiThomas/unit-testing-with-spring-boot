package com.example.Last.Assignment.Employee;

import com.example.Last.Assignment.Exception.UserExceptions;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
@RequiredArgsConstructor
public class employeeSERVICE implements employeeDAO {

    private final employeeREPO inter;

   // private final PasswordEncoder bCryptPasswordEncoder;

    @Override
    public List<emloyee> FindAllUsers() throws UserExceptions{
        List<emloyee> FindAll = inter.findAll();
        return FindAll;
    }

    @Override
    public emloyee AddNewUser(emloyee add) throws UserExceptions {

        boolean EmailExist = inter.findByEmail(add.getEmail()).isPresent();
        if (EmailExist){
            throw  new RuntimeException("EMAIL ALREADY TAKEN");
        }
        emloyee New = inter.save(add);
        log.info("User {} Has Been Added "+ add);
        if (New != null){
            return New;}
        else {
            throw  new RuntimeException("NO CUSTOMER ADDED");
        }    }

    @Override
    public emloyee UpdateDetails(Long id, emloyee update) throws UserExceptions {

        emloyee Update = inter.findById(update.getId()).orElseThrow(() -> new RuntimeException("NO CUSTOMER IN DATABASE"));
        if (Update != null) {
            emloyee customer = new emloyee();
            inter.save(Update);
            return Update;
        } else throw new RuntimeException("WRONG INPUT");

    }

    @Override
    public emloyee DeleteUser(Integer id) throws UserExceptions {
        inter.deleteById(id);
        return null;
    }

    public String findbyEmail(String email){
        emloyee finds = inter.findByEmail(email).orElseThrow(()-> new RuntimeException("No Email Found in the DataBase"));
        if (finds != null){
            return "Email is Present";
        }
        else {
            throw new RuntimeException("No Email Found");
        }
    }
}
