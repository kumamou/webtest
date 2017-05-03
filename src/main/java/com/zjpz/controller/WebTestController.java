package com.zjpz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 测试页
 *
 * @anthor Jiaqi.X
 * @version 1.0
 * @date 2017-2-15 11:28:19
 */
@Controller
public class WebTestController {

    @RequestMapping("index.html")
    public ModelAndView goIndex(ModelAndView mav){
        mav.setViewName("index.jsp");
        return mav;
    }


}
