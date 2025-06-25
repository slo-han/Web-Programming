package com.example.Kopoproject.controller;


import com.example.Kopoproject.dto.ArticleForm;
import com.example.Kopoproject.entity.Article;
import com.example.Kopoproject.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ArticleController {
    @Autowired // 의존성 주입 애노테이션 / DI(dependency injection)
    private ArticleRepository articleRepository;

    @GetMapping("/article/new")
    public String newArticleForm(){
        return "articles/new";
    }

    @PostMapping("/article/create") // 생성 요청
    public String newArticle(ArticleForm articleForm) { // DTO로 데이터 수집(ArticleForm articleForm)
        //System.out.println(articleForm.toString());
        log.info(articleForm.toString());
        // DTO -> Entity
        Article article = articleForm.toEntity();
        //System.out.println(article.toString());
        log.info(article.toString());

        // Repo -> DB save
        Article saved = articleRepository.save(article);
        //System.out.println(saved.toString());
        log.info(saved.toString());

        // view
        return "articles/new";
    }

    @GetMapping("/article/{number}")
    public String articleShow(@PathVariable long number, Model model) {
        // PathVariable =  요청 변수 수집
        log.info("number : " + number);
        // 게시글 번호 확인해서 view 처리

        // 받아온 id 값을 조회 - DB에서
        Article saved = articleRepository.findById(number).orElse(null);

        // addAttribute 활용해서 모델에 데이터 등록
        model.addAttribute("article", saved);

        // view 화면에 보여주기
        return "articles/show";
    }
}
