package currencyConverter;

import java.util.ArrayList;
import java.util.HashMap;

public class Currency {
	private String name;
	private String shortName;
	private HashMap<String, Double> exchangeValues = new HashMap<String, Double>();
	
	// "Currency" Constructor
	public Currency(String nameValue, String shortNameValue) {
		this.name = nameValue;
		this.shortName = shortNameValue;
	}
	
	// Getter for name
	public String getName() {
		return this.name;
	}
	
	// Setter for name
	public void setName(String name) {
		this.name = name;
	}
	
	// Getter for shortName
	public String getShortName() {
		return this.shortName;
	}
	
	// Setter for shortName
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	
	// Getter for exchangeValues
	public HashMap<String, Double> getExchangeValues() {
		return this.exchangeValues;
	}
	
	// Setter for exchangeValues
	public void setExchangeValues(String key, Double value) {
		this.exchangeValues.put(key, value);
	}
	
	// Set default values for a currency
	public void defaultValues() {
		String currency = this.name;
		switch (currency) {

			case "US Dollar":
				this.exchangeValues.put("USD", 1.00);
				this.exchangeValues.put("EUR", 0.92);
				this.exchangeValues.put("GBP", 0.78);
				this.exchangeValues.put("CHF", 0.89);
				this.exchangeValues.put("CNY", 7.10);
				this.exchangeValues.put("JPY", 150.00);
				break;

			case "Euro":
				this.exchangeValues.put("USD", 1.09);
				this.exchangeValues.put("EUR", 1.00);
				this.exchangeValues.put("GBP", 0.85);
				this.exchangeValues.put("CHF", 0.97);
				this.exchangeValues.put("CNY", 7.72);
				this.exchangeValues.put("JPY", 163.00);
				break;

			case "British Pound":
				this.exchangeValues.put("USD", 1.28);
				this.exchangeValues.put("EUR", 1.18);
				this.exchangeValues.put("GBP", 1.00);
				this.exchangeValues.put("CHF", 1.14);
				this.exchangeValues.put("CNY", 9.08);
				this.exchangeValues.put("JPY", 192.00);
				break;

			case "Swiss Franc":
				this.exchangeValues.put("USD", 1.12);
				this.exchangeValues.put("EUR", 1.03);
				this.exchangeValues.put("GBP", 0.88);
				this.exchangeValues.put("CHF", 1.00);
				this.exchangeValues.put("CNY", 7.95);
				this.exchangeValues.put("JPY", 172.00);
				break;

			case "Chinese Yuan Renminbi":
				this.exchangeValues.put("USD", 0.14);
				this.exchangeValues.put("EUR", 0.13);
				this.exchangeValues.put("GBP", 0.11);
				this.exchangeValues.put("CHF", 0.13);
				this.exchangeValues.put("CNY", 1.00);
				this.exchangeValues.put("JPY", 21.00);
				break;

			case "Japanese Yen":
				this.exchangeValues.put("USD", 0.0067);
				this.exchangeValues.put("EUR", 0.0061);
				this.exchangeValues.put("GBP", 0.0052);
				this.exchangeValues.put("CHF", 0.0058);
				this.exchangeValues.put("CNY", 0.048);
				this.exchangeValues.put("JPY", 1.00);
				break;
		}
	}
	// Initialize currencies
	public static ArrayList<Currency> init() {
		ArrayList<Currency> currencies = new ArrayList<Currency>();
				
		currencies.add( new Currency("US Dollar", "USD") );
		currencies.add( new Currency("Euro", "EUR") );
		currencies.add( new Currency("British Pound", "GBP") );
		currencies.add( new Currency("Swiss Franc", "CHF") );
		currencies.add( new Currency("Chinese Yuan Renminbi", "CNY") );
		currencies.add( new Currency("Japanese Yen", "JPY") );
		
		for (Integer i =0; i < currencies.size(); i++) {
			currencies.get(i).defaultValues();
		}		
		
		return currencies;
	}
	
	// Convert a currency to another
	public static Double convert(Double amount, Double exchangeValue) {
		Double price;
		price = amount * exchangeValue;
		price = Math.round(price * 100d) / 100d;
		
		return price;
	}
}