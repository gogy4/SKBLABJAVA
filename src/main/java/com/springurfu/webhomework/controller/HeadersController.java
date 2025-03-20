package com.springurfu.webhomework.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HeadersController {
    @GetMapping("/headers")
    public Map<String, String> getData(@RequestHeader Map<String, String> headers) {
        return headers;
    }
}