package com.example.Last.Assignment.Employee;

import org.junit.jupiter.api.Test;

import static com.example.Last.Assignment.Employee.Roles.User;
import static org.assertj.core.api.Assertions.assertThat;

class emloyeeTest {

    @Test
    void employees() {
        Long Id = 1l;
        String FirstName = "NNAMDI";
        String LastName = "OSUOHA";
        String OtherName = "Thomas";
        String Password = "password";
        String Email = "Osuoha@gmail.com";
        Roles Role = User;

        emloyee User = new emloyee(Id,FirstName,LastName,OtherName,Password,Email,Role);



    String First_Name = User.getFirstname();
    String Last_Name = User.getLastname();
    String Other_Name = User.getOthername();
    String email = User.getEmail();
    String password = User.getPassword();
    Roles role = User.getRole();


        assertThat(First_Name).isEqualTo(FirstName);
        assertThat(Last_Name).isEqualTo(LastName);
        assertThat(Other_Name).isEqualTo(OtherName);
        assertThat(email).isEqualTo(Email);
        assertThat(password).isEqualTo(Password);
        assertThat(role).isEqualTo(Role);


    }    }
