import java.util.Scanner;
import java.util.Arrays;  

class ITP1_2_C {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Scanner scanner = new Scanner("43 22 13");
        int[] nums = new int[3];
        for(int i=0 ;i < 3 ;i++){
            nums[i] = scanner.nextInt();
        }

        
        scanner.close();

        Arrays.sort(nums);

        System.out.println(nums[0] + " " + nums[1] + " " + nums[2]);
    }
}
