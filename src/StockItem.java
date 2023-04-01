public class StockItem {
    final String stockNumber;
    final String name;
    double price;
    int totalStock = 0;
    double salesTax;

    public StockItem(String setStockNumber, String setName, double setPrice){
        stockNumber = setStockNumber;
        name = setName;
        price = setPrice;
        salesTax = 10;
    }

    public void setPrice(double setPrice){
        price = setPrice;
    }
    public void increaseTotalStock(int additionalStock){
        totalStock += additionalStock;
    }

    public String getStockNumber(){
        return stockNumber;
    }

    public String getName() {
        return name;
    }

    public int getTotalStock() {
        return totalStock;
    }

    public double getPrice() {
        return price;
    }

    public double calculateTotalPrice(){
        return price * totalStock;
    }

    public void setSalesTax (double setSalesTax){
        salesTax = setSalesTax;
    }
}
