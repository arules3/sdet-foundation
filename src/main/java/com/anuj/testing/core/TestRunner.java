package com.anuj.testing.core;

public class TestRunner {
    public static void main(String[] args) {
        TestCase loginTest = new TestCase("TC001" ,
                "login testcase",
                "Enter username and password",
                "User should land on dashboard");


        loginTest.printSummary();
        loginTest.updateStatus("PASS");
        loginTest.printSummary();
    }
}
