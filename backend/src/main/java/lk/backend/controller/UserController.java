package lk.backend.controller;

import lk.backend.entity.User;
import lk.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/login")
    public ResponseEntity login(@RequestBody User user) {
        return ResponseEntity.ok(userService.login(user));
    }

    @PostMapping(value = "/signUp")
    public ResponseEntity signUp(@RequestBody User user) {
        return ResponseEntity.ok(userService.signUp(user));
    }

}