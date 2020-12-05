package Chapter09_AcessingInheritedFields;

public class Stock extends ShareAsset
    implements Asset
{
    private int totalShares;

    public Stock (String symbol, double currentPrice)
    {
        super(symbol,currentPrice);
        totalShares = 0;
    }

    public double getMarketValue()
    {
        return totalShares * getCurrentPrice();
    }

    public double getTotalShares()
    {
        return totalShares;
    }

    public void purchase (int shares, double pricePerShare)
    {
        totalShares += shares;
        addCost(shares * pricePerShare);
    }
}
