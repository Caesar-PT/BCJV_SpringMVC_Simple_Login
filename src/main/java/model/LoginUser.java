package model;

public class LoginUser {
    private String account;
    private String password;

    public LoginUser(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public LoginUser() {
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
