package com.springurfu.securityhomework.controller;

import jakarta.annotation.security.RolesAllowed;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {
    @GetMapping("/public/api")
    public String publicApi() {
        return "Доступ для всех";
    }

    @RolesAllowed("admin")
    @GetMapping("/admin/api")
    public String adminApi() {
        return "Доступ только для админов";
    }

    @RolesAllowed("support")
    @GetMapping("/support/api")
    public String supportApi() {
        return "Доступ только для саппортов";
    }
}
