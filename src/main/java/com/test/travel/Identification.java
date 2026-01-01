package com.test.travel;

public class Identification {

    private String type;
    private String number;
    private String issuedDate;
    private String expiryDate;

    public Identification() {}

    public Identification(String type, String number, String issuedDate, String expiryDate) {
        this.type = type;
        this.number = number;
        this.issuedDate = issuedDate;
        this.expiryDate = expiryDate;
    }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }

    public String getIssuedDate() { return issuedDate; }
    public void setIssuedDate(String issuedDate) { this.issuedDate = issuedDate; }

    public String getExpiryDate() { return expiryDate; }
    public void setExpiryDate(String expiryDate) { this.expiryDate = expiryDate; }

    @Override
    public String toString() {
        return type + " (" + number + ")";
    }
}
