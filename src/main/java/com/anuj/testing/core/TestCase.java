package com.anuj.testing.core;

public class TestCase {
    private String id;
    private String title;
    private String steps;
    private String expectedResult;
    private String status;

    public TestCase(String id, String title, String steps, String expectedResult) {
        this.id = id;
        this.title = title;
        this.steps = steps;
        this.expectedResult = expectedResult;
        this.status = "NOT_EXECUTED";
    }

    public void updateStatus(String status) {
        if (status == null || status.isEmpty()) {
            System.out.println("Invalid status, update ignored");
            return;
        }
        this.status = status.toUpperCase();
    }

    public String getId() {
        return id;
    }




    public boolean isPassed() {
        return "PASS".equals(status);
    }

    public boolean isFailed() {
        return "FAIL".equals(status);
    }


    public void printSummary() {
        String result = isPassed() ? "PASS" : "NOT PASSED";
        System.out.println("[" + id + "] " + title + " => " + result);
    }


}
