package com.elapsedevelopment.thuto_yama_temo_thou;

public class UserHelper {

    String FullName;
    String FullEmail;
    String FullNumber;
    String FullPassword;

    public UserHelper() {

    }

    public UserHelper(String fullName, String fullEmail, String fullNumber, String fullPassword) {
        FullName = fullName;
        FullEmail = fullEmail;
        FullNumber = fullNumber;
        FullPassword = fullPassword;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getFullEmail() {
        return FullEmail;
    }

    public void setFullEmail(String fullEmail) {
        FullEmail = fullEmail;
    }

    public String getFullNumber() {
        return FullNumber;
    }

    public void setFullNumber(String fullNumber) {
        FullNumber = fullNumber;
    }

    public String getFullPassword() {
        return FullPassword;
    }

    public void setFullPassword(String fullPassword) {
        FullPassword = fullPassword;
    }
}
