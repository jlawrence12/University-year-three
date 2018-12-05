class Test{

    public static void main (String[] args){
        swapArray rotate = new swapArray();
        int array[] = {1,2,3,4,5,6,7};
        rotate.swapArray(array, 2);
        rotate.printArray(array, 7);
    
    }

    public static void leftRotate(int[] arr, int d, int n) 
    { 
        for (int i = 0; i < d; i++) 
        swapArray(arr, n); 
    } 

    public static void swapArray(int[] arr, int j){
        int temp;
        temp = arr[0];
        for(int i=0;i<j-1;i++){
            arr[i] = arr[i+1];
            arr[i] = temp;
        }
    }
    public static void printArray(int[] arr, int j){
        
        for(int i=0;i<j;i++){
            System.out.print(arr[i] + " ");
        }


    }

}
