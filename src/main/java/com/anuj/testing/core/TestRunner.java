package com.anuj.testing.core;

import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.List;

public class TestRunner {
    public static void main(String[] args) {

        List<TestCase> testcases = new ArrayList<>();


        testcases.add(new TestCase("TC002",
                "login testcase",
                "Enter username and password",
                "User should land on dashboard"));
        testcases.add(new TestCase("TC003",
                "login testcase",
                "Enter username and password",
                "User should land on dashboard"));

        TestCase loginTest = new TestCase("TC001",
                "login testcase",
                "Enter username and password",
                "User should land on dashboard");


        loginTest.printSummary();
        loginTest.updateStatus("PASS");
        loginTest.printSummary();


        for (TestCase test : testcases) {
            if (test.getId().equals("TC001")) {
                test.updateStatus("PASS");
            } else {
                test.updateStatus("FAIL");
            }

            test.printSummary();
        }


    }
}
