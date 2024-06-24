package org.example;
import java.util.ArrayList;

public class UserListProcessor {
    private ArrayList<User> users;

    public UserListProcessor(ArrayList<User> users) {
        this.users = users;
    }

    public void processUserList() {
        for (User user : users) {
            processUser(user);
        }
    }

    private void processUser(User user) {
        System.out.println("Processing user: " + user.getUsername());
        if (user.getUsername().contains("admin")) {
            System.out.println("Admin user detected!");
        }
    }

    public AdminCount countAdminUsers() {
        AdminCount adminCount = new AdminCount();
        for (User user : users) {
            if (user.getUsername().contains("admin")) {
                adminCount.increment();
            }
        }
        return adminCount;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void sendEmailToUser(UserContactInfo contactInfo) {
        System.out.println("Sending email to " + contactInfo.getUsername() + " at " + contactInfo.getEmail());
    }

    public User findUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
}
