package edu.kea.devops.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Julius Panduro
 */
@Controller
public class HtmlController {

    @GetMapping("/")
    public String renderIndex() {
        return "index";
    }
}
