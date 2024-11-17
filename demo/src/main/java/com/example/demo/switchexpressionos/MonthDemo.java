package com.example.demo.switchexpressionos;

// MonthDemo.java
public class MonthDemo {
    public static void main(String[] args) {
        // Loop through all the months in the enum
        for (Month month : Month.values()) {
            classifyMonth(month);
        }
    }

    // Method to classify months as odd or even
    public static void classifyMonth(Month month) {
        switch (month) {
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER ->
                    System.out.println(month + " is an Odd month.");
            case FEBRUARY, APRIL, JUNE, SEPTEMBER, NOVEMBER ->
                    System.out.println(month + " is an Even month.");
            default ->
                    System.out.println("Unknown month.");
        }
    }
}
