package ru.itgirl.springproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FirstController {
@GetMapping("/dayOfWeek/name")
public String weekTag(@RequestParam String day) {
    try {
        DayOfWeek weekTag = DayOfWeek.valueOf(day.toUpperCase());
        return weekTag.getTranslate();
    } catch (IllegalArgumentException e){
        return "Error";
    }

}
}
