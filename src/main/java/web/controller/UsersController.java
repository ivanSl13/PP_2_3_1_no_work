package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.UsersService;

@Controller
public class UsersController {

    private final UsersService usersService;
    @Autowired
    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }


    @GetMapping("/")
    public String getAllUsers(Model model) {
        model.addAttribute("users", usersService.getAllUsers());
        return "users";
    }
}
