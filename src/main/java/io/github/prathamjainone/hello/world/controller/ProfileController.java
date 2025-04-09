package io.github.prathamjainone.hello.world.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfileController {

    @GetMapping("/resume")
    public String resume() {
        return "index"; // means templates/index.html
    }}