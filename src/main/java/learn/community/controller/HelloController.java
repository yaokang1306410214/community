package learn.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/helloCity")
    public String helloCity(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("name", name);
        return "hellocity";
    }

}
