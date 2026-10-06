package SelectionSort;

public class Main {
    public static void main(String[] args) {
        int nums[]={6,5,2,3,1};
        int size=nums.length;
        int MinIndex=-1;
        int temp;

        for (int x:nums) {
            System.out.print(x+ " ");
        }
        System.out.println();

        for (int i=0;i<size-1;i++) {
            MinIndex=i;
            for(int j=i+1;j<size;j++) {
                if (nums[j] < nums[MinIndex]  ) {
                    MinIndex=j;
                }
            }
            temp=nums[MinIndex];
            nums[MinIndex]=nums[i];
            nums[i]= temp;
        }

        for (int x:nums) {
            System.out.print(x+ " ");
        }
    }
    
}
