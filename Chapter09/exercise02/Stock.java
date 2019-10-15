package Chapter09.exercise02;

public class Stock {

	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;

	public Stock(String symbol, String name) {

		this.symbol = symbol;
		this.name = name;

	}

	public double getChancePercent() {

		return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100.0;

	}

	
	
	
	
	public static void main(String[] args) {
		
		
		Stock stock = new Stock("ORCL", "Oracle Corporation");
		
		stock.previousClosingPrice = 34.5;
		stock.currentPrice = 34.35;

		System.out.println(stock.getChancePercent());
		
	}
}
