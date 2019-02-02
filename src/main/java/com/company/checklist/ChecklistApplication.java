package com.company.checklist;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import javax.swing.*;

@SpringBootApplication
public class ChecklistApplication {

    @Value("${server.port}")
    private int port;

    public static void main(String[] args) {
        SpringApplication.run(ChecklistApplication.class, args);
    }

    @PostConstruct
    public void onAppStart() {
        Timer timer = new Timer(2000, (e) -> System.out.println(String.format("Listening: http://localhost:%s", this.port)));

        timer.setRepeats(false);
        timer.start();
    }

}

