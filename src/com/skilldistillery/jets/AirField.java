package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirField {
	private List<Jet> jets = new ArrayList<>();
	Scanner kb = new Scanner(System.in);

	public AirField() {
		readNamesFromFile();

	}

	public void displayFleet() {
		for (Jet jet : jets) {
			if (jet != (null)) {
				System.out.println(jet);
			}
		}
	}


	public List<Jet> readNamesFromFile() {
		try (BufferedReader bufIn = new BufferedReader(new FileReader("fleet.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {

				String[] splitJetData = line.split(", ");

				String model = splitJetData[0];
				double speed = Double.parseDouble(splitJetData[1]);
				int range = Integer.parseInt(splitJetData[2]);
				long price = Long.parseLong(splitJetData[3]);
				String jetType = splitJetData[4];

				if (jetType.equals("Bomber")) {
					Bomber bomba = new Bomber(model, speed, range, price);
					jets.add(bomba);
				}
				if (jetType.equals("Fighter")) {
					Fighter fighty = new Fighter(model, speed, range, price);
					jets.add(fighty);
				}

			}
			bufIn.close();
		} catch (IOException e) {
			System.err.println(e);
		}
		return jets;
	}

	public void scramble() {
		for (Jet jet : jets) {
			if (jet != null) {
				jet.fly();
			}
		}
	}

	public void viewFastest() {
		String high = null;
		int i = 0;
		for (i = 0; i < jets.size(); i++) {

			int max = (int) jets.get(0).getSpeed();
			high = jets.get(0).toString();

			if (jets.get(i) != null) {
				if (max < jets.get(i).getSpeed()) {
					max = (int) jets.get(i).getSpeed();
					high = jets.get(i).toString();
				}
			}
		}
		System.out.println(high);
		System.out.println("\n");
	}

	public void viewLongest() {
		String high = null;
		int i = 0;
		for (i = 0; i < jets.size(); i++) {

			int max = (int) jets.get(0).getRange();
			high = jets.get(0).toString();

			if (jets.get(i) != null) {
				if (max < jets.get(i).getRange()) {
					max = (int) jets.get(i).getRange();
					high = jets.get(i).toString();
				}
			}
		}
		System.out.println(high);
		System.out.println("\n");
	}

	public void dropBomberPayload() {
		for (Jet jet : jets) {
			if (jet != null) {
				if (jet instanceof Bomber) {
					((Bomber) jet).dropPayload();
				}
			}
		}
	}

	public void dogFight() {
		for (Jet jet : jets) {
			if (jet != null) {
				if (jet instanceof Fighter) {
					((Fighter) jet).dogFight();
				}
			}
		}
	}

	public void newPOS() {

		System.out.print("Enter the model name: ");
		String model = kb.next();
		System.out.println();
		System.out.print("");
		System.out.print("How fast is your Space Craft: ");
		double speed = kb.nextDouble();
		System.out.print("");
		System.out.print("What is the range of your craft: ");
		int range = kb.nextInt();
		System.out.print("What is the price of your craft: ");
		long price = kb.nextLong();

		Junker junk = new Junker(model, speed, range, price);
		jets.add(junk);

	}
	
	public void removeJet() {
	       
        int counter = -1;
        for (Jet jet : jets) {
            counter++;
            System.out.println(counter + " " +jet);
        } 
            System.out.println("Choose the jet that you want to remove: ");
            int option = kb.nextInt();
            jets.remove(option);
            System.out.println("!!Poof!!");
            displayFleet();
        
    }

}
