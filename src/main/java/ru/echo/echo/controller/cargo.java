package ru.echo.echo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class cargo {

    @PostMapping("/route")
    public String checkRoute(@RequestBody String string){

        return string;
    }
}
