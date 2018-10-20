
public class TrimHondaCivicLX extends HondaCivic {
	
	public TrimHondaCivicLX(String bodyStyle) {
		this.bodyStyle = bodyStyle;
		trim = "LX";
		engine ="I4";
		transmission = "Automatic";
		//msrp = 19450.00;
		
		if(bodyStyle.equalsIgnoreCase("Sedan")) {
			msrp = 19450.00;
		} else if(bodyStyle.equalsIgnoreCase("Coupe")) {
			msrp = 20650.00;
		}
	}
	
	
}
