import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = (int) (Math.random()*1000+1);
        System.out.println(num);
        int guess;
        do {
            System.out.println("猜吧！");
            guess = scan.nextInt();
            if (guess<num){
                System.out.println("猜小了！");
            }else if (guess>num){
                System.out.println("猜大了！");
            }else {
                System.out.println("恭喜你，猜对了！");
            }
        }while (guess!=num);
    }
}
