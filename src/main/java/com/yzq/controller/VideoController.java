package com.yzq.controller;

import com.yzq.pojo.Video;
import com.yzq.service.VideoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class VideoController {
    @RequestMapping(value = "/video",method = RequestMethod.GET)
    public String getVideoDetail(@RequestParam ("id")String id, ModelMap model){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        VideoService service= (VideoService) context.getBean("videoService");
        List<Video> l=service.getVideoDetail(1);
        for (Video i :l){
            model.addAttribute("videoDetail",i);
            System.out.print(i.getUrl());

        }
        return "video";
    }
}
