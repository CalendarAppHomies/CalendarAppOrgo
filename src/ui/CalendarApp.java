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
            initializeChristianCalendar();
        } else if (input.equals("2")) {
            initializeIslamic();
        } else if (input.equals("3")) {
            initializeJudaism();
        } else if (input.equals("4")) {
            initializeHinduCalendar();
        } else if (input.equals("5")) {
            initializeBuddhistCalendar();
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

    private void initializeChristianCalendar() {
        Grouping christianHolidays = new Grouping("Christian Holidays");
        christianHolidays.add(new Holiday("Epiphany", new Date(1,6), "The Epiphany celebrates the baptism of Jesus by John the Baptist in the River Jordan."));
        christianHolidays.add(new Holiday("Candlemas", new Date(2, 2), "Candlemas, also known as the Feast of the Presentation of Jesus Christ, is a Christian Holy Day commemorating the presentation of Jesus at the Temple."));
        christianHolidays.add(new Holiday("St. Valentine's Day", new Date(2, 14), "Valentine's Day is named after a Christian martyr Saint Valentine and is celebrated to commemorate the love between companions."));
        christianHolidays.add(new Holiday("Ash Wednesday", new Date(3, 2), "Ash Wednesday is a Christian holy day of prayer and fasting."));
        christianHolidays.add(new Holiday("St. Patrick's Day", new Date(3, 17), "St. Patrick's Day is a festival celebrated to honor St. Patrick, an Irish Saint who helped convert the people of Ireland to Christianity."));
        christianHolidays.add(new Holiday("St. Joseph's Day", new Date(3, 19), "Saint Joseph's Day, also called the Feast of Saint Joseph or the Solemnity of Saint Joseph, is in Western Christianity the principal feast day of Saint Joseph, husband of the Virgin Mary and legal father of Jesus Christ."));
        christianHolidays.add(new Holiday("Palm Sunday", new Date(4, 10), "Palm Sunday commemorates the day Jesus arrived in Jerusalem riding on a donkey."));
        christianHolidays.add(new Holiday("Maundy Thursday", new Date(4, 14), "Maundy Thursday is celebrated to commemorate the occasion of Last Supper of Jesus Christ, as described in the Bible, whereby Jesus shared a meal with his disciples a day before his crucification."));
        christianHolidays.add(new Holiday("Good Friday", new Date(4, 15), "Good Friday is a Christian's holiday that commemorates Jesus Christ's crucifixion and death as narrated in the Holy Book, The Bible."));
        christianHolidays.add(new Holiday("Easter", new Date(4, 17), "Easter is a festival celebrated by Christians to commemorate the resurrection of Jesus Christ."));
        christianHolidays.add(new Holiday("Easter Monday", new Date(4, 18), "Easter Monday is the day after Easter Sunday and a public holiday in some countries."));
        christianHolidays.add(new Holiday("St. George's Day", new Date(5, 26), "Saint George's Day, also called the Feast of Saint George, is the feast day of Saint George as celebrated by various Christian Churches."));
        christianHolidays.add(new Holiday("Pentecost", new Date(6, 5), "Pentecost commemorates the descent of the Holy Spirit upon the Apostles and other followers of Jesus Christ while they were in Jerusalem celebrating the Feast of Weeks."));
        christianHolidays.add(new Holiday("Trinity Sunday", new Date(6, 12), "Trinity Sunday celebrates the Christian doctrine of the Trinity, the three Persons of God: the Father, the Son, and the Holy Spirit."));
        christianHolidays.add(new Holiday("Corpus Christi", new Date(6, 16), "Corpus Christi is a festival where Christians honor the Holy body of the Christ. Bread and wine are usually offered as a symbol of the Body and Blood of Christ in His communion."));
        christianHolidays.add(new Holiday("Saints Peter and Paul", new Date(6, 29), "The Feast of Saints Peter and Paul or Solemnity of Saints Peter and Paul is a liturgical feast in honour of the martyrdom in Rome of the apostles Saint Peter and Saint Paul."));
        christianHolidays.add(new Holiday("Lammas", new Date(8, 1), "Lammas Day is a festival to mark the blessing of the First Fruits of harvest, with a loaf of bread being brought to the church for this purpose."));
        christianHolidays.add(new Holiday("The Assumption of Mary", new Date(8, 15), "The Assumption of Mary marks the occasion of the Virgin Mary's bodily ascent to heaven at the end of her life."));
        christianHolidays.add(new Holiday("All Hallows' Eve", new Date(10, 31), "All Hallows' Eve or Halloween is celebrated as a spiritual beginning of a new year involving activities such as dressing up in costumes and trick-or-treating."));
        christianHolidays.add(new Holiday("All Saints' Day", new Date(11, 1), "All Saints' Day is celebrated to pay tribute to all the saints."));
        christianHolidays.add(new Holiday("Thanksgiving (USA)", new Date(11, 24), "Thanksgiving Day bears its origin from the harvest festival. Generally, Americans give thanks to God for their autumn harvest and every other success they have achieved in the year."));
        christianHolidays.add(new Holiday("St. Andrew's Day", new Date(11, 30), "Saint Andrew's Day, also called the Feast of Saint Andrew or Andermas, is the feast day of Andrew the Apostle."));
        christianHolidays.add(new Holiday("Christmas Eve", new Date(12, 24), "Christmas Eve is the evening or entire day before Christmas Day, the festival commemorating the birth of Jesus."));
        christianHolidays.add(new Holiday("Christmas", new Date(12, 35), "Christmas is an annual festival commemorating the birth of Jesus Christ."));
        christianHolidays.add(new Holiday("Watch Night", new Date(12, 31), "A watchnight service is a late-night Christian church service that provides the opportunity for Christians to review the year that has passed and make confession, and then prepare for the year ahead by praying and resolving."));
        calendar.add(christianHolidays);
    }

    private void initializeSikhCalendar() {
        Grouping sikhHolidays = new Grouping("Sikh Holidays");
        sikhHolidays.add(new Holiday("Maghi", new Date(1, 14), "The Maghi fair is held to honour the memory of the forty Sikh warriors killed during the Battle of Muktsar in 1705."));
        sikhHolidays.add(new Holiday("Guru Gobind Singh Jayanti", new Date(1, 20), "Guru Gobind Singh Jayanti commemorates the birth anniversary of Guru Gobind Singh Ji Maharaj, the 10th guru of the Sikhs."));
        sikhHolidays.add(new Holiday("Hola Mohalla", new Date(3, 29), new Date(3, 31), "Hola Mohalla, also called Hola, is a three day long festival. The Sikh community commemorates the Hola Mohalla Festival by watching and participating in the martial arts parades, led by the Gurudwara's Nishan Sahibs."));
        sikhHolidays.add(new Holiday("Holi", new Date(3, 29), "The Holi festival celebrates the eternal and divine love of Radha Krishna."));
        sikhHolidays.add(new Holiday("Vaisakhi", new Date(4, 14), "Vaisakhi, the Sikh New Year festival, marks the start of the Punjabi New Year and celebrates 1699, the year when Sikhism was born as a collective faith."));
        sikhHolidays.add(new Holiday("Birthday of Guru Angad Dev", new Date(4, 18), "The birthday of Guru Angad Dev Ji, the second guru of Sikhs."));
        sikhHolidays.add(new Holiday("Martyrdom of Guru Arjan Dev Sahib", new Date(6, 16), "Guru Arjan died after being tortured for five days by the Mughal government led by Emperor Jahangir. The Sikhs observe the martyrdom of the Sikh Guru Arjan each year and his martyrdom is remembered as Shaheedi Divas of Guru Arjan."));
        sikhHolidays.add(new Holiday("Birth of the Guru Granth", new Date(10, 20), "Birthday of the Guru Granth Sahib."));
        sikhHolidays.add(new Holiday("Diwali", new Date(11, 4), new Date(11, 9), "Diwali is a five day major celebration. For Sikh's, Diwali celebrates the release from prison of the sixth guru, Guru Hargobind, and 52 other princes with him."));
        sikhHolidays.add(new Holiday("Guru Nanak Gurpurab", new Date(11, 19), "Birthday of the Guru Nanak, the founder of Sikhism and is the first of the ten Sikh Gurus."));
        sikhHolidays.add(new Holiday("Martyrdom of Guru Tegh Bahadur Sahib", new Date(11, 24), "Guru Tegh Bahadur's Martyrdom Day commemorates the day Guru Tegh Bahadur was publicly executed on the orders of Aurangzeb because he had opposed religious persecution."));
        calendar.add(sikhHolidays);
    }

    private void initializeBuddhistCalendar() {
        Grouping buddhistHolidays = new Grouping("Buddhist Holidays");
        buddhistHolidays.add(new Holiday("Bodhi Day", new Date(1, 20), "Bodhi Day commemorates the day that the historical Buddha, Siddhartha Gautama, experienced enlightenment, also known as bodhi in Sanskrit and Pali."));
        buddhistHolidays.add(new Holiday("Mahayana New Year", new Date(2, 28), "New Year for Mahāyāna Buddhists."));
        buddhistHolidays.add(new Holiday("Nirvana Day", new Date(2, 8), "Nirvana Day is an annual Buddhist festival that remembers the death of the Buddha when he reached Nirvana at the age of 80."));
        buddhistHolidays.add(new Holiday("Chinese New Year", new Date(2, 12), "Chinese New Year, Spring Festival or the Lunar New Year, is the festival that celebrates the beginning of a new year on the traditional lunisolar Chinese calendar."));
        buddhistHolidays.add(new Holiday("Magha Puja Day", new Date(2, 27), "Māgha Pūjā is the second most important Buddhist festival. The celebration is held to commemorate the day on which Lord Buddha gave 'Ovadha Patimokkha' (the Fundamental Teaching) to the assembly of hiw disciples."));
        buddhistHolidays.add(new Holiday("Theravada New Year", new Date(4, 27), "New Year for Theravada Buddhists."));
        buddhistHolidays.add(new Holiday("Vesak Day", new Date(5, 26), "Vesak Day is a major Buddhist festival that memorializes the birth, enlightenment (nirvana) and passing away (Parinirvana) of the Lord Gautama Buddha on one day."));
        buddhistHolidays.add(new Holiday("Asala-Dharma Day", new Date(7, 24), "Asala-Dharma Day is celebrated to express gratitude for the teachings of Buddha."));
        buddhistHolidays.add(new Holiday("Obon", new Date(8, 143), "Obon (お盆) or just Bon (盆) is a Japanese Buddhist custom to honor the spirits of one's ancestors."));
        calendar.add(buddhistHolidays);
    }


}
