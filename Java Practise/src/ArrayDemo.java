import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i=0;i<arr.length;i++){
            arr[i]=(int) (Math.random()*100);
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("排序后：");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("倒着输出：");
        for (int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
