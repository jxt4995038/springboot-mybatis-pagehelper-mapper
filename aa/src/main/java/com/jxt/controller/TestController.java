package com.jxt.controller;

import com.jxt.domain.PolistUser;
import com.jxt.domain.PolistUserDto;
import com.jxt.service.TestService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/14 0014.
 */
@RestController
@RequestMapping(value = "testController",method = RequestMethod.GET)
public class TestController {
    @Autowired
    private TestService testService;

    static {
        System.out.println("静态代码块开始执行=====================================================================");
    }
    @RequestMapping(value = "test")
    public String test(String a, HttpServletRequest request, HttpServletResponse response){
//        Cookie cookie = new Cookie("testCookieName","testCookieValue");
////        cookie.setMaxAge(5);
//
//
//        response.addCookie(cookie);

//        HttpSession session = request.getSession(true);
//        String id = session.getId();


        String test = testService.test();
        return "success";
    }

    @RequestMapping("testDto")
    public void testDto(HttpServletRequest request){
        List<PolistUser> dtoList = testService.testDto();
//        Cookie[] cookies = request.getCookies();
//        for (Cookie cookie : cookies) {
//            System.out.println(cookie.getName()+""+cookie.getValue());
//        }
//        HttpSession session = request.getSession();
//        System.out.println(session.getId());
    }

    @PostConstruct
    public void testPostConstruct(){
        System.out.println("postConstruct开始执行====================================================");
    }
}
