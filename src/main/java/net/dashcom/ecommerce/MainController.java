package net.dashcom.ecommerce;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

@Controller
public class MainController {

    @RequestMapping("/")
    public String home(Model model) {
        String helloworld = "in style with mustache";
        model.addAttribute("message", helloworld);

        return "index.mustache";
    }
}