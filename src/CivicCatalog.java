import java.util.Iterator;

public class CivicCatalog implements CivicCatalogInterface {
	final int MAX_CIVICS = 10;
	int numCivics = 0;
	
	CivicCatalogItem[] civicCatalog;
	
	public CivicCatalog() {
		civicCatalog = new CivicCatalogItem[MAX_CIVICS];
		addCivic("Civic LX Sedan", "4 Door, Inline-4, Automatic, Sedan", 19450.00);
		addCivic("Civic LX Coupe", "2 Door, Inline-4, Automatic, Coupe", 20650.00);
		addCivic("Civic Sport Sedan", "4 Door, Inline-4 Turbo, Automatic, Sedan", 21150.00);
		addCivic("Civic Sport Coupe", "4 Door, Inline-4 Turbo, Automatic, Coupe", 21450.00);
		addCivic("Civic EX Sedan", "4 Door, Inline-4 Turbo, Automatic, Sedan", 23400.00);
		addCivic("Civic EX Coupe", "4 Door, Inline-4 Turbo, Automatic, Coupe", 23200.00);
		addCivic("Civic SI Sedan", "4 Door, Inline-4 Turbo, 6-Speed Manual, Sedan", 24100.00);
		addCivic("Civic SI Coupe", "4 Door, Inline-4 Turbo, 6-Speed Manual, Coupe", 24100.00);
		
	}
	
	public void addCivic(String civic, String description, double price) {
		CivicCatalogItem civicCatalogItem = new CivicCatalogItem(civic, description, price);
		
		civicCatalog[numCivics] = civicCatalogItem;
		numCivics++;
	}
	
	public CivicCatalogItem[] getCivicCatalogItem() {
		return civicCatalog;
	}

	@Override
	public Iterator<?> createIterator() {
		// TODO Auto-generated method stub
		return new CivicCatalogIterator(civicCatalog);
	}
	
	

}
