import java.util.Scanner;

class ITP1_3_B{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int inputnum;

        while(true){
            inputnum = sc.nextInt();
            if(inputnum == 0){
                break;
            }
            count++;
            System.out.println("Case " + count + ": " + inputnum);
        }
    }
}