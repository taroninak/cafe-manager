package tk.taroninak.cafe.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import tk.taroninak.cafe.domain.UserDto;
import tk.taroninak.cafe.models.User;
import tk.taroninak.cafe.repository.UserRepository;

import java.util.List;

import static tk.taroninak.cafe.util.Security.hashPassword;

public class UserService {
    @Autowired
    private UserRepository userRepository;

    private User toUser(UserDto userDto) {
        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());

        if (userDto.getRole() != null) {
            user.setRole(User.Role.valueOf(userDto.getRole().toUpperCase()));
        }

        if (userDto.getId() != null) {
            user.setId(userDto.getId());
        }


        return user;

    }

    private UserDto toUserDto(User user) {
        return new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getRole().name(),
                user.getEmail()
        );
    }

    public UserDto create(UserDto userDto) {
        User user = toUser(userDto);
        user.setPassword(hashPassword(userDto.getPassword()));

        return toUserDto(userRepository.save(user));
    }

    public UserDto update(UserDto userDto) {
        if (userDto.getId() == null) {
            return create(userDto);
        }
        User user = userRepository.findOne(userDto.getId());
        if (userDto.getEmail() != null) {
            user.setEmail(userDto.getEmail());
        }
        if (userDto.getFirstName() == null) {
            user.setFirstName(userDto.getFirstName());
        }
        if (userDto.getLastName() != null) {
            user.setLastName(userDto.getLastName());
        }
        if (userDto.getPassword() != null) {
            user.setPassword(hashPassword(userDto.getPassword()));
        }

        return userDto;
    }

    public UserDto delete(Long id) {
        User user = userRepository.findOne(id);
        userRepository.delete(user.getId());
        return toUserDto(user);
    }

    public List<UserDto> findAllUsers(int page, int size) {
        return userRepository
                .findAll(new PageRequest(page, size))
                .map(this::toUserDto).getContent();
    }

    public UserDto findUserById(long id) {
        return toUserDto(userRepository.findOne(id));
    }

}
