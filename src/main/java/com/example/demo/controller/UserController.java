package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.dto.request.UserRequestDTO;

import java.util.List;

//@RestController
//@RequestMapping("/users")


@RestController
@RequestMapping("/users")
public class UserController {
    @PostMapping
    public String addUser(@RequestBody UserRequestDTO userRequestDTO) {
        return "User added";
    }

    @PutMapping("/{userId}")
    public String updateUser(@PathVariable int userId, @RequestBody UserRequestDTO userRequestDTO) {
        return "User updated";
    }

    @PatchMapping("/{userId}")
    public String changeStatus(@PathVariable int userId, @RequestParam(required = false, defaultValue = "false") boolean status) {
        System.out.println(status);
        return "User status changed";
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable int userId) {
        return "User deleted";
    }

    @GetMapping("/{userId}")
    public UserRequestDTO getUser(@PathVariable int userId) {
        return new UserRequestDTO("An", "ne", "0123456789", "pqan@tma.com.vn");
    }

    @GetMapping
    public List<UserRequestDTO> getAllUsers(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int pageSize) {
        return List.of(new UserRequestDTO("An", "ne", "0123456789", "pqan@tma.com.vn"),
                new UserRequestDTO("Hoang", "Pham", "0987456321", "pqhoang@tma.com.vn"));
    }
}
