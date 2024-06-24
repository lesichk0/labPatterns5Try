package org.example;

public class UserContactInfo {
    private String username;
    private String email;

    public UserContactInfo(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}
