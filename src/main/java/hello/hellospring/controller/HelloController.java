package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// 진입점 @Controller
@Controller
public class HelloController {

    // /hello 로 들어오면 이 메서드를 호출해준다.
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!!");

        return  "hello";
    }
}