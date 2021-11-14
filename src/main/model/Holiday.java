package main.model;

public class Holiday {
    private String name;
    private Date date;
    private Date endDate;
    private String how;

    public Holiday(String name, Date date, boolean dayOff, String how) {
        this.name = name;
        this.date = date;
        this.endDate = null;
        this.how = how;
    }

    public Holiday(String name, Date date, Date endDate, boolean dayOff, String how) {
        this.name = name;
        this.date = date;
        this.endDate = endDate;
        this.how = how;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getHow() {
        return how;
    }

    // EFFECTS: returns String representation of this
    public String toString() {
        String dayString = String.valueOf(this.date.getDay());
        if (dayString.length() == 1) {
            dayString = "0" + dayString;
        }
        String monthString = String.valueOf(this.date.getMonth());
        if (monthString.length() == 1) {
            monthString = "0" + monthString;
        }
        if (endDate == null) {
            return (monthString + "/" + dayString + ": " + this.name + "\n\t" + this.how);
        } else {
            String endDayString = String.valueOf(this.date.getDay());
            if (endDayString.length() == 1) {
                endDayString = "0" + endDayString;
            }
            String endMonthString = String.valueOf(this.date.getMonth());
            if (endMonthString.length() == 1) {
                endMonthString = "0" + endMonthString;
            }
            return (monthString + "/" + dayString + " - " + endMonthString + "/" + endDayString + ": " + this.name + "\n\t" + this.how);
        }
    }

}
