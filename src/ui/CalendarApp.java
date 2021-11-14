package ui;

import main.model.Grouping;
import main.model.Calendar;
import main.model.Holiday;

import java.util.Date;
import java.util.Scanner;

public class CalendarApp {
    Calendar calendar;
    private Scanner scanner = new Scanner(System.in);

    public CalendarApp() {
        calendar = new Calendar();
        runMenu();
    }

    public void runMenu() {
        printMenu();
        String input = "";
        do {
            input = scanner.nextLine();
            if (input.equals("1")) {
                addGrouping();
            } else if (input.equals("2")) {
                viewCalendar();
            } else if (input.equals("3")) {
                //deleteGrouping();
            }
        } while (!input.equals("4"));
        System.out.println("Goodbye, Thanks for using Calendar App");
    }

    public void printMenu() {

        System.out.println("Welcome to Calendar App");
        System.out.println("Select one of the options:");
        System.out.println("1. Add cultural grouping to calendar ");
        System.out.println("2. View Calendar(s)");
        System.out.println("3. Delete grouping from Calendar ");
        System.out.println("4. Quit");
    }

    private void addGrouping() {
        System.out.println("Choose Cultural group that you'd like to add: ");
        printGroupings();
        String input = scanner.nextLine();
        if (input.equals("1")) {
            initializeChristian();
        } else if (input.equals("2")) {
            initializeIslamic();
        } else if (input.equals("3")) {
            initializeJudaism();
        } else if (input.equals("4")) {
            initializeHindu();
        } else if (input.equals("5")) {
            initializeBuddhism();
        }
    }

    private void printGroupings() {
        System.out.println("1. Christian Holidays");
        System.out.println("2. Islamic Holidays ");
        System.out.println("3. Jewish Holidays");
        System.out.println("4. Hindu Holidays");
        System.out.println("5. Buddhist Holidays");
    }

    private void viewCalendar() {
        printCalendar();
    }


    private void printCalendar() {
        System.out.println(calendar.toString());
    }

    private void initializeIslamicCalendar() {
        Grouping islamicHolidays = new Grouping("Lailat al Miraj");
        islamicHolidays.add(new Holiday("", new Date(2, 28), "The Maghi fair is held to honour the memory of the forty Sikh warriors killed during the Battle of Muktsar in 1705."));
        calendar.add(islamicHolidays);
    }


}
