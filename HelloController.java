package com.example.Kopoproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // @ =  에너테이션 - 일종의 메타데이터
public class HelloController {

    // AddCalc  : camel (앞문자 대문자)
    // add_calc : snake (_ 사용하기)
    // 변수는 직관적으로 이해 가능한 언어를 활용 (리팩토링 힘들어짐)
    // 리팩토링 - 새로운 라이브러리 또는 기능적으로 분리 및 병합이 필요할 때 수행하는 코드 변경의 일환

    @GetMapping("/hello")   // url 요청 받는 주소
    // localhost:8080/hello
    public String hello(Model model) {  // 변수명은 상관없음
        model.addAttribute("username", "개똥이");
        // 머스테치를 호출하는 방법
        // 리턴 시 파일명을 넘겨준다
        return "hello";     // hello.mustache 반환
    }

    @GetMapping("/seeyou")
    // 머스테치를 호출하는 방법

    public String seeyou(Model model) {  // 변수명은 상관없음
        model.addAttribute("username", "개똥이");
        // 리턴 시 파일명을 넘겨준다
        return "seeyou";     // seeyou.mustache 반환
    }
}
