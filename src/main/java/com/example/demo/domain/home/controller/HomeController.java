package com.example.demo.domain.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody // 메서드의 리턴 값을 브라우저에 보여준다.
    public String home() {
    return "hello";
}
@GetMapping("/introduce")
@ResponseBody
public String introduce(){
        return "안녕하세요. 저는 홍길동입니다.";
}


}
