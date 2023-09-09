package com.example.Last.Assignment;

import com.example.Last.Assignment.Address.Address;
import com.example.Last.Assignment.Address.AddressService;
import com.example.Last.Assignment.Employee.emloyee;
import com.example.Last.Assignment.Employee.employeeSERVICE;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class Controller {

    private final AddressService service;
    private final employeeSERVICE employeeservice;

    @GetMapping("/all")
    public List<emloyee> FindAll() {
        return employeeservice.FindAllUsers();
    }

   @GetMapping("/search/{email}")
    public ResponseEntity<?> Add_users(@PathVariable("email") String users) {
        String email = employeeservice.findbyEmail(users);
        return new ResponseEntity<>(email, HttpStatus.OK);
    }


    @PostMapping("/add")
    public ResponseEntity<emloyee> Add_users(@RequestBody emloyee users) {
        emloyee New_Users = employeeservice.AddNewUser(users);
        return new ResponseEntity<>(New_Users, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<emloyee> updateCustomer(@RequestBody Long id, emloyee update) throws RuntimeException {
        emloyee Update_User = employeeservice.UpdateDetails(id , update);
        return new ResponseEntity<emloyee>(Update_User, HttpStatus.OK);
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<emloyee> removeCustomerById(@PathVariable("id") Integer Id) throws RuntimeException {
        emloyee Delete_User = employeeservice.DeleteUser(Id);
        return new ResponseEntity<emloyee>(Delete_User , HttpStatus.OK);
    }

    @PostMapping("/address")
    public ResponseEntity<Address> AddUserAddress(@RequestBody Address address) {
        Address New_Address = service.addAddress(address);
        return new ResponseEntity<>(New_Address, HttpStatus.CREATED);
    }

    @GetMapping("/all/address")
    public List<Address> addresses() {
        return service.FindAll();
    }

}
