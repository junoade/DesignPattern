package lecture.week12.command;

public class BuyStockOrder implements Order {
    StockTrade stock;

    BuyStockOrder(StockTrade stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }

    @Override
    public String toString(){
        return "BuyStockOrder : " + this.hashCode() + ", Referenced StockTrade : " + stock.hashCode();
    }
}
