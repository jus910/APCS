public class QuickSelect{
  public static int quickSelect( int arr[], int y)
  {
    int s = Partition.partition(arr,0,arr.length-1,0);
    int i=0;
    for(;;){
      //System.out.println("huh"+i);
      if (s==(y-1)){
        return arr[s];
      } else
      if (s<(y-1)) {
        s = Partition.partition(arr,s,arr.length-1,s+1);
      } else
      if (s>(y-1)){
        s = Partition.partition(arr,0,s,0);
      }
      i++;
    }
  }

  public static void main(String[] args){
    // test case
    int[] arr1 = {8,21,17,69,343};
    Partition.printArr(arr1);
    for(int i=1; i<=arr1.length;i++){
      Partition.shuffle(arr1);
      System.out.println(quickSelect(arr1,i));
    } // Should print elements in doscending order

    // best case with y at the upper bound
    int[] arr2 = {0,1,2,3,4};
    Partition.printArr(arr2);
    System.out.println(quickSelect(arr2,4));

    // worst case with y at the upper bound
    int[] arr3 = {4,3,2,1,0};
    Partition.printArr(arr3);
    System.out.println(quickSelect(arr3,4));
  }
}
