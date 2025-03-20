import java.util.Scanner;
import java.util.Arrays;
public class PassingFunctions{
    public static void main(String[] args){
  int[] nums = {35, 98, 67, 87};
  System.out.println(Arrays.toString(nums));
  change(nums);
  System.out.println(Arrays.toString(nums));
    }
static void change(int[] arr){
    arr[1] = 34;
}
}