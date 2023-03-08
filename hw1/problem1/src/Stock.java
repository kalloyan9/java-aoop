class Stock {
    // c-tor
    public Stock(String symbol, String name) {
        // validate strings
        if (symbol == null) {
            symbol = "";
        }

        if (name == null) {
            name = "";
        }

        // init values
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = 0.0;
        this.currentPrice = 0.0;
    }

    // getters:
    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    // setters:
    public void setPreviousClosingPrice(double previousClosingPrice) {
        // validate the price
        if (previousClosingPrice < 0.0) {
            previousClosingPrice = 0.0;
        }

        this.previousClosingPrice = previousClosingPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        // validate the price
        if (currentPrice < 0.0) {
            currentPrice = 0.0;
        }

        this.currentPrice = currentPrice;
    }

    // Returns the percentage of change the stock
    public double changePercent() {
        // prevent dividing by 0
        if (previousClosingPrice == 0.0) {
            return 0.0;
        } else {
            // calculating the percentage of change in the price
            return (currentPrice - previousClosingPrice) / previousClosingPrice * 100.0;
        }
    }

    // data members
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;
}
