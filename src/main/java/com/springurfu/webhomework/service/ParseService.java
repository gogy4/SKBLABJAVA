package com.springurfu.webhomework.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springurfu.webhomework.entity.Entity;
import com.springurfu.webhomework.exception.CustomException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParseService {

    private static final Logger logger = LoggerFactory.getLogger(ParseService.class);

    private final ObjectMapper objectMapper;

    @Autowired
    public ParseService(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public Entity parse(String json) {
        try {
            return objectMapper.readValue(json, Entity.class);
        } catch (JsonProcessingException e) {
            logger.error("Error parsing JSON: {}", json, e);
            throw new CustomException(e);
        }
    }
}
