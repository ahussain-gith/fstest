package com.ics.model;


public class Address {

    private String firstName;
    private String lastName;
    private String locality;
    private String city;
    private String state;
    private String country;
    private String zip;

    public Address() {
        super();
    }

    public Address(String fName, String lName, String locality, String city, String state, String country, String zip) {
        this.firstName = fName;
        this.lastName = lName;
        this.locality = locality;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zip = zip;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (!firstName.equals(address.firstName)) return false;
        if (!lastName.equals(address.lastName)) return false;
        if (!locality.equals(address.locality)) return false;
        if (!city.equals(address.city)) return false;
        if (!country.equals(address.country)) return false;
        return zip.equals(address.zip);
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + locality.hashCode();
        result = 31 * result + city.hashCode();
        result = 31 * result + country.hashCode();
        result = 31 * result + zip.hashCode();
        return result;
    }
}
