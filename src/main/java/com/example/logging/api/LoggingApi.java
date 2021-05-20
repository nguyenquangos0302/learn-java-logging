package com.example.logging.api;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/log")
public class LoggingApi {

    static Logger LOGGER = Logger.getLogger(LoggingApi.class);

    @GetMapping("")
    public ResponseEntity<String> getLog() {
        LOGGER.info("[registrationUser] --> execute");
        return new ResponseEntity<String>("logger", HttpStatus.OK);
    }


}
