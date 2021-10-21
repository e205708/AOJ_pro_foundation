import java.util.Scanner;

public class ITP1_3_D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int count = 0;

        for(;num1 < num2 + 1; num1 += 1){
            if(num3 % num1 == 0){
                count++;
            }
        }

        System.out.println(count);
    }


}
