public class Ex2 {
    public enum Weekday {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    public static void isWorkDay(Weekday A){
        if (A == Weekday.MONDAY || A == Weekday.TUESDAY || A == Weekday.WEDNESDAY || A == Weekday.THURSDAY || A == Weekday.FRIDAY){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }

}
