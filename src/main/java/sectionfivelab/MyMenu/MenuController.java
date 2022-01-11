package sectionfivelab.MyMenu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {

    private final StatusService statusService;

    public MenuController(StatusService statusService) {
        this.statusService = statusService;
    }

    @GetMapping("/arrival")
    public String sayWelcome () {
        return "springfundamentals/welcome";
    }

    @GetMapping("/departure")
    public String sayGoodbye () {
        return "springfundamentals/goodbye";
    }
}
