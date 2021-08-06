package net.dashcom.ecommerce;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping(value = {"/"})
    public String home(Model model) {
        String subtext = "in style with mustache";
        model.addAttribute("message", subtext);

        return "index";
    }
}