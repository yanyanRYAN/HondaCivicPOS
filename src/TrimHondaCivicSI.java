
public class TrimHondaCivicSI extends HondaCivic {
	
	public TrimHondaCivicSI(String bodyStyle) {
		this.bodyStyle = bodyStyle;
		trim = "SI";
		engine ="I4-Turbo";
		transmission = "6-Speed Manual";
		//msrp = 19450.00;
		
		if(bodyStyle.equalsIgnoreCase("Sedan")) {
			msrp = 24100.00;
		} else if(bodyStyle.equalsIgnoreCase("Coupe")) {
			msrp = 26850.00;
		}
	}
}
