package org.example;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        UserListProcessor processor = new UserListProcessor(users);

        User user1 = new User("adminJohn", "admin@example.com", "adminpass", "123 Admin St");
        User user2 = new User("userJane", "jane@example.com", "userpass", "456 User Rd");
        
        processor.addUser(user1);
        processor.addUser(user2);

        User foundUser = processor.findUserByUsername("userJane");
        if (foundUser != null) {
            System.out.println("User found: " + foundUser.getUsername());
        } else {
            System.out.println("User not found");
        }
    }
}