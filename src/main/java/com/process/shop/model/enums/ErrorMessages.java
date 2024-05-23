package com.process.shop.model.enums;

import lombok.Getter;

@Getter
public enum ErrorMessages {
    ARTICLE_NOT_FOUND("Article not found!"),
    ARTICLE_CODE_EXISTS("The code of the article is already registered");

    private final String message;

    ErrorMessages(String message) {
        this.message = message;
    }
}
