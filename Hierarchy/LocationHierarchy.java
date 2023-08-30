package Hierarchy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static Hierarchy.Operation.addLocation;

public class LocationHierarchy {
    public static void main(String[] args) {

        HashMap<String, HashMap<String, HashMap<String, ArrayList<String>>>> locations = new HashMap<>();


        addLocation(locations, "India", "Maharashtra", "Mumbai", "Dadar");
        addLocation(locations, "India", "Maharashtra", "Mumbai", "Andheri");
        addLocation(locations, "India", "Maharashtra", "Mumabi", "Panvel");
        addLocation(locations, "India", "Maharashtra", "Mumbai", "CST");
        addLocation(locations, "India", "Maharashtra", "Pune", "Wagholi");
        addLocation(locations, "India", "Maharashtra", "Pune", "karve Nagar");
        addLocation(locations, "India", "Maharashtra", "Nagpur", "Mahal");
        addLocation(locations, "India", "Maharashtra", "Nashik", "Nashik Municipal Corporation");
        addLocation(locations, "India", "Tamil Nadu", "Coimbatore", "Pollachi");
        addLocation(locations, "India", "Tamil Nadu", "Chennai", "Adambakkam");
        addLocation(locations, "India", "Tamil Nadu", "Salem", "Mettur");
        addLocation(locations, "China", "Guangdong", "Guangzhou", "Tianhe");
        addLocation(locations, "China", "Guangdong", "Shenzhen", "Futian");
        addLocation(locations, "Sri Lanka", "Western", "Colombo", "Colombo City");
        addLocation(locations, "Sri Lanka", "Western", "Colombo", "Colombo City");
        addLocation(locations, "Australia", "Sydney", "Chippendale", "Ultimo");
        addLocation(locations, "Australia", "Sydney", "Chippendale", "Surry Hills");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose a country: ");
            String country = scanner.nextLine();

            if (!locations.containsKey(country)) {
                System.out.println("Country not found.");
                continue;
            }

            System.out.println("Available states in " + country + ": ");
            ArrayList<String> states = new ArrayList<>(locations.get(country).keySet());
            for (String state : states) {
                System.out.println(state);
            }

            System.out.println("Choose a state: ");
            String state = scanner.nextLine();

            if (!locations.get(country).containsKey(state)) {
                System.out.println("State not found.");
                continue;
            }

            System.out.println("Available districts in " + state + ": ");
            ArrayList<String> districts = new ArrayList<>(locations.get(country).get(state).keySet());
            for (String district : districts) {
                System.out.println(district);
            }

            System.out.println("Choose a district: ");
            String district = scanner.nextLine();

            if (!locations.get(country).get(state).containsKey(district)) {
                System.out.println("District not found.");
                continue;
            }

            System.out.println("Cities in " + district + ": ");
            ArrayList<String> cities = locations.get(country).get(state).get(district);
            for (String city : cities) {
                System.out.println(city);
            }
        }
    }
}



