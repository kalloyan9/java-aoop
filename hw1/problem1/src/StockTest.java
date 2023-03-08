class StockTest {
    public static void main(String[] args) {
        // create an object of class Stock to be tested
        Stock stock = new Stock("dumbSym", "dumbName");

        // print symbol, name and prices
        System.out.println("Stock symbol: " + stock.getSymbol() + "\n");
        System.out.println("Stock name: " + stock.getName() + "\n");
        System.out.println("Stock previous closing price: " + stock.getPreviousClosingPrice() + "\n");
        System.out.println("Stock current price: " + stock.getCurrentPrice() + "\n");

        // give some price values
        double currentPrice = 103.99;
        double previousPrice = 76.99;
        stock.setCurrentPrice(currentPrice);
        stock.setPreviousClosingPrice(previousPrice);
        // print the prices
        System.out.println("Stock previous closing price: " + stock.getPreviousClosingPrice() + "\n");
        System.out.println("Stock current price: " + stock.getCurrentPrice() + "\n");


        // print the change in percentage
        System.out.printf("The change in the stock's price in percents is: %.2f \n", stock.changePercent());
    }
}
