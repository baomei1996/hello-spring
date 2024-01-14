package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// 진입점 @Controller
@Controller
public class HelloController {

    // /hello 로 들어오면 이 메서드를 호출해준다.
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!!");

        return  "hello";
    }

    @GetMapping("hello-mvc")
    public  String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);

        return  "hello-template";
    }

    @GetMapping("hello-api")
    @ResponseBody
    public  String helloApi(@RequestParam("name") String name) {
        return  "hello" + name;
    }

    @GetMapping("hello-api2")
    @ResponseBody
    public  Hello helloApi2(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);

        return hello;
    }

    static class Hello {
        private  String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
