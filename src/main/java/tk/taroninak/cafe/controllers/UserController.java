package tk.taroninak.cafe.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tk.taroninak.cafe.domain.UserDto;
import tk.taroninak.cafe.services.UserService;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ResponseEntity<List<UserDto>> list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size) {
        if (page == null) {
            page = 0;
        }

        if (size == null) {
            size = 10;
        }

        return ResponseEntity.ok(userService.findAllUsers(page, size));
    }

    @RequestMapping(value = "/users/{userId}", method = RequestMethod.GET)
    public ResponseEntity<UserDto> get(@PathVariable Long userId) {
        return ResponseEntity.ok(userService.findUserById(userId));
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public ResponseEntity<UserDto> post(@RequestBody UserDto user) {
        return ResponseEntity.ok(userService.create(user));
    }

    @RequestMapping(value = "/users/{userId}", method = RequestMethod.PUT)
    public ResponseEntity<UserDto> put(@RequestBody UserDto user) {
        return ResponseEntity.ok(userService.create(user));
    }

    @RequestMapping(value = "/users/{userId}", method = RequestMethod.DELETE)
    public ResponseEntity<UserDto> delete(@PathVariable Long userId) {
        return ResponseEntity.ok(userService.delete(userId));
    }
}
