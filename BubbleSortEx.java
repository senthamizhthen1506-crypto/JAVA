public class BubbleSortEx {
    public static void bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                   int  temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                
                }

            }
        }

    }
    public static void main(String[]args){
        int[] array={5,2,8,1,6};
        bubbleSort(array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]+" ");
        }

    }
    
}
    

