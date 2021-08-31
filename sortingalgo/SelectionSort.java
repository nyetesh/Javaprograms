import java.util.Arrays;

public class SelectionSort {
    public static void main(String args[]) {
      int[] arr = {4,1,9,2,3,6};
      System.out.println("The unsorted array is: " + Arrays.toString(arr));
      for(int i = 0; i<arr.length-1; i++){
          int min = i;
          for(int j = i+1; j<arr.length; j++){
              if(arr[j]<arr[min]){
                  min = j;
              }
          }
          if(min!=i){
              swap(arr, min, i);
          }
          System.out.println("Array after " + i+1 + " iteration is: "+ Arrays.toString(arr));
      }
        
    System.out.print("The Sorted Array is " + Arrays.toString(arr));
        
    }
    
    public static void swap(int[] arr, int min, int i){
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
    }
}
