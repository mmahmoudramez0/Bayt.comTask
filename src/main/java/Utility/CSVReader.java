package Utility;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CSVReader {

    private String csvFile;
    private BufferedReader br;
    private String[] keys;
    private Map<String, Integer> keyIndexMap;

    public CSVReader(String csvFile) {
        this.csvFile = csvFile;
        try {
            this.br = new BufferedReader(new FileReader(csvFile));
            // Assuming the first line contains the keys
            String header = br.readLine();
            this.keys = header.split(",");
            initializeKeyIndexMap();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void initializeKeyIndexMap() {
        keyIndexMap = new HashMap<>();
        for (int i = 0; i < keys.length; i++) {
            keyIndexMap.put(keys[i], i);
        }
    }

    public String readValue(String keyContains) {
        for (String key : keyIndexMap.keySet()) {
            // Check if the key contains the provided string (case insensitive)
            if (key.toLowerCase().contains(keyContains.toLowerCase())) {
                try {
                    // Reset the file pointer to the beginning of the file
                    br.close();
                    br = new BufferedReader(new FileReader(csvFile));
                    br.readLine(); // Skip the header line
                    String line;
                    while ((line = br.readLine()) != null) {
                        String[] fields = line.split(",");
                        int index = keyIndexMap.get(key);
                        if (index < fields.length) {
                            return fields[index];
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        // Example usage
        CSVReader csvReader = new CSVReader("./resources/Book1.csv");

        // Call values associated with each key
        String gender = csvReader.readValue("gender");
        String firstname = csvReader.readValue("firstname");
        String lastname = csvReader.readValue("lastname");
        String dayOfBirth = csvReader.readValue("dayofbirth");
        String monthOfBirth = csvReader.readValue("monthofbirth");
        String yearOfBirth = csvReader.readValue("yearofbirth");
        String email = csvReader.readValue("email");
        String companyName = csvReader.readValue("companyname");
        String password = csvReader.readValue("password");

        // Output the values
        System.out.println("Gender: " + gender);
        System.out.println("First Name: " + firstname);
        System.out.println("Last Name: " + lastname);
        System.out.println("Day of Birth: " + dayOfBirth);
        System.out.println("Month of Birth: " + monthOfBirth);
        System.out.println("Year of Birth: " + yearOfBirth);
        System.out.println("Email: " + email);
        System.out.println("Company Name: " + companyName);
        System.out.println("Password: " + password);
    }
}


