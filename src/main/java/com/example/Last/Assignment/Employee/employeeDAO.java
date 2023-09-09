package com.example.Last.Assignment.Employee;

import com.example.Last.Assignment.Exception.UserExceptions;


import java.util.List;

public interface employeeDAO {

    public List<emloyee> FindAllUsers() throws UserExceptions;

    public emloyee AddNewUser(emloyee add) throws UserExceptions;

    public emloyee UpdateDetails(Long id, emloyee update) throws UserExceptions;

    public emloyee DeleteUser (Integer id) throws UserExceptions;
}
