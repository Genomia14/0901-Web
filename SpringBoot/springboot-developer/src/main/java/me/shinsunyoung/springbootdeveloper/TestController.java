package me.shinsunyoung.springbootdeveloper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {
    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/test2")
    public List<Member> test2() {
        List<Member> members = testService.getAllMembers();
        return members;
    }

    @GetMapping("/test")
    public String test() {
        return "Hello, world";
    }


}
