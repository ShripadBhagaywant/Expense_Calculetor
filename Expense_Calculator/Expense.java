import java.util.HashMap;
import java.util.Scanner;

public class Expense
{
    //Scanner class obj.
    private  static Scanner sc = new Scanner(System.in);

    //Using Hashmap.
    private static HashMap<String, User> map = new HashMap<>();

    //Add user expense.
    public  static  void addExpense()
    {

        //Get the name from user.
        System.out.print("Enter Spender name :");
        String name = sc.nextLine();

        //Validate the name.
        if (map.containsKey(name))
        {
            System.out.print("Users  exist!");
            return;
        }

        //Get the amount for user.
        System.out.print("Enter the total spent amount :");
        Double amount = sc.nextDouble();
        sc.nextLine();

        //Get the group member from user.
        System.out.print("Enter the group member including yourself :");
        String groupInput = sc.nextLine();
        String[] group = groupInput.split(",");
        System.out.println();

        //Put the value into map.
        map.put(name,new User(amount,group));

        //Debit is Added.
        System.out.println("Debit is added successfully!!");
    }

    //Calculate The debit.
    public static  void calculateExpense()
    {
        double total_Expense = 0;
        int total_Members = 0;

        for (User user : map.values())
        {
            total_Expense += user.getAmount();
            total_Members += user.getGroup().length;
        }
        System.out.print("Debited amount is : " +total_Expense);
        System.out.println();
        System.out.print(" Total amount divided into the group members  : " +total_Members);


        System.out.println();

        double expense_Per_Person = total_Expense / total_Members;
        System.out.print("Debited calculation is : " +expense_Per_Person);

        System.out.println();

        System.out.println("Expense Calculation");
        for(String name : map.keySet())
        {
            User user = map.get(name);
            double owes = expense_Per_Person * user.getGroup().length - user.getAmount();
            System.out.println(name + " => " + owes);
        }
    }

    //Terminate the program.
    public static void exit()
    {
        System.exit(0);
    }
}
