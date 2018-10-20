
public abstract class HondaCivic {
	
	String bodyStyle, trim, engine, transmission, color;
	
	Double msrp, configPrice;
	
	//set the the strings
	public String setBodyStyle(String bodyStyle) {
		return bodyStyle;
	}
	public String setTrim(String trim) {
		return trim;
	}
	public String setEngine(String engine) {
		return engine;
	}
	public String setTransmission(String transmission) {
		return transmission;
	}
	public String setColor(String color) {
		return color;
	}
	
	public Double getMSRP(Double msrp) {
		return msrp;
	}
	public Double getConfigPrice(Double configPrice) {
		return configPrice;
	}
	
	//get the strings
	public String getBodyStyle() {
		return bodyStyle;
	}
	
	public String getTrim() {
		return trim;
	}
	
	public String getEngine() {
		return engine;
	}
	
	public String getTransmission() {
		return transmission;
	}
	
	public void buildOrder() {
		System.out.println("Build Order:");
		System.out.println("Honda Civic " + trim + " " + bodyStyle);
		System.out.println("BodyStyle:" + bodyStyle);
		System.out.println("Trim:" + trim);
		System.out.println("Engine:" + engine);
		System.out.println("Transmission:" + transmission);
		System.out.println("MSRP: $" + Double.toString(msrp));
	}
	
	
}
