package com.anuj.testing.core;

public class TestCase {
    private String id;
    private String title;
    private String steps;
    private String expectedResult;
    private String status;



    public TestCase(String id , String title , String steps , String expectedResult){
        this.id = id;
        this.title = title;
        this.steps = steps;
        this.expectedResult = expectedResult;
        this.status = "NOT_EXECUTED";
    }



    public void updateStatus(String status) {
        this.status = status;
    }


    public void printSummary() {
        System.out.println("[" + id + "] " + title + " => " + status);
    }
}
