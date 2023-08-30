package Hierarchy;

import java.util.ArrayList;
import java.util.HashMap;

public class Operation {
    static void addLocation(HashMap<String, HashMap<String, HashMap<String, ArrayList<String>>>> locations,
                            String country, String state, String district, String city) {
        locations.putIfAbsent(country, new HashMap<>());
        locations.get(country).putIfAbsent(state, new HashMap<>());
        locations.get(country).get(state).putIfAbsent(district, new ArrayList<>());
        locations.get(country).get(state).get(district).add(city);
    }
}

