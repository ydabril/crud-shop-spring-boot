package com.process.shop.controller;


import com.process.shop.model.Article;
import com.process.shop.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @PostMapping
    public Article createArticle(@RequestBody Article article){
        return articleService.createArticle(article);
    }
    @GetMapping("/{id}")
    public Article getArticleById(@PathVariable Long id){
        return articleService.getArticleById(id);
    }
    @PutMapping("/{id}")
    public Article updateArticle(@RequestBody Article article, @PathVariable Long id){
        article.setId(id);
        return articleService.updateArticle(article, id);
    }
    @GetMapping
    public List<Article> allArticles(){
        return articleService.findAllArticles();
    }
}
