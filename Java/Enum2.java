package Java;
import java.time.DayOfWeek;
import java.time.LocalDate;
public class Enum2 {
    enum WeekDay {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
        public static WeekDay WeekDayfromJavaDay(DayOfWeek day){
            return
            WeekDay.valueOf(day.name());
        }
    }
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DayOfWeek javaDay = today.getDayOfWeek();

        WeekDay todayEnum = WeekDay.WeekDayfromJavaDay(javaDay);
        System.out.println("Today is:" + todayEnum);
    }
}
