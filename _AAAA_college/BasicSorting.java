
public class BasicSorting {
public static void selectionSort(int arr[]) {
for (int turn=0; turn<arr.length; turn++) {
  int minPos = turn;
for (int j=turn+1; j<arr.length; j++){
if (arr [minPos] > arr[j]) {
  minPos = j;
    }
  }
 // swap
 int temp = arr[turn];
 arr[turn] = arr [minPos];
 arr [minPos] = temp ;
  }
}
public static void Print(int arr[]){
  for(int i =0; i<arr.length; i++){


  System.out.print(arr[i]+" ");
  }
  System.out.println( );

}  
public static void main(String args[]){

    int arr[] = {44,33,55,22,11};
    selectionSort(arr);
    Print(arr);
}
}

