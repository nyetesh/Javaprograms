public class BubbleSort{
    public static void Sort(int[] list){
        boolean needNextPass = true;
        for(int k = 1; k<list.length && needNextPass; k++){
            needNextPass = false;
            for(int i = 0; i<list.length-k; i++){
                if(list[i] > list[i+1]){
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                    
                    needNextPass = true;
                }
            } 
        }
    }
    
    public static void main(String[] args){
        int[] list = {2,9,5,4,8,1};
        Sort(list);
        for(int i=0; i<list.length;i++){
           System.out.print(list[i] + ",");
        }
        
       
    }
}    
