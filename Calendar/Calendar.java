package Calendar;

import java.util.ArrayList;
import java.util.List;

public class Calendar {
     private List<Day> dayList = new ArrayList<>();
     private int currentDate;

    public Calendar(int currentDate) {
        this.currentDate = currentDate;
        for (int i = 1; i <= 30; i++) {
            Day day = new Day(i,DayOfWeek.getWeekByDay(i));
            dayList.add(day);
        }
    }

    public void addPlans(int day, String plan) {
        Day dayPlans = dayList.get(day - 1);
        dayPlans.addPlans(plan);
    }

    public void getPlans(int day) {
        Day day1 = dayList.get(day - 1);
        System.out.println(day1);
    }

    public void getPlansMoths(){
        String size = dayList.toString();
        System.out.println(size);
    }

    public void getPlansCurrantDay() {
        Day day = dayList.get(currentDate);
        System.out.println(day);
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "dayList=" + dayList +
                ", currentDate=" + currentDate +
                '}';
    }
}
