package net.iretailer.env.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by yuanzhuang on 24/1/16.
 */

@Controller
@RequestMapping("/welcome")
public class WelcomeController{

    @RequestMapping(value="/index", method= RequestMethod.GET)
    public String index(Model model) {
        // do nothing with the model
        return "welcomeIndex";
    }
}
