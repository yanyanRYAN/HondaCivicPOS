import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class TestCivicCatalogIterator {

	@Test
	void test() {
		CivicCatalog civicCatalog = new CivicCatalog();
		ArrayList<CivicCatalogInterface> civicCatalogs = new ArrayList<CivicCatalogInterface>();
		civicCatalogs.add(civicCatalog);
		CivicCatalogViewer civicCatalogViewer = new CivicCatalogViewer(civicCatalogs);
		civicCatalogViewer.printCatalog();
		
		
	}

}
