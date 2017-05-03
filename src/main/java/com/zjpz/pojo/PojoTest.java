package com.zjpz.pojo;

import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by Administrator on 2017/3/29.
 */
public class PojoTest {

    public static int count = 0;
    public static int hello;
    public static void main(String[] args) {
        final PojoTest data = new PojoTest();
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        //进入的时候暂停1毫秒，增加并发问题出现的几率
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    for (int j = 0; j < 100; j++) {
                        data.addCount();
                    }
                    System.out.print(count + " ");
                }
            }).start();

        }
        if(Thread.activeCount()<=0){
            System.out.println("count=" + count);
        }

    }

    /**
     * 增加 synchronized 关键字
     */
    public  void addCount() {
        count++;
    }
}
