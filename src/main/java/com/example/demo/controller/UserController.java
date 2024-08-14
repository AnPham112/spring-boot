package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.dto.request.UserRequestDTO;

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
    public String changeStatus(@PathVariable int userId, @RequestParam(required = false) boolean status) {
        System.out.println(status);
        return "User status changed";
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable int userId) {
        return "User deleted";
    }
}
