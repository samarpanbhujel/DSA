package InsertionSort;

public class Main {
    public static void main(String [] args) {
        int arr[]={6,5,2,3,1};
        int size=arr.length;
        int key,j;
        for (int x : arr) {
            System.out.print(x+" ");
        }
        System.out.println();
        for (int i=1;i<size;i++) {
            key=arr[i];
            j=i-1;
            while (j>=0 && arr[j]>key) {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        for (int x : arr) {
            System.out.print(x+" ");
        }
    }
}
