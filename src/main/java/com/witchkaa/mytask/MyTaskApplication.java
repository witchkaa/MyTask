package com.witchkaa.mytask;

import com.witchkaa.mytask.entity.Task;
import com.witchkaa.mytask.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class MyTaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyTaskApplication.class, args);
    }
    @Bean
    CommandLineRunner runner(TaskService service) {
        return args -> {
            service.saveTask(new Task(1L, "Walk the dog", LocalDate.now().plus(2, ChronoUnit.DAYS), false));
            service.saveTask(new Task(2L, "Do hometask", LocalDate.now(), false));
        };
    }
}
