package ui;

import main.model.Grouping;
import main.model.Calendar;
import main.model.Holiday;
import main.model.Date;

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
        Grouping islamicHolidays = new Grouping("Islamic Holidays");
        islamicHolidays.add(new Holiday("Lailat al Miraj", new Date(2, 28), "ailat al Miraj is a Muslim holiday that commemorates the Prophet Muhammad's nighttime journey from Mecca to the 'Farthest Mosque' in Jerusalem "));
        islamicHolidays.add(new Holiday("Lailat al Bara'ah", new Date(3, 18), "It is regarded as a night when the fortunes of individuals for the coming year are decided and when Allah may forgive sinners."));
        islamicHolidays.add(new Holiday("Ramadan", new Date(4, 2), new Date(5, 2), " is the ninth month of the Islamic calendar,observed by Muslims worldwide as a month of fasting, prayer, reflection and community."));
        islamicHolidays.add(new Holiday("Laylat al Qadr", new Date(4, 28), "Lailat al Qadr is the night when the Quran was first sent down from Heaven to the world."));
        islamicHolidays.add(new Holiday("Eid al Fitr", new Date(5, 2), "Eid al Fitr marks the end of the month-long dawn-to-sunset fasting of Ramadan."));
        islamicHolidays.add(new Holiday("Waqf al Arafa- Hajj", new Date(7, 8), "It is the holiest day in the Islamic calendar the second day of the Hajj pilgrimage.");
        islamicHolidays.add(new Holiday("Eid al Adha", new Date(7, 9), "It honors the willingness of Ibrahim (Abraham) to sacrifice his son Ismael as an act of obedience to God's command.");
        islamicHolidays.add(new Holiday("Hijra- Islamic New Year", new Date(7, 30), "Hijra is the day that marks the beginning of a new lunar Hijri year."));
        islamicHolidays.add(new Holiday("Day of Ashura", new Date(8, 8), "Ashura marks the day in which the Islamic prophet Moses was saved by God when He parted the Sea."));
        islamicHolidays.add(new Holiday("Milad un Nabi", new Date(10, 8), "Milad un Nabi celebrates the birth of the prophet Muhammad"));
        calendar.add(islamicHolidays);
    }

}

