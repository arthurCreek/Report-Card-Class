package com.example.android.reportcardclass;

/**
 * Created by arturoahernandez on 8/31/17.
 */

public class ReportCard {
    private String name;
    private String history;
    private String english;
    private String math;
    private String science;

    public ReportCard(String name, String history, String english, String math, String science) {
        this.name = name;
        this.history = history;
        this.english = english;
        this.math = math;
        this.science = science;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getMath() {
        return math;
    }

    public void setMath(String math) {
        this.math = math;
    }

    public String getScience() {
        return science;
    }

    public void setScience(String science) {
        this.science = science;
    }

    @Override
    public String toString() {
        return "Name='" + name + '\'' +
                ", History='" + history + '\'' +
                ", English='" + english + '\'' +
                ", Math='" + math + '\'' +
                ", Science='" + science + '\'' +
                '}';
    }
}
