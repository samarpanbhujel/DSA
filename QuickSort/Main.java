package QuickSort;

public class Main {
    public static void main (String [] args) {
        int[] arr = {6,5,2,3,1};
        for (int x: arr) {
            System.out.print(x+" " );
        }
        System.out.println();
        quicksort(arr,0,arr.length-1);
        for (int x: arr) {
            System.out.print(x+" " );
        }
        
    }
    private static void quicksort(int[] arr, int low, int high) {
    
        if (low<high) {
            int pivot=partition(arr,low,high);
            quicksort(arr, low,pivot-1);
            quicksort(arr, pivot+1, high);
        }

    }
    private static int partition(int[] arr, int low, int high) {
        int pivot =arr[high];
        int i=low-1;
        for (int j=low;j<high+1;j++) {
            if (arr[j]<pivot) {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[high];
        arr[high]=arr[i+1];
        arr[i+1]=temp;
        return i+1;
    }
}
