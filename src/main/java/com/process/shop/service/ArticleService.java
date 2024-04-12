package com.process.shop.service;

import com.process.shop.model.Article;
import com.process.shop.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService implements IArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public Article createArticle(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public Article updateArticle(Article articleUpdated, Long id) {
        Optional<Article> articleBd = articleRepository.findById(id);
        if(articleBd.isEmpty()){
            return null;
        }
        return articleRepository.save(articleUpdated);
    }

    @Override
    public Article getArticleById(Long id) {
        Optional<Article> article = articleRepository.findById(id);
        if(article.isEmpty()){
            return null;
        }
        return article.get();
    }

    @Override
    public List<Article> findAllArticles() {
        return (List<Article>) articleRepository.findAll();
    }
}
