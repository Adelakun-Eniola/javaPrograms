package VotersApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class eAppTest {

    @Test
    public void testThatUsersCanVote(){
        eApp app = new eApp();
        User user = app.createAccount(1, "Eniola");
        int numberOfUsers = eApp.getNumberOfUsers();
        assertEquals(1, numberOfUsers);
    }


}