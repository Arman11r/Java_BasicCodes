public class first{
    public static void SelectionSort(int arr[]){
        for(int turn=0;turn<arr.length;turn++){
        int minpos = turn;

        for(int j=turn+1;j<arr.length;j++){
            if(arr[minpos] > arr[j]){
                minpos = j;
            }

        }
        int temp = arr[turn];
        arr[turn] = arr[minpos];
        arr[minpos] = temp;
    }
}
        public static void Print(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
        }
    public static void main(String args[]){
        int arr[] = { 5,3,2,4,1 };
        SelectionSort(arr);
        Print(arr);

    }
}
    