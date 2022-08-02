package com.ll.exam.article.controller;

import com.ll.exam.annotation.Controller;
import com.ll.exam.annotation.GetMapping;

@Controller // 컨트롤러임을 알려줌
public class ArticleController {

    @GetMapping("/usr/article/list") // /usr/article/list와 관련된 요청 처리
    public void showList() {

    }
}
