package VotersApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    User user = new User("Eniola");
    @Test
    public void testThatUserAccountIsCreated(){
        String name = "";
        String expected = User.input(name);
        String result  = "";
        assertEquals(expected, "");
    }


}