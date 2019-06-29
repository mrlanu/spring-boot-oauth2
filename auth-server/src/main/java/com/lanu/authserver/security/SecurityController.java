package com.lanu.authserver.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;

@RestController
public class SecurityController {

    @Autowired
    private UserService userService;

    @RequestMapping("/validateUser")
    public Principal user(Principal user) {
        return user;
    }

    @PostMapping("/signup")
    public User registerUser(@Valid @RequestBody User user) {
        return userService.createUser(user);
    }

    /*@PostMapping("/checkPass")
    public boolean checkPassword(@RequestBody String pass, Principal principal){
        User user = userService.findByUsername(principal.getName()).get();
        return userService.checkPassword(pass, user);
    }*/

    /*@GetMapping("/user")
    public User getLoggedInUser(Principal principal){
        return userService.findByUsername(principal.getName()).get();
    }*/
}
