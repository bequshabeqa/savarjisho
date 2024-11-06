public class HashMap {
    public static void main(String[] args) {
        // Step 2: Declare a HashMap with String keys and String values
        java.util.HashMap<String, String> capitalCities = new java.util.HashMap<>();

        // Step 3: Add key-value pairs
        capitalCities.put("USA", "Washington D.C.");
        capitalCities.put("France", "Paris");
        capitalCities.put("Japan", "Tokyo");

        // Step 4: Retrieve and print the capital of France
        System.out.println("Capital of France: " + capitalCities.get("France"));

        // Step 5: Remove the entry for the USA
        capitalCities.remove("USA");

        // Step 6: Print all keys and values in the map
        System.out.println("\nRemaining countries and their capitals:");
        for (String country : capitalCities.keySet()) {
            System.out.println(country + ": " + capitalCities.get(country));
        }
    }
}