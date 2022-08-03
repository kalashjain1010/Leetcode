
    /*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.*/

import java.util.Scanner;

public class twoSum2 {
    public static void main(String[] args) {
        int n;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("give target element:");
        int target = sc.nextInt();


        System.out.print("Enter the number of elements you want to store: ");
        // reading the number of elements from the that we want to enter
        n = sc.nextInt();
        // creates an array in the memory of length n
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            // reading array elements from the user
            nums[i] = sc.nextInt();
        }
            
        int start=0,end   =nums.length-1;
        
        while(start<end){
                if(nums[start]+nums[end]>target){
                      end--;
                      if (nums[start]+nums[end]==target) {
                        System.out.println("array is at index: "+ start +" and "+end);
                        break;
                    }
                  }
             else if(nums[start]+nums[end]<target){
                    start ++;
                    if (nums[start]+nums[end]==target) {
                        System.out.println("array is at index: "+ start +" and "+end);
                        break;
                      }
                 }
        }
    }
}

