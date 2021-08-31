import java.util.Arrays;
public class InsertionSort {
    public static void main(String args[]) {
      int[] arr = {8,4,1,5,9,2};
      System.out.println("The unsorted array is: " + Arrays.toString(arr));
      
      for(int i = 1; i<arr.length; i++){
          int temp = arr[i];
          int j = i-1;
          while(j>=0 && arr[j]>temp){
              arr[j+1] = arr[j];
              j--;
          }
          arr[j+1] = temp;
          
          
          System.out.println("Array after " + i + " iteration is: " + Arrays.toString(arr));
      }
        
    System.out.print("The Sorted Array is " + Arrays.toString(arr));
        
    }
}
