public class IfElseDemo {
    public static void main(String[] args) {
        int num=9;
        if (num%2==0){
            System.out.println(num+"是偶数！");
        }else{
            System.out.println(num+"是奇数！");
        }
        System.out.println("继续执行...");

        double price = 360.0;
        if (price>=500.0){
            price = price * 0.8;
        }else {
            price = price * 0.9;
        }
        System.out.println("最终价格为："+price);
    }
}
