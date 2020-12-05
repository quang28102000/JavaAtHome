import java.util.*;

public class StockMain
{
    public static void main (String[] args)
    {
        Scanner console = new Scanner (System.in);

        //first Stock object
        System.out.print("First stock's symbol: ");
        String symbol1 = console.next();//prompt object's name
        Stock stock1 = new Stock (symbol1);//construct the first object
        double profit1 = makePurchases(stock1, console);//compute the first object


        //second stock object
        System.out.print("Second stock's symbol: ");
        String symbol2 = console.next();//prompt object 2 name
        Stock stock2 = new Stock (symbol2);//construct the second object
        double profit2 = makePurchases(stock2, console);//compute the second object

        //report which stock made more money
        if (profit1 > profit2)
        {
            System.out.println(symbol1 + " was more profitable than " + symbol2 + ".");
        }
        else if (profit2 > profit1)
        {
            System.out.println(symbol2 + " was more profitable than " + symbol1 + ".");
        }
        else
        {
            System.out.println(symbol1 + " and " + symbol2 + " are equally profitable.");
        }
    }

    //make purchase of stock and return the profit
    //accessor
    public static double makePurchases (Stock currentStock, Scanner console)
    {
        System.out.print ("How many purchases did you make? ");
        int numPurchases = console.nextInt(); //input the number of purchases (numPurchases) - Scanner class

        //ask about each purchase
        for (int i = 1; i <= numPurchases; i++)
        {
            System.out.println(i + ": How many shares, at what price per share?  ");
            int numShares  = console.nextInt();//input the number of shares (numShares) - Scanner class
            double pricePerShare = console.nextDouble();//input the amount of price per share (pricePerShare)

            //Ask the Stock object to record this purchase
            currentStock.purchase(numShares, pricePerShare);
        }

        //use stock object to compute profit
        System.out.print("What is today's price per share? ");
        //prompt the currentPrice of each share
        double currentPrice = console.nextDouble();
        double profit = currentStock.getProfit(currentPrice);//calculate profit of each share (profit)
        System.out.println("Net profit/ loss: $" + profit);
        System.out.println();
        return profit;
    }
}
