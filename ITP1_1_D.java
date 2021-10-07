import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        //Scanner scanner = new Scanner("46979");
        int time = scanner.nextInt();
        int hour = time / 3600;
        int min =  time%3600 / 60;
        int sec = time%60;

        System.out.printf("%d:%d:%d\n",hour,min,sec);
    }
}