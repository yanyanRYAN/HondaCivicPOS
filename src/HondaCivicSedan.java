
public class HondaCivicSedan extends HondaCivic {
	
	

	public HondaCivicSedan() {
		//this.civic = civic;
		bodyStyle = "Sedan";
		//civic.setBodyStyle(bodyStyle);
		trim = null;
		engine = null;
		transmission = null;
		
		msrp = 19450.00;
		configPrice = msrp;
	}
	
	/*
	@Override
	public String setBodyStyle(String bodyStyle) {
		// TODO Auto-generated method stub
		this.bodyStyle = bodyStyle;
		return bodyStyle;
	}
	
	@Override
	public String setTrim(String trim) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String setEngine(String engine) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String setTransmission(String transmission) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String setColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getMSRP(Double msrp) {
		this.msrp = msrp;
		msrp = 19450.00;
		return msrp;
	}

	@Override
	public Double getConfigPrice(Double configPrice) {
		// TODO Auto-generated method stub
		return null;
	}
	*/
	public String toString() {
		String config = "End of Config";
		System.out.println("BodyStyle:" + bodyStyle);
		System.out.println("Trim:" + trim);
		System.out.println("Engine:" + engine);
		System.out.println("Transmission:" + transmission);
		System.out.println("MSRP:" + Double.toString(msrp));
		
		return config;
	}
}
