package com.example.Last.Assignment.Address;

import com.example.Last.Assignment.Exception.AddressException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AddressService implements  AddressDAO{

    private final AddressRepo repo;

    @Override
    public List<Address> FindAll() throws AddressException {
        List<Address> listOfAddress = repo.findAll();
        return listOfAddress;
    }

    @Override
    public Address addAddress(Address Item) throws AddressException {
        Address addAddress = repo.save(Item);
        return addAddress;
    }

    @Override
    public Address UpdateAddress(Long id, Address Update) throws AddressException {

        Optional<Address> findAddress = repo.findById(id);
        if (findAddress.isPresent()){
            return repo.save(Update);
        }else {
            throw new AddressException("Address Not Found");
        }
    }
/*
    @Override
    public Address deleteAddress(Long id) throws AddressException {
        Address deleteAddress = repo.DeleteById(id).orElseThrow(() -> new AddressException("Address Not Found"));
        return deleteAddress;
    }*/
}
