package com.example.login;

public class User {
    private int UserID;
    private String Account, Password;


    public User() {
    }

    public User(int userID, String account, String gmail, String password) {
        UserID = userID;
        Account = account;

        Password = password;

    }

    public User(String account, String gmail, String password) {
        Account = account;
        Password = password;

    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }





    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }



    public String getAccount() {
        return Account;
    }

    public void setAccount(String account) {
        Account = account;
    }

    //create to commit, nothing to do
    public void JustTest(){};
}
