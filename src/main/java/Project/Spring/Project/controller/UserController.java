package Project.Spring.Project.controller;

import Project.Spring.Project.UserService.UserService;
import Project.Spring.Project.models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class UserController {

    @Autowired
   private UserService userservice;

    @GetMapping("/index")
    private String getHome(Model model){
        model.addAttribute("UsersList",userservice.getAllUsers());
        return "index";
    }
    @GetMapping("/")
    private String getEmpty(Model model){
        model.addAttribute("UsersList",userservice.getAllUsers());
        return "home";
    }

    @PostMapping("/saveUsers")
        public String saveUsers(Users users){
        userservice.addUsers(users);
        return ("redirect:/");

    }
   @GetMapping("/getById")
   @ResponseBody
   public Optional<Users> getById(Integer userId){

        userservice.getById(userId);
       return userservice.getById(userId);
   }
   @GetMapping("/delete")
    public String delete(Integer userId) {
        userservice.deleteMe(userId);
        return ("redirect:/");
    }
}

