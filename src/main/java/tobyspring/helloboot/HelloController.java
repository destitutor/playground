package tobyspring.helloboot;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Objects;

@Controller
@RequestMapping
public class HelloController {
    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService; // 주석을 달아보겠습니다
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello(String name) {
        if (name == null || name.trim().length() == 0)
            throw new IllegalArgumentException();
        return helloService.sayHello(Objects.requireNonNull(name));
    }
}
