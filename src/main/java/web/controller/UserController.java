package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.Model.User;
import web.Service.UserService;

import java.util.List;


@Controller
@RequestMapping("/")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/users")
    public String findAll(Model model) {
        List<User> users = userService.listUser();
        model.addAttribute("users", users);
        return "pages/user-list";
    }

    @PostMapping("/user-create")
    public String createUserForm(User user) {
        return "pages/user-create";

    }

    @GetMapping("/user-delete/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userService.remove(id);
        return "redirect:/users";

    }

    @GetMapping("user-update/{id}")
    public String updateUserForm(@PathVariable("id") Long id, Model model) {
        User user = userService.getById(id);
        model.addAttribute("user", user);
        return "pages/user-update";
    }

    @GetMapping("/user-update")
    public String updateUser(User user) {
        userService.modify(user);
        return "redirect:/users";
    }
}
