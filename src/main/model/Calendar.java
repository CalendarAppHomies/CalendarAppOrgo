package main.model;

import java.util.ArrayList;

public class Calendar {
    ArrayList<Grouping> groupings;
    ArrayList<Holiday> ordered;

    public Calendar() {
        groupings = new ArrayList<>();
    }

    public ArrayList<Grouping> getGroupings() {
        return groupings;
    }

    // MODIFIES: this
    // EFFECTS: adds grouping to groupings
    //          adds holidays in grouping into ordered chronologically
    public void add(Grouping grouping){
        groupings.add(grouping);
        if (ordered.isEmpty()) {
            ordered = grouping.getHolidays();
        } else {
            for (Holiday holiday: grouping.getHolidays()) {
                Date date = holiday.getDate();
                Date next;
                for (int i = 0; i < ordered.size(); i ++) {
                    next = ordered.get(i).getDate();
                    if (date.before(next)) {
                        ordered.add(i, holiday);
                        break;
                    }
                }
            }

        }
    }
}
