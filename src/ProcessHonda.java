
public class ProcessHonda {
	
	SelectCivicBodyStyleFactory civicBody;
	SelectCivicTrimFactory civicTrim;
	
	public ProcessHonda(SelectCivicBodyStyleFactory civicBody, SelectCivicTrimFactory civicTrim) {
		this.civicBody = civicBody;
		this.civicTrim = civicTrim;
	}
	
	public HondaCivic buildCivic(String body, String trim) {
		HondaCivic civic;
		//civic = civicBody.selectBodyStyle(body);
		body = civicBody.selectBodyStyle(body);
		civic = civicTrim.selectTrim(body, trim);
		civic.buildOrder();
		
		return civic;
	}
	
}
