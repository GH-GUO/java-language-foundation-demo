public class MultiTable {
    public static void main(String[] args) {

        //             5
        int i;
        for (i=1;i<=9;i++){
            for (int j=1; j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }

        /*             4
        int i;
        for (i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }


                      3
        int i;
        for (i=1;i<=9;i++){
            for (int j=1; j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }

                       2
        int i;
        for (i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }

                    1
        int j;
        for (j=1;j<=9;j++){
            for (int i=1;i<=j;i++){
                System.out.print(i+"*"+j+"="+i*j+"\t");    // \t水平制表符，占8位
            }
            System.out.println();   //换行
        }

         */
    }
}
