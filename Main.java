//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Taylor Vonville
 */

 public class Main {
  public static void main(String[] args) {
    System.out.println("Taylor Vonville   Lab#1");    
    System.out.println("hello, world!");

    Lab1 lab = new Lab1();

    // Create an array with values {5, 9, 3, 12, 7, 3, 11, 5}.
    int[] nums = {5, 9, 3, 12, 7, 3, 11, 5};

    // Output the array in order using a while loop.
    int i = 0;
    System.out.println("Array in order: ");
    while (i < nums.length) {
      System.out.print(nums[i] + " ");
      i++;
    }
    System.out.println(); // For new line

    // Output the array in reverse using a for loop
    System.out.println("Array in reverse: ");
    for (int j = nums.length - 1; j >= 0; j--) {
      System.out.print(nums[j] + " ");
    }
    System.out.println(); // For new line

    // Output the first and last values of the array
    System.out.println("First value: " + nums[0]);
    System.out.println("Last value: " + nums[nums.length - 1]);

    // Call the methods created in Lab1
    System.out.println("Maximum of 23 and 45: " + lab.max(23, 45));
    System.out.println("Minimum of 23 and 45: " + lab.min(23, 45));
    System.out.println("Sum of the array: " + lab.sum(nums));
    System.out.println("Average of the array: " + lab.average(nums));
    System.out.println("Maximum value in array: " + lab.max(nums));
    System.out.println("Minimum value in array: " + lab.min(nums));
  }
}

// Add all of the methods here
class Lab1 {
  // max(int a, int b): Use an if-statement to return the maximum value.
  public int max(int a, int b) {
    if (a > b) {
      return a;
    } else {
      return b;
    }
  }

  // min(int a, int b): Use an if-statement to return the minimum value.
  public int min(int a, int b) {
    if (a < b) {
      return a;
    } else {
      return b;
    }
  }

  // sum(int[] nums): Return the sum of all values in the array.
  public int sum(int[] nums) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
    }
    return sum;
  }

  // average(int[] nums): Use a foreach loop to return the average.
  public double average(int[] nums) {
    int sum = 0;
    for (int num : nums) {
      sum += num;
    }
    return (double) sum / nums.length;
  }

  // max(int[] nums): Use a for loop to return the maximum value.
  public int max(int[] nums) {
    int max = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
      }
    }
    return max;
  }

  // min(int[] nums): Use a for loop to return the minimum value.
  public int min(int[] nums) {
    int min = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] < min) {
        min = nums[i];
      }
    }
    return min;
  }
}