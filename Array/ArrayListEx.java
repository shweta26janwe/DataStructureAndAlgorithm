  import java.util.ArrayList;
  import java.util.Scanner;
  public class ArrayListEx{
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
        
  //syntax
        ArrayList<Integer> list = new ArrayList<>();

        // list.add(45);
        // list.add(455);
        // list.add(485);
        // list.add(545);
        // list.add(405);
        // list.add(465);
        // list.add(65);
        // list.add(48);
        // list.add(458);
        // list.add(459);
        // list.add(1);
        // list.add(435);
        // list.add(445);
        
        // System.out.println(list.contains(45));
        // System.out.println(list);
        // list.set(0,100);
        // list.remove(4);
        // System.out.println(list);


//input from user
    System.out.println("enter the list element:");
    for(int i = 0;i<5;i++){
        list.add(input.nextInt());
    }
//diplay list
    for(int i = 0;i<5;i++){
        System.out.println(list.get(i)); //pass index here list[index] will not work here  
    }
    }
  }