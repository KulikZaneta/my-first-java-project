package com.codefirstgirls.week2.session1;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

@Slf4j
public class BirthdayChecker {

    //private static final Logger logger = Logger.getLogger(BirthdayChecker.class.getName());

    public static boolean isTodayTheirBirthday(String birthday) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            LocalDate theirBirthdayDate = LocalDate.parse(birthday, formatter);
            LocalDate today = LocalDate.now();

            if (today.getDayOfMonth() == theirBirthdayDate.getDayOfMonth() &&
                    today.getMonth() == theirBirthdayDate.getMonth()) {
                //logger.info("Best buy a card");
                log.info("Best buy a card!");
                return true;
            } else {
                //logger.info("Their birthday is on: " + birthday);
                log.info("Their birthday is on: {}", birthday);
                return false;
            }
        } catch (DateTimeParseException e) {
            //logger.severe("Invalid date format: " + birthday + ". Please use dd/MM/yyyy.");
            log.error("Invalid date format: {}. Please use dd/MM/yyyy.", birthday);
            return false;
        }
    }
}

