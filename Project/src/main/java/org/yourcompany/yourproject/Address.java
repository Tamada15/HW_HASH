package org.yourcompany.yourproject;

import java.util.Objects;

public class Address {

    public String country;
    public String city;

    public Address(String country, String city) {
        this.country = country;
        this.city = city;
    }

    public Address() {
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, city);
    }

    @Override
    public boolean equals(Object obj) {
        Address o = (Address) obj;
        return this.country.equals(o.country) && this.city.equals(o.city);
    }

}
