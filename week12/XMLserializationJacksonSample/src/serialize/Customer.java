package serialize;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.Arrays;

@JacksonXmlRootElement(localName = "customer")
class Customer {

    @JacksonXmlProperty(localName = "id")
    private int id;
    @JacksonXmlProperty(localName = "name")
    private String  name;

    @JacksonXmlProperty(localName = "addresses")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Address[] address;

    public Customer(int id, String name, Address[] address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Customer() {
    }

    // you can add it on getter method instead of declaration.
    @JacksonXmlElementWrapper(useWrapping = false)
    public Address[] getAddress(){
        return address;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + Arrays.toString(address) +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }
//getters, setters, toString
}

class Address {

    @JacksonXmlProperty(localName = "city")
    private String city;

    @JacksonXmlProperty(localName = "state")
    private String state;
    // getter/setter

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}