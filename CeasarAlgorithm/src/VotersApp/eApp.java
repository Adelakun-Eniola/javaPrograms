package VotersApp;

import java.util.ArrayList;
import java.util.List;

public class eApp {
    String name;
    int id;

    private static int numberOfUsers = 0;

    private final List<User> users = new ArrayList<>();


    public User createAccount(int id, String name) {
        User user = new User(name);
        users.add(user);
        numberOfUsers++;
        return user;
    }

    public static int getNumberOfUsers() {
        return numberOfUsers++;
    }


}
