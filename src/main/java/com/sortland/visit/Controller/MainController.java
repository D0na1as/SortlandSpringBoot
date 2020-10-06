package com.sortland.visit.Controller;

import com.sortland.visit.Model.Message;
import com.sortland.visit.Service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @Autowired
    MessageService itemService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Message message, Model model)  {
        System.out.println("Hi");
        itemService.addItem(message);
        return "redirect:/#Contact";

    }
}

