package com.skilldistillery.jets.app;

import java.util.ArrayList;
import java.util.Scanner;

import com.skilldistillery.jets.entities.Airfield;
import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.CargoPlane;
import com.skilldistillery.jets.entities.Combat;

//create JetsApplication with main to launch your program
public class JetsApplications {
	Airfield airfield = new Airfield();

	public static void main(String[] args) {
		JetsApplications app = new JetsApplications();
		Scanner scan = new Scanner(System.in);
		app.startApp(scan);

	}

	// this will use the getListOfJets getter to get info from the readjets
	public void startApp(Scanner scan) {
		airfield.readJets();

		mainMenu(scan);

	}

	public void printMenu() {
		System.out.println("Please choose an option (1-9)");
		System.out.println("1. List Fleet");
		System.out.println("2. Fly all Jets");
		System.out.println("3. View Fastest Jet");
		System.out.println("4. View jet with longest range");
		System.out.println("5. Load all Cargo Jets");
		System.out.println("6. Dogfight!");
		System.out.println("7. Add a jet");
		System.out.println("8. Remove a jet");
		System.out.println("9. Quit program");
		System.out.println("Please choose an option (1-9)");
	}

	public void mainMenu(Scanner scan) {

		boolean run = true;

		while (run = true) {
			printMenu();
			int userChoice = scan.nextInt();
			scan.nextLine();

			switch (userChoice) {
			case 1:
				if (airfield.getFleet() != null) {
					for (Jet jet : airfield.getFleet()) {

						System.out.println(jet);
					}
				}
				break;

			case 2:
				if (airfield.getFleet() != null) {
					for (Jet jet : airfield.getFleet()) {
						jet.fly();
					}
				}
				break;

			case 3:
				Jet fastest = null;
				for (Jet jet : airfield.getFleet()) {
					if (fastest == null || jet.getSpeed() > fastest.getSpeed()) {
						fastest = jet;
					}
					System.out.println(fastest);
				}
				break;

			case 4:
				Jet furthest = null;
				for (Jet jet : airfield.getFleet()) {
					if (furthest == null || jet.getSpeed() > furthest.getSpeed()) {
						furthest = jet;
					}
					System.out.println(furthest);
				}
				break;

			case 5:
				for (Jet jet : airfield.getFleet()) {
					if (jet instanceof CargoPlane) {
						if (jet instanceof CargoPlane) {
							((CargoPlane) jet).loadCargo();
						}
					}
				}
				break;

			case 6:
				for (Jet jet : airfield.getFleet()) {
					if (jet instanceof Combat) {
						if (jet instanceof Combat) {
							((Combat) jet).fight();
						}
					}
				}
				break;
			case 7:
				airfield.buildJet(scan);
				break;

			case 8:
				System.out.println("Here are the planes in the airfield right now");
				int counter=1;
				
				for (Jet jet : airfield.getFleet()) {
					System.out.print(counter + ". ");
					System.out.println(jet);
					counter++;
				}
				System.out.println("Enter the plane you would like to remove(by number)");
			
				int index;
				index = scan.nextInt();
				airfield.getFleet().remove(index - 1);

				break;

			case 9:
				run = false;
				break;

			}
		}

	}

	public void displayAirField(ArrayList<Jet> fleet) {
		for (Jet jet : fleet) {
			jet.toString();

		}

	}

}

//}
