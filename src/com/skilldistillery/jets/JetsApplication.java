package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApplication {
	AirField hangar = new AirField();
	
	Scanner kb = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		JetsApplication app = new JetsApplication();
		app.runProgram();

	}

	
	
	public void runProgram() {
		
		showMenu();
		
	}

		public void showMenu() {
			String input = "";

			while (!input.equals("9")) {
				System.out.println("Welcome to the Jet Menu");
				System.out.println("1) List all of the Jets");
				System.out.println("2) Make all of the Jets fly");
				System.out.println("3) See the fastest Jet");
				System.out.println("4) See the Jet with the longest range");
				System.out.println("5) Load the bombers");
				System.out.println("6) Space dog fight");
				System.out.println("7) Add a Jet");
				System.out.println("8) Remove a Jet");
				System.out.println("9) Quit");
				input = kb.next();
				switch (input) {
				case "1":
					System.out.println("Listing all Ships");
					hangar.displayFleet();
					System.out.print("\n");
					break;
				case "2":
					System.out.print("Flying: \n");
					hangar.scramble();
					System.out.println("\n");
					break;
				case "3":
					System.out.println("Fastest: \n");
					hangar.viewFastest();
					System.out.println("\n");
					break;
				case "4":
					System.out.println("Longest Range: \n");
					hangar.viewLongest();
					System.out.println("\n");
					break;
				case "5":
					System.out.println("Load the bombers: \n");
					hangar.dropBomberPayload();
					System.out.println("\n");
					break;
				case "6":
					System.out.println("Dog fight, in space! \n");
					hangar.dogFight();
					System.out.println("\n");
					break;
				case "7":
					System.out.println("Add jet: \n ");
					hangar.newPOS();
					System.out.println("\n");
					break;
				case "8":
					System.out.println("Remove jet: \n ");
					hangar.removeJet(); 
					System.out.println("\n");
					break;
				case "9":
					System.out.println("You have selceted EXIT");
					System.out.println("Exiting program...");
					System.exit(0);
					continue;
				default:
				}

			}
	
		}
		
}
