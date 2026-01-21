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
        if(status == null || status.isEmpty()) {
            System.out.println("Invalid Status , could not resolve: " + status);
        }
        this.status = status != null ? status.toUpperCase() : null;
    }


    public boolean isPassed() {
        return "PASS".equals(status);
    }

    public boolean isFailed() {
        return  "FAIL".equals(status);
    }


    public void printSummary() {
        String result = isPassed() ? "PASSED :-)" : "NOT PASSED :-(";
        System.out.println("[" + id + "] " + title + " => " + result);
    }
}
