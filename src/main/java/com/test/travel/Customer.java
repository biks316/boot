package com.test.travel;

public class Customer {

    private String customerId;
    private Name name;
    private String dateOfBirth;
    private String gender;
    private Contact contact;
    private Address address;
    private Identification identification;
    private Preferences preferences;

    public Customer() {  }

    public Customer(String customerId, Name name, String dateOfBirth, String gender,
                    Contact contact, Address address, Identification identification,
                    Preferences preferences) {
        this.customerId = customerId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.contact = contact;
        this.address = address;
        this.identification = identification;
        this.preferences = preferences;
    }

    // Getters and Setters

    public String getCustomerId() { return customerId; }
    public void setCustomerId(String customerId) { this.customerId = customerId; }

    public Name getName() { return name; }
    public void setName(Name name) { this.name = name; }

    public String getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public Contact getContact() { return contact; }
    public void setContact(Contact contact) { this.contact = contact; }

    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }

    public Identification getIdentification() { return identification; }
    public void setIdentification(Identification identification) { this.identification = identification; }

    public Preferences getPreferences() { return preferences; }
    public void setPreferences(Preferences preferences) { this.preferences = preferences; }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", name=" + name +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", contact=" + contact +
                ", address=" + address +
                ", identification=" + identification +
                ", preferences=" + preferences +
                '}';
    }
}
