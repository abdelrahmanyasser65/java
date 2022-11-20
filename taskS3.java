import java.util.List;

public class taskS3 {
    public static void main(String [] arg){
       int []arr ={4,7,10,2,6};
       sort(arr);
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
    }
    public static void sort(int[] sortArr){
        for(int j=0;j<sortArr.length;j++){
           int i=j;
           
           while(i>0 && sortArr[i-1]>sortArr[i]){
            int k=sortArr[i];
            sortArr[i]=sortArr[i-1];
sortArr[i-1]=k;
i=i-1;
        }
           
        }
    }
    
}
