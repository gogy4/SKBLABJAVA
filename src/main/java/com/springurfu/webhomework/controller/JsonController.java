package com.springurfu.webhomework.controller;

import com.springurfu.webhomework.entity.Entity;
import com.springurfu.webhomework.service.ParseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {
    @Autowired
    private ParseService parseService;

    @PostMapping("/processJson")
    public ResponseEntity<Entity> post(@RequestBody String payload) {
        Entity entity = parseService.parse(payload);
        entity.setInfoId(123);
        return new ResponseEntity<>(entity, HttpStatus.OK);
    }
}