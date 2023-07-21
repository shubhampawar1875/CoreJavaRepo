public class CopyArray 
{
    public static void main(String args[]) {
        int i;
        int arr[] = new int[] {1, 2, 3, 4, 5};

        int arr1[] = new int[arr.length];

        System.out.println("Elements of first array are: ");
        for(i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println("Coping elements of First array into Another array: ");
         for(i=0;i<arr1.length;i++)
         {
            arr1[i] = arr[i];
            System.out.println(arr1[i]);
            
         }
         
    }
}