import java.util.Arrays;
import java.util.Scanner;

public class Guide5 {
    
    public static void insertionSort(String[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of strings in the array: ");
        int size = scanner.nextInt();
        scanner.nextLine(); 
        String[] words = new String[size];
        
        System.out.println("Enter " + size + " strings:");
        for (int i = 0; i < size; i++) {
            words[i] = scanner.nextLine();
        }
        
        insertionSort(words);
        
        System.out.println("Sorted Array: " + Arrays.toString(words));
        
        scanner.close();
    }
}
