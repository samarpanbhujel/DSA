package MergeSort;

public class Main {
    public static void main (String [] args ) {
        int[] arr ={6,3,4,2,5,1};
        for (int x : arr) {
            System.out.print(x+" ");
        }
        System.out.println();
        mergesort(arr,0,arr.length-1);
        for (int x : arr) {
            System.out.print(x+" ");
        }

    }

    private static void mergesort(int[] arr, int l, int r) {
        if (l<r) {
            int m=(l+r)/2;
            mergesort(arr,l,m);
            mergesort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }

    private static void merge(int[] arr, int l, int m,int r) {

        int n1= m-l+1;
        int n2=r-m;

        int[] larr=new int[n1];
        int[] rarr=new int[n2];

        for (int x=0;x<n1;x++) {
            larr[x]=arr[l+x];
        }

        for (int x=0;x<n2;x++) {
            rarr[x]=arr[m+1+x];
        }

        int i=0;
        int j=0;
        int k=l;
        while(i<n1 &&j<n2) {
            if (larr[i] <= rarr[j]) {
                arr[k]=larr[i];
                i++;
            }
            else {
                arr[k]=rarr[j];
                j++;
            }
            k++;
        }
        while (i<n1) {
            arr[k]=larr[i];
            i++;
            k++;
        }
        while (j<n2 ) {
            arr[k]=rarr[j];
            j++;
            k++;
        }
    }
}
