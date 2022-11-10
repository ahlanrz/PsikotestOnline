package com.juaracoding.psikotest.step_definitions.utils;

public enum TestScenarios {
//    T1("User login username password invalid"),
    T1("User valid login");
//    T3("Dashboard user function"),
//    T4("Recruitment user function"),
//    T5("Recrutiment Searching by Hiring Manager Name");
//
    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
