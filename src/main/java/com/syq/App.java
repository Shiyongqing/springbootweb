package com.syq;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication()
public class App implements ApplicationRunner {


    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(ApplicationArguments args) {
        System.out.println(">>>>>>>>>> \n" +
                App.class.getName() + "系统启动成功!" + "\n" +
                "<<<<<<<<<<<<<");
    }

}
