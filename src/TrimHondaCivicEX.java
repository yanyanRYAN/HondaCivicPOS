
public class TrimHondaCivicEX extends HondaCivic {
	
	public TrimHondaCivicEX(String bodyStyle) {
		this.bodyStyle = bodyStyle;
		trim = "EX";
		engine ="I4-Turbo";
		transmission = "Automatic";
		
		
		if(bodyStyle.equalsIgnoreCase("Sedan")) {
			msrp = 23400.00;
		} else if(bodyStyle.equalsIgnoreCase("Coupe")) {
			msrp = 23200.00;
		}
	}
}
