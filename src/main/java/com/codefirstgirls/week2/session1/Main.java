package com.codefirstgirls.week2.session1;

import lombok.extern.slf4j.Slf4j;

import java.util.logging.Logger;

@Slf4j
public class Main {

    //private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Excercise1.fizzbuzz();

        String birthday1 = "23/10/1990";
        String birthday2 = "22/10/2025";

        boolean isBirthday1 = BirthdayChecker.isTodayTheirBirthday(birthday1);
        boolean isBirthday2 = BirthdayChecker.isTodayTheirBirthday(birthday2);

//        logger.info("Result for " + birthday1 + ": " + isBirthday1);
//        logger.info("Result for " + birthday2 + ": " + isBirthday2);

        log.info("Result for {}: {}", birthday1, isBirthday1);
        log.info("Result for {}: {}", birthday2, isBirthday2);
    }

}

