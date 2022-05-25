package lecture.week12.command;

public class SellStockOrder implements Order {
    StockTrade stock;

    SellStockOrder(StockTrade stock){
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }

    @Override
    public String toString(){
        return "SellStockOrder : " + this.hashCode() + ", Referenced StockTrade : " + stock.hashCode();
    }
}
