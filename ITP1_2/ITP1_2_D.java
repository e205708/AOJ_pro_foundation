import java.util.Scanner;

class ITP1_2_D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Scanner sc = new Scanner("5 4 2 2 1");

        int W = sc.nextInt();
        int H = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();

        if(0 <=x-r && x+r <=W){
            if(0 <= y-r && y+r <= H){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

            }else{
                System.out.println("No");
            }
        }

    }

