public class Ex1 {
    public static void ex1(){
        enum Months {
            January, February, March, April, May, June, July, August, September, October, November, December
        }
        Months[] months = Months.values();
        for(int i = 0; i < months.length;i++){
            System.out.println(months[i]);
        }
        System.out.println("\n");
    }
}
