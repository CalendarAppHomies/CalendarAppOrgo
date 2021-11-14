package main.model;

import java.util.ArrayList;

public class Calendar {
    ArrayList<Grouping> groupings;

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
    }
}
