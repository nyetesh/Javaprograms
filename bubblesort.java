public class MyClass {
    public static void main(String args[]) {
      int[] arr = {1,5,3,2,7,6,8};
      int n = arr.length;
      
      for(int i = 0; i<=n-1; i++){
        for(int j = i+1; j<n; j++){
            if(arr[i]>arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            else{
                continue;
            }
            }
          }
          
        for(int i : arr){
            System.out.print(i + ",");
        }
      }
    }
