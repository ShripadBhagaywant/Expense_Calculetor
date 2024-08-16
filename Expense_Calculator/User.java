

public class User
{
    //Define the amount.
    private  double amount;

    //Define group array.
    private String[]group;

    //Calling the constructor
    User( Double amount, String[] group)
    {
        //Initialization the amount.
        this.amount = amount;

        //Initialization the group.
        this.group=group;
    }

    //Get user input.
    public String[] getGroup()
    {
        return group;
    }

    //Get the user input.
    public Double getAmount()
    {
        return amount;
    }

}
