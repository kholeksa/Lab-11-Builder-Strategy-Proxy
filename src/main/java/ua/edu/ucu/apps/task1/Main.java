package ua.edu.ucu.apps.task1;

import ua.edu.ucu.apps.task1.User.UserBuilder;

public class Main {
    public static void main(String[] args) {
        UserBuilder userBuilder = User.builder();
        User user = userBuilder.name("Oleksa").email("...@ucu.edu.ua").build();
        System.out.println(user);

    }
}
