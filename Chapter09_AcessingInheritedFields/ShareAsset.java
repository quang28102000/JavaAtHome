package Chapter09_AcessingInheritedFields;

public abstract class ShareAsset implements Asset
{
    private String symbol;
    private double totalCost;
    private double currentPrice;

    public ShareAsset (String symbol, double currentPrice)
    {
        this.symbol = symbol;
        this.currentPrice = currentPrice;
        totalCost = 0.0;
    }
    //so tien cong don la thay doi
    public void addCost (double cost)
    {
        totalCost += cost;
    }

    //dat set vao currentStock vi minh phai input su thay doi gia tri hien thoi cua stock
    //return so tien hien tai cua stock
    public double getCurrentPrice()
    {
        return currentPrice;
    }

    //returns the market value of this asset
    public abstract double getMarketValue();

    public double getProfit()
    {
        return (getMarketValue() - totalCost);
    }

    //khong can set vi tong so tien co duoc la tu su thay doi gia tri cua stock
    //lay ra tong so tien
    public double getTotalCost()
    {
        return totalCost;
    }

    //input vao gia tri hien thoi cua stock
    //sets the current price of this asset
    public void setCurrentPrice (double currentPrice)
    {
        this.currentPrice = currentPrice;
    }
}
