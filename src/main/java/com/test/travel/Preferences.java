package com.test.travel;

public class Preferences {

    private String language;
    private String contactMethod;
    private boolean marketingOptIn;

    public Preferences() {}

    public Preferences(String language, String contactMethod, boolean marketingOptIn) {
        this.language = language;
        this.contactMethod = contactMethod;
        this.marketingOptIn = marketingOptIn;
    }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }

    public String getContactMethod() { return contactMethod; }
    public void setContactMethod(String contactMethod) { this.contactMethod = contactMethod; }

    public boolean isMarketingOptIn() { return marketingOptIn; }
    public void setMarketingOptIn(boolean marketingOptIn) { this.marketingOptIn = marketingOptIn; }

    @Override
    public String toString() {
        return "Preferences{" +
                "language='" + language + '\'' +
                ", contactMethod='" + contactMethod + '\'' +
                ", marketingOptIn=" + marketingOptIn +
                '}';
    }
}

