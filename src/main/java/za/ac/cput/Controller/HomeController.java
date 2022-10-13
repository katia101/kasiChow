package za.ac.cput.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping({"/", "/home", "/index"})
    public String home() {
        System.out.println("Home Page");
        return "home";
    }

    @RequestMapping("/about")
    public String about() {
        System.out.println("About Page");
        return "about";
    }

    @RequestMapping("/contact")
    public String contact() {
        System.out.println("Contact Page");
        return "contact";
    }

    @RequestMapping("/login")
    public String login() {
        System.out.println("Login Page");
        return "login";
    }

    @RequestMapping("/services")
    public String services() {
        System.out.println("Services Page");
        return "services";
    }
}
