package ui;

import main.model.Calendar;

public class CalendarApp {
    Calendar calendar;

    public CalendarApp() {
        calendar = new Calendar();
        initializeCalendar();
        printCalendar();
    }

    private void printCalendar() {
        System.out.println(calendar.toString());
    }

    private void initializeCalendar() {
        // add information
        // choose option
        // select "c" -> initializeChristianity()
    }
}
