package Chapter09_AcessingInheritedFields;

public class Cash implements Asset
{
    private double amount;

    public Cash (double amount)
    {
        this.amount = amount;
    }

    //sets the amount of cash invested to the given value
    public void setAmount (double amount)
    {
        this.amount = amount;
    }

    public double getMarketValue()
    {
        return amount;
    }
    public double getProfit()

    {
        return 0.0;
    }
}
