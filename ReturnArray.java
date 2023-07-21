public class ReturnArray {

    static int[] get()
    {
        return new int[] {1,2,3,4,5};
    }

    public static void main(String args[]) {
        int arr[] = get();
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i] + "  ");
        }
    }
    
}
