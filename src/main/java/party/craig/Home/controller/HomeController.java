package party.craig.Home.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import party.craig.Home.model.User;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HomeController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/user")
    public User user(@RequestParam(value = "name", defaultValue = "User") String name) {
        return new User(counter.incrementAndGet(), name);
    }

    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }
}
