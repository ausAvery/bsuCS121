import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JSONReader {
    public static void main(String[] args) {
        try {
            Gson gson = new Gson();
            BufferedReader reader = new BufferedReader(new FileReader("employee.json"));

            Employee employee = gson.fromJson(reader, Employee.class);

            System.out.println(employee);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
