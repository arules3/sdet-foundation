package com.anuj.testing.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestRunner {


    private static void executeTests(TestCase testCase) {
        if(testCase.getId().equals("TC001")){
            testCase.updateStatus("PASS");
        }

        else  {testCase.updateStatus("FAIL");}

        testCase.printSummary();
    }


    private static Map<String , TestCase> createTestCases() {
        Map<String , TestCase> testCases = new HashMap<>();
        testCases.put("TC001" , new TestCase("TC001",
                "login testcase",
                "Enter username and password",
                "User should land on dashboard"));

        testCases.put("TC002" , new TestCase("TC002",
                "signup testcase",
                "sign up with username and password",
                "User should land on dashboard"));


        return testCases;

    }

    private static void printGroupedSummary(
            Map<String, List<TestCase>> testsByStatus) {

        System.out.println("\n===== EXECUTION SUMMARY =====");

        for (Map.Entry<String, List<TestCase>> entry : testsByStatus.entrySet()) {
            String status = entry.getKey();
            List<TestCase> tests = entry.getValue();

            System.out.println(status + " : " + tests.size());

            for (TestCase test : tests) {
                test.printSummary();
            }
        }
    }



    private static Map<String , List<TestCase>> groupTestsByStatus
            (Map<String , TestCase> testcases) {

        Map<String, List<TestCase>> testByStatus = new HashMap<>();
        for (Map.Entry<String, TestCase> entry : testcases.entrySet()) {
            String status = entry.getValue().getStatus();

            testByStatus.computeIfAbsent(status, k -> new ArrayList<>())
                    .add(entry.getValue());

        }

        return testByStatus;

    }



    public static void main(String[] args) {

        Map<String ,  TestCase> tests = createTestCases();

        for(TestCase test : tests.values()) {
            executeTests(test);

        }

        TestCase specificTest = tests.get("TC002");

        if (specificTest != null) {
            System.out.println("Direct lookup result:");
            specificTest.printSummary();
            System.out.println(specificTest);
        }

        Map<String, List<TestCase>> getTestsByStatus = groupTestsByStatus(tests);

        printGroupedSummary(getTestsByStatus);

    }


}
