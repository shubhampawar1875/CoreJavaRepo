public class DuplicateArray {
    public static void main(String args[]) {
        int arr[] = new int[] {1,2, 2, 3, 4, 5, 6, 3, 8, 5};
        int i, j;
        System.out.println("Duplicate elements of array are: ");
        for(i=0;i<arr.length;i++)
        {
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.println(arr[j]);
                }
            }
        }
    }
    
}
