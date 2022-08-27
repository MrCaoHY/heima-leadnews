package com.heima.wemedia.controller.v1;

import com.heima.model.common.dtos.ResponseResult;
import com.heima.model.wemedia.dtos.WmNewsDto;
import com.heima.model.wemedia.dtos.WmNewsPageReqDto;
import com.heima.wemedia.service.WmNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: heima-leadnews
 * @description: 文章
 * @author: CaoHaiyang
 * @create: 2022-08-19 08:29
 **/
@RestController
@RequestMapping("/api/v1/news")
public class WmNewsController {
    @Autowired
    private WmNewsService wmNewsService;

    @PostMapping("/list")
    public ResponseResult findAll(@RequestBody WmNewsPageReqDto dto){
        return  wmNewsService.findAll(dto);
    }

    @PostMapping("/submit")
    public ResponseResult submitNews(@RequestBody WmNewsDto dto){
        return  wmNewsService.submitNews(dto);
    }

    @GetMapping("/one/{id}")
    public ResponseResult one(@PathVariable("id") Integer id){
        return wmNewsService.one(id);
    }

    @GetMapping("/del_news/{id}")
    public ResponseResult delNews(@PathVariable("id") Integer id){
        return wmNewsService.delNews(id);
    }

    @PostMapping("/down_or_up")
    public ResponseResult downOrUp(@RequestBody WmNewsDto wmNewsDto){
        return wmNewsService.downOrUp(wmNewsDto);
    }
}
