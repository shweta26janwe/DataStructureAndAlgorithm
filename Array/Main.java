import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    Scanner input= new Scanner(System.in);

//datatype[] variable_name = new datatype[size];
//store 5 roll no
     //int[] roll= new int[5];

//or directly
     //int[] oll = {23, 24, 13 ,8};

//declaration
    int[] rono;
//initialization actually heap momory is created
//heap memory are not in continues 
  rono = new int[5];
// empty array output is
    System.out.print(" empty  string array output : "); 
    System.out.println(rono[0]);


String[] str1 = new String[5];
System.out.print(" empty  string array output : ");
 System.out.println(str1[0]);
     
    
    int[] arr = new int[5];
    arr[0] = 23;
    arr[1] = 45;
    arr[2] = 76;
    arr[3] = 87;
    arr[4] = 12;
    System.out.println(arr[3]);

//input using for loop
   
//arrays of primitive type
   int[] arr1 = new int[5];
   System.out.println("enter the 5 no. of elements");
   for(int i = 0;i<arr1.length;i++)
   {
   arr1[i]=input.nextInt();
   }
   System.out.println(Arrays.toString(arr1));
   System.out.print("Elements are: ");
//display output
  
    // for(int i = 0;i<arr1.length;i++)
    // {
    // System.out.print(arr1[i] + " ");
    // }
 
//using advanced    
    for(int num : arr1)
    {
        System.out.print(num + " ");
    }
    System.out.println();

// arrays of object
    String[] str = new String[5];
    System.out.println("Enter the five string element");
    for(int i = 0; i<str.length; i++){
        str[i] = input.next();
    }
    System.out.print("Enter string is:");
    System.out.println(Arrays.toString(str));
    // for(String num : str)
    // {
    //     System.out.print(num + " ");
    // }

    // modify
        System.out.print("Modify string is:");
        str[1]= "shweta";
        System.out.println(Arrays.toString(str));  

}
} 