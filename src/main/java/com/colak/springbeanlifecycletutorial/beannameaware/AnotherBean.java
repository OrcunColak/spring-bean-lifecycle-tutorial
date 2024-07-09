package com.colak.springbeanlifecycletutorial.beannameaware;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AnotherBean {

    public void performTask() {
        log.info("Task performed by AnotherBean!");

    }
}
