package ru.echo.echo.controller;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
public class cargo {

    @PostMapping("/route")
    public String checkRoute(@RequestBody String string){

//      log.info("Получено {}", string);
        return string;
    }
}
