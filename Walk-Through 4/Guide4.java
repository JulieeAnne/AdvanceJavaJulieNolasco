import java.util.Arrays;
import java.util.Scanner;

public class Guide4 {
    
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                return mid;
            }
          
            if (arr[mid] < target) {
                left = mid + 1;
            } 
          
            else {
                right = mid - 1;
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
     System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        
        System.out.println("Enter " + size + " sorted numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
        
        System.out.print("Enter a number to search: ");
        int target = scanner.nextInt();
        
        int result = binarySearch(numbers, target);
        

        if (result != -1) {
            System.out.println("Number " + target + " found at index " + result);
        } else {
            System.out.println("Number " + target + " not found in the array.");
        }
        
        scanner.close();
    }
}
