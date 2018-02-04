package tk.taroninak.cafe.services;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.taroninak.cafe.domain.UserDto;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Autowired
    UserService userService;

    @Test
    public void createShouldNotReturnPassword() {
        UserDto userDto = new UserDto(10L, "first", "last", "WAITER", "testing@test.com");
        userDto.setPassword("pass");
        Assert.assertNull("Should not return password", userService.create(userDto).getPassword());
    }

    @Test
    public void createShouldReturnGeneratedId() {
        UserDto userDto = new UserDto(null, "first", "last", "WAITER", "testing@test.com");
        userDto.setPassword("pass");
        Assert.assertNotNull("Should generate id", userService.create(userDto).getId());
    }

    @Test
    public void createShouldReturnAppropriateRole() {
        UserDto userDto = new UserDto(10L, "first", "last", "WAITER", "testing@test.com");
        userDto.setPassword("pass");
        Assert.assertEquals("Should return right role", userService.create(userDto).getRole(), "WAITER");
    }
}
