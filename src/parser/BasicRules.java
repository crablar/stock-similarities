package parser;

/**
 * An example collection of rules for parsing and standardizing Yahoo Finance
 * text.
 * 
 * @author jeffreymeyerson
 * 
 */
public class BasicRules {

	/**
	 * Converts a line of raw text to a standardized double.
	 * 
	 * @param raw
	 * @return
	 */
	public static double convertRaw(String statisticName, String rawData) throws NumberFormatException{
		Double result = 0.0;
		try{
			if (statisticName.equals("Price/EPS Estimate Current Year "))
				result = new Double(rawData);
			else if (statisticName.equals("Book Value "))
				result = new Double(rawData);
			else if (statisticName.equals("Last Trade (Price Only) "))
				result = new Double(rawData);
			else if (statisticName.equals("Last Trade Size "))
				result = new Double(rawData);
			else if (statisticName.equals("Earnings/Share "))
				result = new Double(rawData);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Error parsing " + statisticName + ", cannot convert " + rawData);
		}
			return result;
		}
}