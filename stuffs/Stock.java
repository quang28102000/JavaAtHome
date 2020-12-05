import java.util.*;

public class Stock
{
    //skeleton of Stock Class
    //fields
    private String symbol;
    private int totalShares;
    private double totalCost;

    //constructors
    //initialize a new Stock with no shares purchased
    //PRE: symbol != NULL
    public Stock (String symbol)
    {
        if (symbol == null)
        {
            throw new IllegalArgumentException();
        }

        this.symbol = symbol; //stock symbol, e.g: 'YHOO"
        totalShares = 0; //total shares purchased
        totalCost = 0.0; //total cost for all shares

        //accessor - return stock's symbol
    }
    //Accessor
    public String getSymbol()
    {
        return symbol;
    }
    public int getTotalShares()
    {
        return totalShares;
    }
    public double getTotalCost()
    {
        return totalCost;
    }


    //retrieval the of the total profit/loss
    //accessor as having a return values & read-only function
    public double getProfit (double currentPrice)
    {
        if (currentPrice < 0)
        {
            throw new IllegalArgumentException();
        }

        return ((totalShares * currentPrice) - totalCost);
    }

    //recording a purchase
    //mutator as having void return type and accepting parameters
    //adding the number of new shares and the total of cost with new values
    public void purchase (int shares, double pricePerShare)
    {
        if (shares < 0 || pricePerShare < 0)
        {
            throw new IllegalArgumentException();
        }

        totalShares += shares;
        totalCost += (shares * pricePerShare);
    }
}

