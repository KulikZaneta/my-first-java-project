package com.codefirstgirls.week1.session1;

import java.util.ArrayList;
import java.util.HashMap;

public class Exercise5 {
    public static void run() {
        ArrayList<String> kickstarterCourse = new ArrayList<>();
        kickstarterCourse.add("Java");
        kickstarterCourse.add("SQL");
        kickstarterCourse.add("Python");
        kickstarterCourse.add("Web dev");
        System.out.println(kickstarterCourse);

        kickstarterCourse.remove("Python");
        System.out.println("After removing 'Python': " + kickstarterCourse);

        kickstarterCourse.add(1, "HTML & CSS");
        System.out.println("After adding at index 1: " + kickstarterCourse);

        System.out.println("Contains 'Java'? " + kickstarterCourse.contains("Java"));

        System.out.println("Element at index 2: " + kickstarterCourse.get(2));

        System.out.println("Size of ArrayList: " + kickstarterCourse.size());

        kickstarterCourse.set(0, "Advanced Java");
        System.out.println("After replacing first element: " + kickstarterCourse);

        System.out.println("---------------------------");

        HashMap<String, String> cfgCourse = new HashMap<>();
        cfgCourse.put("MOOC", "4 weeks");
        cfgCourse.put("Kickstarter", "8 weeks");
        cfgCourse.put("+Masters", "4 weeks");
        cfgCourse.put("MLA", "12 weeks");
        System.out.println(cfgCourse);

        cfgCourse.put("AI Specialisation", "6 weeks");
        System.out.println("After adding new pair: " + cfgCourse);

        System.out.println("Duration of Kickstarter: " + cfgCourse.get("Kickstarter"));

        cfgCourse.remove("MOOC");
        System.out.println("After removing 'MOOC': " + cfgCourse);

        System.out.println("Contains key 'MLA'? " + cfgCourse.containsKey("MLA"));
        System.out.println("Contains value '8 weeks'? " + cfgCourse.containsValue("8 weeks"));

        cfgCourse.replace("+Masters", "10 weeks");
        System.out.println("After replacing +Masters duration: " + cfgCourse);

        System.out.println("All key-value pairs:");
        for (String key : cfgCourse.keySet()) {
            System.out.println(key + " = " + cfgCourse.get(key));
        }

        System.out.println("Size of HashMap: " + cfgCourse.size());
    }
}

