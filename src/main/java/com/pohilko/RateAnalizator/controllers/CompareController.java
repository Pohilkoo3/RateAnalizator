package com.pohilko.RateAnalizator.controllers;

import com.pohilko.RateAnalizator.services.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CompareController {
    private final Request request;

    @Autowired
    public CompareController(Request request) {
        this.request = request;
    }

    @GetMapping("/compare/yesterday")
    public String getCompare(Model model) {
        model.addAttribute("answer", request.getRequest());
        return "compare-page";
    }

}
