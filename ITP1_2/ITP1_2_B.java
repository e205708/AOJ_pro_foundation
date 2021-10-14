import java.util.Scanner;

class ITP1_2_B {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Scanner scanner = new Scanner("43 22 13");
        int[] nums = new int[3];
        for(int i=0 ;i < 3 ;i++){
            nums[i] = scanner.nextInt();
        }

        
        scanner.close();

        if(nums[0] < nums[1] && nums[1] < nums[2]){
            System.out.println("Yes");
        }else {
            System.out.println(("No"));
        }
    }
}
