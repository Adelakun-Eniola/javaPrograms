package org.example.data.Services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceImplTest {
    @Test
    public void testThatUserCanBeCreated(){
        CreateNewUser newUser = new CreateNewUser();
        newUser.setUserName("John");
        newUser.setPassword("password");

        CreateNewUserResponse response = UserService.createUser(newUser);
        response.setUsername("user created successfully");
        assertEquals(response.getMessage(),"user created successfully");
        assertNotNull(response);
    }
}