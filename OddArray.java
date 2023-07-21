public class OddArray {
    public static void main(String args[]) {
        int i;
        int arr[] = new int[] {1,2,3,4,5};
        System.out.println("Elements present at odd positions are: ");
        for(i=0;i<arr.length;i+=2)
        {
            System.out.println(arr[i]);
        }
    }
    
}
