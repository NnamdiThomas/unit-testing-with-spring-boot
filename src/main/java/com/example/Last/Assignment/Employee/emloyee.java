package com.example.Last.Assignment.Employee;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name = "person")
public class emloyee {
        @Id
        @SequenceGenerator(
                name = "person_sequence",
                sequenceName = "person_sequence",
                allocationSize = 1
        )
        @GeneratedValue(
                strategy = GenerationType.SEQUENCE,
                generator = "person_sequence")

        private  Long id;
        private  String firstname;
        private  String lastname;
        private  String othername;
        private  String password;
        private  String email;
        private Roles role;
//        private  int age;
//        private  String sex;


    }
