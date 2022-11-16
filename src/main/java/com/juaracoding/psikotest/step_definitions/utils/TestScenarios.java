package com.juaracoding.psikotest.step_definitions.utils;

public enum TestScenarios {

    T1("User valid login"),
    T2("Admin Open Tab Task Modul"),
    T3("Admin Add Modul Pilihan Ganda Leader"),
    T4("Admin Add Modul Pilihan Ganda Staff"),
    T5("Admin Save Blank Modul"),
    ;
    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
