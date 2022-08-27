package com.heima.article.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.heima.model.article.pojos.ApArticleConfig;

import java.util.Map;

/**
 * @program: heima-leadnews
 * @description:
 * @author: CaoHaiyang
 * @create: 2022-08-24 21:52
 **/
public interface ApArticleConfigService extends IService<ApArticleConfig> {
    /**
     * 修改文章配置
     * @param map
     */
    public void updateByMap(Map map);
}
