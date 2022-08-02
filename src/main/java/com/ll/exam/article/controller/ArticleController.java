package com.ll.exam.article.controller;

import com.ll.exam.Container;
import com.ll.exam.annotation.Autowired;
import com.ll.exam.annotation.Controller;
import com.ll.exam.annotation.GetMapping;
import com.ll.exam.article.service.ArticleService;

@Controller // 컨트롤러임을 알려줌
public class ArticleController {

    @Autowired
    private ArticleService articleService;


    @GetMapping("/usr/article/list") // /usr/article/list와 관련된 요청 처리
    public void showList() {

    }

    public ArticleService getArticleServiceForTest() {
        return articleService;
    }
}
