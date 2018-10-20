
public class SelectCivicTrimFactory {
	
	//Factory 
	public HondaCivic selectTrim(String bodyStyle, String trim ) {
		HondaCivic civic = null;
		if (trim.equalsIgnoreCase("LX")) {
			civic = new TrimHondaCivicLX(bodyStyle);
		} else if (trim.equalsIgnoreCase("Sport")) {
			civic = new TrimHondaCivicSport(bodyStyle);
		} else if (trim.equalsIgnoreCase("EX")) {
			civic = new TrimHondaCivicEX(bodyStyle);
		} else if (trim.equalsIgnoreCase("Touring")) {
			civic = new TrimHondaCivicTouring(bodyStyle);
		} else if (trim.equalsIgnoreCase("SI")) {
			civic = new TrimHondaCivicSI(bodyStyle);
		}
		
		return civic;
	}
}
