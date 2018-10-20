
public class TrimHondaCivicTouring extends HondaCivic {
	
	public TrimHondaCivicTouring(String bodyStyle) {
		this.bodyStyle = bodyStyle;
		trim = "Touring";
		engine ="I4-Turbo";
		transmission = "Automatic";
		//msrp = 19450.00;
		
		if(bodyStyle.equalsIgnoreCase("Sedan")) {
			msrp = 27300.00;
		} else if(bodyStyle.equalsIgnoreCase("Coupe")) {
			msrp = 26850.00;
		}
	}
}
