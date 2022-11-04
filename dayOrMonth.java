import java.util.Random;

public class dayOrMonth {
    public static void month(String company, int RatePerHour, int numberOfWorkngDays, int maxHourPerMonth) {
        int dailyHours = 0, totalHours = 0, totalWorkingDay = 0, waage = 0;
        String type = "";
        while (totalHours <= maxHourPerMonth && totalWorkingDay <= numberOfWorkngDays) {
            Random random = new Random();
            totalWorkingDay++;
            int num = random.nextInt(3);
            switch (num) {
                case 1:
                    dailyHours = 8;
                    type = "fulltime";
                    break;
                case 2:
                    dailyHours = 4;
                    type = "parttime";
                    break;
                default:
                    dailyHours = 0;
                    type = "absent";
                    break;
            }
            totalHours = totalHours + dailyHours;
            System.out.println(totalHours);
            System.out.println("total hours works" + totalHours + "jobype" + type);
        }

        waage = totalHours * RatePerHour;
        System.out.println("months wage is" + " " + waage);
    }



}

