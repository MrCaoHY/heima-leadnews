package com.heima.model.article.dtos;

import com.heima.model.article.pojos.ApArticle;
import lombok.Data;

/**
 * @program: heima-leadnews
 * @description:
 * @author: CaoHaiyang
 * @create: 2022-08-19 21:54
 **/
@Data
public class ArticleDto extends ApArticle {
    /**
     * 文章内容
     */
    private String content;
}
