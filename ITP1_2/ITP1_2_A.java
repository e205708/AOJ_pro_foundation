import java.util.Scanner;

class ITP1_2_A {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Scanner scanner = new Scanner("43 22");
        int[] nums = new int[2];
        for(int i=0 ;i < 2 ;i++){
            nums[i] = scanner.nextInt();
        }

        
        scanner.close();

        if(nums[0] < nums[1]){
            System.out.println("a < b");
        }else if(nums[0] > nums[1]){
            System.out.println("a > b");
        }else if(nums[0] == nums[1]){
            System.out.println("a == b");
        }
    }
}
