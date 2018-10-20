
public class CivicCatalogItem {
	String civic;
	String description;
	double price;
	
	public CivicCatalogItem(String civic, String description, double price) {
		this.civic = civic;
		this.description = description;
		this.price = price;
		
	}
	
	public String getCivic() {
		return civic;
	}
	
	public String getDescription() {
		return description;
	}
	
	public double getPrice() {
		return price;
	}
}
