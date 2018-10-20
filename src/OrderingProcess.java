
import java.util.Scanner;
import java.util.ArrayList;

public class OrderingProcess {
	
	//FACADE
	
	boolean wantToMakeOrder;
	boolean userSelectBody;
	int selection;
	int selectionBody;
	int selectionTrim;
	String bodyStyle;
	static String trimStyle;
	static HondaCivic civic;
	static SelectCivicBodyStyleFactory body;
	static SelectCivicTrimFactory trim;
	static ProcessHonda process;
	
	public void welcomeMSG() {
		System.out.println("Build your Honda Civic");
	}
	
	/*
	public static boolean selectionMenu() {
		boolean wantToMakeOrder = false;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Do you want to build your Honda Civic Today?");
		System.out.println("Press 1 key for yes:");
		System.out.println("Press 2 key for no:");
		System.out.println("Press 3 key to see catalog:");
		int selection = scanner.nextInt();
		
		switch(selection) {
		case 1:
			wantToMakeOrder = true;
			break;
		case 2:
			wantToMakeOrder = false;
			break;
		case 3:
			wantToMakeOrder = true;
			viewCivicCatalog();
			selectionMenu();
			break;
		default:
			wantToMakeOrder = false;
			break;
		}
		//scanner.close();
		return wantToMakeOrder;
		
	}
	*/
	
	public static boolean selectionMenu1() {
		boolean wantToMakeOrder = false;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Do you want to build your Honda Civic Today?");
		System.out.println("Press 1 key for yes:");
		System.out.println("Press 2 key for no:");
		System.out.println("Press 3 key to see catalog:");
		System.out.println("");
		int selection = scanner.nextInt();
		
		switch(selection) {
		case 1:
			wantToMakeOrder = true;
			selectionBodyMenu1(wantToMakeOrder);
			break;
		case 2:
			wantToMakeOrder = false;
			System.out.println("Bye");
			break;
		case 3:
			wantToMakeOrder = true;
			viewCivicCatalog();
			selectionMenu1();
			break;
		default:
			wantToMakeOrder = false;
			break;
		}
		scanner.close();
		return wantToMakeOrder;
	}
	
	/*
	public static String selectionBodyMenu(boolean wantToMakeOrder) {
		String bodyStyle = "";
		
		boolean userSelectBody = false;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Select the body style of your Honda Civic");
		System.out.println("1: Sedan");
		System.out.println("2: Coupe");
		int selection = scanner.nextInt();
		
		switch (selection) {
		case 1:
			bodyStyle = "Sedan";
			userSelectBody = true;
			break;
		case 2:
			bodyStyle = "Coupe";
			userSelectBody = true;
			break;
		}
		
		System.out.println("");
		//scanner.close();
		return bodyStyle;
	}
	*/
	public static void selectionBodyMenu1(boolean wantToMakeOrder) {
		String bodyStyle = "";
		
		//boolean userSelectBody = false;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Select the body style of your Honda Civic");
		System.out.println("1: Sedan");
		System.out.println("2: Coupe");
		System.out.println("");
		int selection = scanner.nextInt();
		
		switch (selection) {
		case 1:
			bodyStyle = "Sedan";
			//userSelectBody = true;
			selectionTrimMenu1(bodyStyle);
			
			break;
		case 2:
			bodyStyle = "Coupe";
			//userSelectBody = true;
			selectionTrimMenu1(bodyStyle);
			break;
		}
		scanner.close();
		System.out.println("");
	}
	
	/*
	public String selectionTrimMenu(String bodyStyle) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Select the trim of your Honda Civic");
		System.out.println("1: LX");
		System.out.println("2: Sport");
		System.out.println("3: EX");
		System.out.println("4: Touring");
		System.out.println("5: SI");
		
		int selection = scanner.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Selected LX:");
			System.out.println(bodyStyle);
			trimStyle = "LX";
			break;
		case 2:
			System.out.println("Selected Sport:");
			System.out.println(bodyStyle);
			trimStyle = "Sport";
			break;
		case 3:
			System.out.println("Selected EX:");
			System.out.println(bodyStyle);
			trimStyle = "EX";
			break;
		case 4:
			System.out.println("Selected Touring:");
			System.out.println(bodyStyle);
			trimStyle = "Touring";
			break;
		case 5:
			System.out.println("Selected SI:");
			System.out.println(bodyStyle);
			trimStyle = "SI";
			break;
			
		}
		//scanner.close();
		System.out.println("");
		return trimStyle;
	}
	*/
	
	public static void selectionTrimMenu1(String bodyStyle) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Select the trim of your Honda Civic");
		System.out.println("1: LX");
		System.out.println("2: Sport");
		System.out.println("3: EX");
		System.out.println("4: Touring");
		System.out.println("5: SI");
		System.out.println("");
		int selection = scanner.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Selected LX:");
			System.out.println(bodyStyle);
			trimStyle = "LX";
			buildCivicMenu1(bodyStyle, trimStyle);
			break;
		case 2:
			System.out.println("Selected Sport:");
			System.out.println(bodyStyle);
			trimStyle = "Sport";
			buildCivicMenu1(bodyStyle, trimStyle);
			break;
		case 3:
			System.out.println("Selected EX:");
			System.out.println(bodyStyle);
			trimStyle = "EX";
			buildCivicMenu1(bodyStyle, trimStyle);
			break;
		case 4:
			System.out.println("Selected Touring:");
			System.out.println(bodyStyle);
			trimStyle = "Touring";
			buildCivicMenu1(bodyStyle, trimStyle);
			break;
		case 5:
			System.out.println("Selected SI:");
			System.out.println(bodyStyle);
			trimStyle = "SI";
			buildCivicMenu1(bodyStyle, trimStyle);
			break;
			
		}
		//scanner.close();
		System.out.println("");
	}
	
	
	/*
	public static void buildCivicMenu( String bodyStyle, String trimStyle) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Do you want to see a build configuration of your Civic?");
		System.out.println("1: Yes");
		System.out.println("2: No");
		
		int selection = scanner.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Building Civic");
			break;
		case 2:
			System.out.println("Exiting Program");
			//selectionMenu();
			break;
		}
		System.out.println("");
		//scanner.close();
	}
	*/
	public static void buildCivicMenu1(String bodyStyle, String trimStyle) {
		Scanner scanner = new Scanner(System.in);
		body = new SelectCivicBodyStyleFactory();
		trim = new SelectCivicTrimFactory();
		process = new ProcessHonda(body, trim);
		System.out.println("Do you want to see a build configuration of your Civic?");
		System.out.println("1: Yes");
		System.out.println("2: No");
		System.out.println("");
		int selection = scanner.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Building Civic");
			civic = process.buildCivic(bodyStyle, trimStyle);
			break;
		case 2:
			System.out.println("Exiting Program");
			//selectionMenu();
			break;
		}
		System.out.println("");
		//scanner.close();
	}
	
	public static void viewCivicCatalog() {
		Scanner scanner = new Scanner(System.in);
		
		CivicCatalog civicCatalog = new CivicCatalog();
		ArrayList<CivicCatalogInterface> civicCatalogs = new ArrayList<CivicCatalogInterface>();
		civicCatalogs.add(civicCatalog);
		CivicCatalogViewer civicCatalogViewer = new CivicCatalogViewer(civicCatalogs);
		civicCatalogViewer.printCatalog();
		
		System.out.println("Press any key to go back to the initial menu:");
		scanner.nextLine();
		
		
	}
	
	public void makeOrder() {
		
		
		
		
		//OLD implementation
		/*
		//selectionMenu();
		//selectionBody(wantToMakeOrder);
		wantToMakeOrder = selectionMenu();
		do {
			bodyStyle = selectionBodyMenu(wantToMakeOrder);
			body = new SelectCivicBodyStyleFactory();
			trimStyle = selectionTrimMenu(bodyStyle);
			trim = new SelectCivicTrimFactory();
			
			
			buildCivicMenu(bodyStyle, trimStyle);
			process = new ProcessHonda(body, trim);
			civic = process.buildCivic(bodyStyle, trimStyle);
			wantToMakeOrder = false;
		} while (wantToMakeOrder != false);
		
		*/
		
		
	}
	
	
}
