import java.util.Iterator;

public class CivicCatalogIterator implements Iterator<CivicCatalogItem> {
	
	CivicCatalogItem[] civicItemList;
	int pos = 0;
	
	public CivicCatalogIterator(CivicCatalogItem[] civicItemList) {
		this.civicItemList = civicItemList;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (pos >= civicItemList.length || civicItemList[pos] == null) {
			return false;
		} else {
			return true;
		}
		
	}

	@Override
	public CivicCatalogItem next() {
		// TODO Auto-generated method stub
		CivicCatalogItem civicCatalog = civicItemList[pos];
		pos++;
		
		return civicCatalog;
	}

}
