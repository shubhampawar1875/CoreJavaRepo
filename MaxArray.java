public class MaxArray {
    public static void main(String args[]) {
        int arr[] = new int[] {21, 23, 56, 48, 67};
        int i, max;
        max = arr[0];
        System.out.println("Maximum element of an array is: ");
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.print(max);
    }
    
}
