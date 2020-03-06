package com.ics.service;

import com.ics.model.Address;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class AddressService {
    private Set<Address> addresses = new HashSet<>();

    @PostConstruct
    protected void init(){
        addresses.add(new Address("Ahmad", "Hussain", "Zakir Nagar","Delhi", "Delhi", "India","110025"));
        addresses.add(new Address("Faiz", "Ahmad", "Zakir Nagar","Delhi", "Delhi", "India","110025"));
        addresses.add(new Address("Farhan", "Ahmad", "Zakir Nagar","Delhi", "Delhi", "India","110025"));
        addresses.add(new Address("Shamima", "Khatoon", "Zakir Nagar","Delhi", "Delhi", "India","110025"));
        addresses.add(new Address("Azra", "Shamim", "Zakir Nagar","Delhi", "Delhi", "India","110025"));
        addresses.add(new Address("Bushra", "Aziz", "Zakir Nagar","Delhi", "Delhi", "India","110025"));
        addresses.add(new Address("Rishi", "Datt", "Ravet","Pune", "Maharashtra", "India","210212"));
        addresses.add(new Address("Dhiyan", "Chandra", "Ravet","Pune", "Maharashtra", "India","210212"));
    }

    public Collection<Address> getAll(){
        return addresses;
    }
    public Collection<Address> getByFirstName(String fname){
        return addresses.stream().filter(x -> x.getFirstName().equalsIgnoreCase(fname))
                .collect(Collectors.toSet());
    }
    public Collection<Address> getByLastName(String lname){
        return addresses.stream().filter(x -> x.getLastName().equalsIgnoreCase(lname))
                .collect(Collectors.toSet());
    }
    public Collection<Address> getByLocality(String lname){
        return addresses.stream().filter(x -> x.getLocality().contains(lname))
                .collect(Collectors.toSet());
    }

    public Collection<Address> getByCity(String lname){
        return addresses.stream().filter(x -> x.getCity().equalsIgnoreCase(lname))
                .collect(Collectors.toSet());
    }


}
