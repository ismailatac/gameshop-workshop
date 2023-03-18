package org.turkcell;

public class Admin extends User {
    private String telNum;

    public Admin(int id, String identityNumber, String firstName, String lastName, int birthYear, String telNum) {
        super(id, identityNumber, firstName, lastName, birthYear);
        this.telNum = telNum;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }
}
