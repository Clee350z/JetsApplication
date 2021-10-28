package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//user story 2, Jets are found at an AirField. Create the AirField class, which has an empty List of Jets
public class Airfield {

	private ArrayList<Jet> fleet = new ArrayList<>();

//These jets must be read from a text file, where each line in the file contains data for a single Jet object.

	public void readJets() {

		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] jetInfo = line.split(",");
				// Remember to use String.split(regex) to break each line in the file into data
				// to create an individual jet.

				String model = jetInfo[0];
				String type = jetInfo[1];
				double speed = Double.parseDouble(jetInfo[2]);
				int range = Integer.parseInt(jetInfo[3]);
				long cost = Long.parseLong(jetInfo[4]);

				if (type.equals("Cargo")) {
					CargoPlane cargo = new CargoPlane(model, type, speed, range, cost);
					fleet.add(cargo);
				} else if (type.equals("Combat")) {
					Combat combat = new Combat(model, type, speed, range, cost);
					fleet.add(combat);
				} else if (type.equals("Hybrid")) {
					Hybrid hybrid = new Hybrid(model, type, speed, range, cost);
					fleet.add(hybrid);
				}

			}
		}

		catch (IOException e) {
			System.err.println(e);
		}
		for (Jet jet : fleet) {
			System.out.println(jet);
			// this will show to make sure values have passed

		}

	}

	public void buildJet(Scanner scan) {
		String type;
		String model;
		double speed;
		int range;
		long cost;
		System.out.println("Please choose from the following classes of plane: Cargo , Combat , Hybrid");
		type = scan.nextLine();
		System.out.println("What is the model of this aircraft?");
		model = scan.nextLine();
		System.out.println("How fast can this aircraft go?");
		speed = scan.nextDouble();
		System.out.println("What is the flight range? (In number of miles)");
		range = scan.nextInt();
		System.out.println("How much does this aircraft cost?");
		cost = scan.nextLong();

		switch (type) {
		case "Cargo":
		case "cargo":
			fleet.add(new CargoPlane(type, model, speed, range, cost));

			break;

		case "Combat":
		case "combat":
			fleet.add(new Combat(type, model, speed, range, cost));
			break;

		case "Hybrid":
		case "hybrid":
			fleet.add(new Hybrid(type, model, speed, range, cost));
			break;

		default:
			System.out.println("Error!");
			break;
		}
	}

		//Your list<Jet> in your Airfield class is exposed through it's getter method. 
		//Rather than calling the getter to have access to the List<Jet> in your Application class, 
		//instead you should have invoked methods in the Airfield class that call upon it's own list.
	//MAKE A DISPLAY method. dummy.
	public void displayAirField() {
		for (Jet jet : fleet) {
			System.out.println(jet.toString());
		}
	}
		

	public ArrayList<Jet> getFleet() {
		return fleet;
	}

	public void setFleet(ArrayList<Jet> fleet) {
		this.fleet = fleet;
	}



}
