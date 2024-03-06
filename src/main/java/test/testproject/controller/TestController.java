package test.testproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("testfile") // html 파일명
    public String controller(Model model) {
        model.addAttribute("data", "테스트 중"); // html의 값과 들어갈 값의 내용
        return "testfile"; // html 파일명
    }
}
/*         */