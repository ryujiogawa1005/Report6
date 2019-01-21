import java.util.Scanner;
import java.util.Random;
public class GameEngine {
    public static void GameEngine() {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int answer = random.nextInt(1000);
        System.out.print("何か入力してください");
        int count = 0;
        while (count < 10) {
            int number = scan.nextInt();
            if (number == answer) {
                System.out.println("ゲームクリア！");
                count = 10;
            }
            if (number < answer) {
                System.out.println("答えはもっと大きいです");
                count++;
            } else {
                System.out.println("答えはもっと小さいです");
                count++;
            }
        }
    }
}


















