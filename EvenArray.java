public class EvenArray {
    public static void main(String args[]) {
        int arr[] = new int[] {1,2,3,4,5};
        int i;
        System.out.println("Element at even positions are: ");
        for(i=1;i<arr.length;i+=2)
        {
            System.out.println(arr[i]);
        }
    }
}
