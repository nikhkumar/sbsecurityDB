package com.learn.sbsecuritydb.resource;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestResource {

    @GetMapping("/hello")
    public String hello() {
        return "Hello world";
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/secured/hello")
    public String securedHello() {
        return "Secured Hello World";
    }

    @GetMapping("/secured/alternate")
    public String alternate() {
        return "alternate";
    }
}