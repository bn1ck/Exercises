public class Exercise1 {
     
    int partition(int arr[], int left, int right)
    {
          int i = left, j = right;
          int tmp;
          int pivot = arr[(left + right) / 2];
         
          while (i <= j) {
                while (arr[i] < pivot)
                      i++;
                while (arr[j] > pivot)
                      j--;
                if (i <= j) {
                      tmp = arr[i];
                      arr[i] = arr[j];
                      arr[j] = tmp;
                      i++;
                      j--;
                }
          };
         
          return i;
    }
     
    void quickSort(int arr[], int left, int right) {
          int index = partition(arr, left, right);
          if (left < index - 1)
              quickSort(arr, left, index - 1);
          if (index < right)
              quickSort(arr, index, right);
          
    }
      
     
    public static void main(String a[]){
         
    	Exercise1 sorter = new Exercise1();
        int[] input = {3,1,3,1,24,2,45,20,56,75,2,56,99,53};
        sorter.quickSort(input,0,input.length-1);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }
    }
}