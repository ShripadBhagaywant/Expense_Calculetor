import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //Scanner class obj.
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            //Get the user choice.
            System.out.println("Welcome to group expense calculate");
            System.out.println("Press 1 : Add the expense");
            System.out.println("Press 2 : Calculate the debts");
            System.out.println("Press 3 : Exit");

            System.out.println();

            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();

            System.out.println();

            switch (choice)
            {
                case 1:
                    Expense.addExpense();
                    break;

                case 2:
                    Expense.calculateExpense();
                    break;

                case 3:
                   Expense.exit();
                    break;

                default:
                    System.out.println("Bye Bye Buddy !!!");
            }
            System.out.println();
        }
    }
}