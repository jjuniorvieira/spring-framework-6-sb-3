package com.example.demo.patternmatching;

public class ServiceDemo {

    public static void main(String[] args) {
        WebService service = new DBService();

        switch (service) {
            case DBService db -> System.out.println("DB service call");
            case RestfulService rt -> System.out.println("restfull service call");
//            case Restf
            default -> throw new IllegalStateException("Unexpected value: " + service);
        }
    }
}
