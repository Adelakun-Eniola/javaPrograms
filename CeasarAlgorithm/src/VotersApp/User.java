package VotersApp;

import java.util.Objects;

public class User {
    String name = "";

    public User(String name) {
        this.name = name;
    }

    public static String input(String name){
        return name;
    }

}
