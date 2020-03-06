package com.ics.endpoints;

import com.ics.model.Address;
import com.ics.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/address")
public class AddressEndPoint {
    @Autowired
    private AddressService service;

    @GetMapping
    public Collection<Address> get(@RequestParam(value = "filterBy", required = false, defaultValue ="none" ) String filterBy, @RequestParam(value = "value", required = false) String value){
        switch(filterBy){
            case "firstName":{
                return service.getByFirstName(value);
            }
            case "lastName":{
                return service.getByLastName(value);
            }
            case "locality":{
                return service.getByLocality(value);
            }
            case "city":{
                return service.getByCity(value);
            }
            default:
                return service.getAll();
        }

    }

}
