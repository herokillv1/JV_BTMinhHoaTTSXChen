public class InsertionSort {
    public static void main(String[] args) {
         int[] arr = {12,1,9,4,6,5,10,-4};

        for (int j =0 ; j< arr.length;j++){
            System.out.print(arr[j]+"   ");
        }
        System.out.println();

         for (int i=0;i<arr.length;i++){
             int X = arr[i];
             int k ;
             for (k=i-1;k>=0 && arr[k] > X;k--){
                 System.out.println(arr[k+1]+" đổi chỗ cho "+arr[k]);
                 arr[k+1] = arr[k];
             }

             arr[k+1] = X;
             System.out.println();

             for (int j =0 ; j< arr.length;j++){
                 System.out.print(arr[j]+"   ");
             }
             System.out.println();
         }


    }

}
