import java.util.Random;

public class bySwitch {
    public static void Switch(){
        int dailyHour;
        String type = "";
        int perHour = 20;
        int waage;
        Random random = new Random();
        int num = random.nextInt(3);
        switch (num){
            case 1:
                dailyHour = 8;
                type= "fulltime";
                break;
            case 2:
                dailyHour = 4;
                type= "parttime";
                break;
            default:
                dailyHour = 0;
                type= "absent";
                break;

        }
        waage = dailyHour * perHour;
        System.out.println(waage + " " +"type"+ " " + type);
    }
}
