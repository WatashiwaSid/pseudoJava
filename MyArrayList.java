import java.util.*;

public class MyArrayList 
{
    public static void main(String args[])
    {
        ArrayList<Integer> mylist = new ArrayList<>();
        mylist.add(10);
        mylist.add(20);
        mylist.add(30);
        mylist.add(40);
        mylist.add(50);
       
        System.out.print("Original Array List : ");
        for(int i=0; i<mylist.size(); i++)
        {
            System.out.print(mylist.get(i));
            System.out.print(" ");
        }

        System.out.print("\nEnter Value to insert in Array List : ");
        Scanner sc = new Scanner(System.in);
        int input = 0;
        input = sc.nextInt();
        System.out.print("Enter index for insertion operation : ");
        int userindex = 0;
        userindex = sc.nextInt();
        sc.close();
        mylist.add(userindex, input);

        System.out.print("New Array List : ");
        for(int i=0; i<mylist.size(); i++)
        {
            System.out.print(mylist.get(i));
            System.out.print(" ");
        }
    }
}
