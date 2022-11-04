import java.util.Random;

public class attendance {
    public static void Check() {
        Random random = new Random();
        int num = random.nextInt(2);
        System.out.println(num);

        if (num == 1){
            System.out.println("employee is present");
        }else {
            System.out.println("employee is absent");
        }
    }
}
