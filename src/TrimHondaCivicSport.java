
public class TrimHondaCivicSport extends HondaCivic {
	
	public TrimHondaCivicSport(String bodyStyle) {
		this.bodyStyle = bodyStyle;
		trim = "Sport";
		engine = "I4-Turbo";
		transmission = "Automatic";
		
		if(bodyStyle.equalsIgnoreCase("Sedan")) {
			msrp = 21150.00;
		} else if(bodyStyle.equalsIgnoreCase("Coupe")) {
			msrp = 21450.00;
		}
	}
}
