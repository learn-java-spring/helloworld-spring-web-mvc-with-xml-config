package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GeneralController {
    @RequestMapping("/hello")
    public @ResponseBody String index() {
        return "Hello, world!!!";
    }
}
