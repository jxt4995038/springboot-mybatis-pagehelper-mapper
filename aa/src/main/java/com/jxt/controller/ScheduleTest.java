package com.jxt.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/9/15 0015.
 */
@Component
public class ScheduleTest {
    @Scheduled(fixedRate = 60000)
    public void testScheduled(){
        System.out.println("定时任务执行,每分钟执行一次");
    }

    @Scheduled(cron = "0 17 14 * * ?")
    public void test(){
        System.out.println("定时任务每天14点17执行");
    }
    public ScheduleTest(){
        System.out.println("加载了"+this.getClass());
    }

}
