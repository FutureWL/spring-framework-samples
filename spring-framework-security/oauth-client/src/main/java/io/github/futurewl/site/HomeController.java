package io.github.futurewl.site;

import io.github.futurewl.config.annotation.WebController;
import org.springframework.web.bind.annotation.RequestMapping;

@WebController
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
