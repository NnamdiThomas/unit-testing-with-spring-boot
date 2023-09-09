package com.example.Last.Assignment.Address;

import com.example.Last.Assignment.Exception.AddressException;


import java.util.List;

public interface AddressDAO {

    public List <Address> FindAll() throws AddressException;

    public Address addAddress(Address Item) throws  AddressException;

    public Address UpdateAddress (Long id, Address Update) throws AddressException;

}
