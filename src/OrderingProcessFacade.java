
import java.util.Scanner;
import java.util.ArrayList;

public class OrderingProcessFacade {
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
		
		
		public static boolean selectionMenu() {
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
				selectionBodyMenu(wantToMakeOrder);
				break;
			case 2:
				wantToMakeOrder = false;
				System.out.println("Bye");
				break;
			case 3:
				wantToMakeOrder = true;
				viewCivicCatalog();
				selectionMenu();
				break;
			default:
				System.out.println("\nInvalid option.\n");
				selectionMenu();
				wantToMakeOrder = false;
				break;
			}
			scanner.close();
			return wantToMakeOrder;
		}
		
		public static void selectionBodyMenu(boolean wantToMakeOrder) {
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
				selectionTrimMenu(bodyStyle);
				
				break;
			case 2:
				bodyStyle = "Coupe";
				//userSelectBody = true;
				selectionTrimMenu(bodyStyle);
				break;
			default:
				System.out.println("\nInvalid option.\n");
				selectionMenu();
				break;
			}
			scanner.close();
			System.out.println("");
		}
		
		
		
		public static void selectionTrimMenu(String bodyStyle) {
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
				buildCivicMenu(bodyStyle, trimStyle);
				break;
			case 2:
				System.out.println("Selected Sport:");
				System.out.println(bodyStyle);
				trimStyle = "Sport";
				buildCivicMenu(bodyStyle, trimStyle);
				break;
			case 3:
				System.out.println("Selected EX:");
				System.out.println(bodyStyle);
				trimStyle = "EX";
				buildCivicMenu(bodyStyle, trimStyle);
				break;
			case 4:
				System.out.println("Selected Touring:");
				System.out.println(bodyStyle);
				trimStyle = "Touring";
				buildCivicMenu(bodyStyle, trimStyle);
				break;
			case 5:
				System.out.println("Selected SI:");
				System.out.println(bodyStyle);
				trimStyle = "SI";
				buildCivicMenu(bodyStyle, trimStyle);
				break;
			default:
				System.out.println("\nInvalid option.\n");
				selectionMenu();
				break;
			}
			scanner.close();
			System.out.println("");
		}
		
		
		public static void buildCivicMenu(String bodyStyle, String trimStyle) {
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
			default:
				System.out.println("\nInvalid option.\n");
				selectionMenu();
				break;
			}
			System.out.println("");
			scanner.close();
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
			
			scanner.close();
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
