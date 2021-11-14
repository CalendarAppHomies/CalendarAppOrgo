package main.model;

public class Holiday {
    private String name;
    private Date date;
    private Date endDate;
    private boolean dayOff;
    private String how;

    public Holiday(String name, Date date, boolean dayOff, String how) {
        this.name = name;
        this.date = date;
        this.endDate = null;
        this.dayOff = dayOff;
        this.how = how;
    }

    public Holiday(String name, Date date, Date endDate, boolean dayOff, String how) {
        this.name = name;
        this.date = date;
        this.endDate = endDate;
        this.dayOff = dayOff;
        this.how = how;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public boolean isDayOff() {
        return dayOff;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getHow() {
        return how;
    }

}
