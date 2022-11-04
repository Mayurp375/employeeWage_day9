import java.util.Random;

public class months {
    public  void wageMonth() {
        int dailyHour;
        String type = "";
        int perHour = 20;
        int waage;
        int i = 1;
        int totalHour = 0;
        for (i = 1; i <= 20; i++) {
            Random random = new Random();
            int num = random.nextInt(3);
            switch (num) {
                case 1:
                    dailyHour = 8;
                    type = "fulltime";
                    break;
                case 2:
                    dailyHour = 4;
                    type = "parttime";
                    break;
                default:
                    dailyHour = 0;
                    type = "absent";
                    break;
            }
            totalHour = totalHour + dailyHour;
            System.out.println("total hours works"+ totalHour + "jobype"+ type);
        }

        waage = totalHour * perHour;
        System.out.println("months wage is" + " " + waage);
    }
}
