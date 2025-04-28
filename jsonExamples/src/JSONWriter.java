import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class JSONWriter {
    public static void main(String[] args) {
        try {
            Employee employee = new Employee("Jane Doe", 5678, "Accounting");
            Gson gson = new Gson();

            // convert Java object to json
            String jsonString = gson.toJson(employee);

            // write json string to file
            FileWriter writer = new FileWriter("employee1.json");
            writer.write(jsonString);
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
