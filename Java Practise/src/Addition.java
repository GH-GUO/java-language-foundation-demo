import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score=0;
        for (int i=1;i<=10;i++){
            int num1=(int) (Math.random()*100);
            int num2=(int) (Math.random()*100);
            int result=num1+num2;
            System.out.println("算吧！");
            System.out.println("("+i+")"+num1+"+"+num2+"=");

            int answer=scan.nextInt();
            if (answer==-1){
                break;
            }
            if (answer==result){
                System.out.println("恭喜你，回答正确！");
                score +=10;
            }else {
                System.out.println("很遗憾，回答错误！");
            }
        }
        System.out.println("总分为："+score);
    }
}
