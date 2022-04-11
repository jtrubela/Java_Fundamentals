import java.util.Arrays;
 
public class Sort
{
    public static void main(String[] args)
    {
        // Our arr contains 8 elements
        int[] arr = {9, 4, 12, 2, 6, 8, 18};
 
        Arrays.sort(arr);
 
        System.out.printf("Modified arr[] : %s",
                          Arrays.toString(arr));
    }
}