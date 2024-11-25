package ua.edu.ucu.apps.task1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.task1.User.UserBuilder;

public class UserTests {
    
    @Test
    public void UserTest() {
        UserBuilder userBuilder = User.builder();
        User user = userBuilder.email("test@test").build();
        assertEquals(user.getEmail(), "test@test");
        user = userBuilder.name("Oleksa").age(31).build();
        assertEquals(user.getName(), "Oleksa");
        assertEquals(user.getAge(), 31);
        assertEquals(user.getEmail(), "test@test");

    }
}
