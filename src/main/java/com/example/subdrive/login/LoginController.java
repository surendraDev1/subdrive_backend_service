package com.example.subdrive.login;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import java.security.Principal;
import java.util.Map;

@RestController
@RequestMapping("/subdrive/login")
public class LoginController {

    @GetMapping
    public RedirectView sayHello() {
        // Redirect to the specified URL
        return new RedirectView("http://localhost:3000/home");
    }

//    @GetMapping("/user-info")
//    public ResponseEntity<Map<String, Object>> getUserInfo(Principal principal) {
//        // Retrieve user info from the principal
//        if (principal instanceof OAuth2AuthenticationToken) {
//            OAuth2AuthenticationToken token = (OAuth2AuthenticationToken) principal;
//            Map<String, Object> userDetails = token.getPrincipal().getAttributes();
//            return ResponseEntity.ok(userDetails);
//        }
//        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(null);
//    }


//    @GetMapping
//    public String sayHello() {
//        return "Hello, Welcome to Login page!";
//    }
}
