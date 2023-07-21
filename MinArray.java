public class MinArray {
    public static void main(String args[]) {
        int arr[] = new int[] {12, 23, 45, 65, 76};
        int i, min;
        min = arr[0];
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
              min = arr[i];
            }
        }
        System.out.println("Minimum element of an array is: " + min);
    }
    
}
