package com.adademy.ws.datetime.restwsdatetime;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatetimeControler {
    @GetMapping("/datetime")
    public String getCurrentTime() {
        return LocalDateTime.now().toString();
    }
}
