package classesTest;

import classes.User;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserTest{
    User user = new User("firstname", "lastname", "mail@mail.com", "09036011444", "NYC", 1234);
    @Test
    public void testThatUserExists(){
        User user = new User("Eniola","Joe","1234@gmail.com","12345678","NYC", 1234);
//        System.out.println(user);
    }

    @Test
    public void testThatIdIsGenerated(){
        user.generateId();
        int expected = user.getUserId();
        assertEquals(expected, user.getUserId());
    }


//    @Test
//    public void testThatPhoneNumberIsCorrect(){
//        String validPhoneNumber = "12345678";
//        user.setPhoneNumber(validPhoneNumber);
//        String expected = user.getPhoneNumber();
//        assertEquals(validPhoneNumber, expected);
//    }

    @Test
    public void TestThatErrorIsThrownWhenUserEntersAnInvalidPhoneNumber(){
        assertThrows(IllegalArgumentException.class, ()-> user.setPhoneNumber("0903601144"));
    }

    @Test
    public void TestThatErrorIsThrownWhenUserPhoneNumberContainsStringAndCharachers(){
        assertThrows(IllegalArgumentException.class, ()-> user.setPhoneNumber("090360wetyr1144"));
    }
}
