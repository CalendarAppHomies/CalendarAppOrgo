package main.model;

public class Date {
    private Integer month;
    private Integer day;

    public Date(int month, int day) {
        this.month = month;
        this.day = day;
    }

    public Integer getDay() {
        return day;
    }

    public Integer getMonth() {
        return month;
    }
}
