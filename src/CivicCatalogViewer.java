
import java.util.*;

public class CivicCatalogViewer {
	ArrayList<CivicCatalogInterface> catalog;
	
	public CivicCatalogViewer(ArrayList<CivicCatalogInterface> catalog) {
		this.catalog = catalog;
	}
	
	void printCatalog(Iterator<?> iterator) {
		while(iterator.hasNext()) {
			CivicCatalogItem civicCatalogItem = (CivicCatalogItem)iterator.next();
			System.out.println(civicCatalogItem.getCivic() + ":");
			System.out.println(civicCatalogItem.getDescription() + ":");
			System.out.println("Suggested MSRP: $" + civicCatalogItem.getPrice());
			System.out.println("");
		}
		
	}
	
	public void printCatalog() {
		Iterator<?> civicCatalogIterator = catalog.iterator();
		while(civicCatalogIterator.hasNext()) {
			CivicCatalog civicCatalog = (CivicCatalog)civicCatalogIterator.next();
			printCatalog(civicCatalog.createIterator());
		}
	}
	
	
}
