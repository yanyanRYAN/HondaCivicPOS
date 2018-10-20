import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCivicTrimFactory {

	@Test
	void test() {
		//Test civic trim factory this directs civic object to the correct trim class
		
		SelectCivicTrimFactory trimFactory = new SelectCivicTrimFactory();
		HondaCivic civic = null;
		
		//Define various body styles and trim combinations
		String bodyStyle = "Sedan";
		String trim = "LX";
		
		civic = trimFactory.selectTrim(bodyStyle, trim);
		assertEquals(civic = new TrimHondaCivicLX(bodyStyle), civic);
		
		
	}

}
