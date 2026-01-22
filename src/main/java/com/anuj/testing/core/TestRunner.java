package com.anuj.testing.core;

import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.List;

public class TestRunner {


    private static void executeTests(TestCase testCase) {
        if(testCase.getId().equals("TC001")){
            testCase.updateStatus("PASS");
        }

        else  {testCase.updateStatus("FAIL");}

        testCase.printSummary();
    }


    private static List<TestCase> createTestCases() {
        List<TestCase> testCases = new ArrayList<>();
        testCases.add(new TestCase("TC002",
                "login testcase",
                "Enter username and password",
                "User should land on dashboard"));

        testCases.add(new TestCase("TC003",
                "login testcase",
                "Enter username and password",
                "User should land on dashboard"));


        return testCases;

    }


    public static void main(String[] args) {

        List<TestCase> testcases = createTestCases();

        for (TestCase test : testcases) {
            executeTests(test);
        }


    }
}
