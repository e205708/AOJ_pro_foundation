import java.util.Scanner;

public class ITP1_3_C {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        while(true){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if(num1 == 0 && num2 == 0){
                break;
            }
            if(num1 < num2){
                System.out.println(num1 + " " + num2);
            }else{
                System.out.println(num2 + " " + num1);
            }
        }
    }
}
