package Calendar;

import java.util.ArrayList;
import java.util.List;

public class Day {
    private int day;
    private DayOfWeek week;
    private List<String> plans = new ArrayList<>();

    public Day(int day, DayOfWeek week) {
        this.day = day;
        this.week = week;
    }

    public void addPlans (String plan) {
        plans.add(plan);
    }

    @Override
    public String toString() {
        return "\nDay{" +
                "day=" + day +
                ", week=" + week +
                ", plans=" + plans +
                '}';
    }
}
