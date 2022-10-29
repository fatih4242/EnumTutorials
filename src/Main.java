public class Main {
    public static void main(String[] args) {
        DaysOfTheWeek day = DaysOfTheWeek.THURSDAY;
        if(day == DaysOfTheWeek.THURSDAY){
            System.out.println("its thurday");
        }

        for (DaysOfTheWeek myDay: DaysOfTheWeek.values()) {
            System.out.println(myDay);
        }

        System.out.println(Cereals.FROOT_LOOPS.levelOfDeliciousness);

        final String BASE_URL = "https://tokersoftware.com";

        System.out.println("Request To : " + BASE_URL+EndPoints.ADDUSER.endPoints);
    }
}