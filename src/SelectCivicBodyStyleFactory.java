
public class SelectCivicBodyStyleFactory {
	
	String bodyStyle;
	
	//This is not a factory
	//The factory implementation is in SelectCivicTrimFactory
	
		public String selectBodyStyle(String body) {
			//HondaCivic civic = null;
			if(body.equalsIgnoreCase("Sedan")) {
				bodyStyle = body;
			} else if (body.equalsIgnoreCase("Coupe")) {
				//
				bodyStyle = body;
			} 
			
			//return civic;
			
			return bodyStyle;
			
		}
		
}
