import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class JSONArrayReader {
    private ArrayList<Employee> employeeArrayList = new ArrayList<>();

    // default constructor: JSONArrayReader(){}

    public void readJson() {
        try {
            Gson gson = new Gson();

            BufferedReader reader = new BufferedReader(new FileReader("employees.json"));

            // get the type of the ArrayList
            Type employeeListType = new TypeToken<ArrayList<Employee>>(){}.getType();

            // creates a instance(s) of the type (Employee) and adds it to the ArrayList
            employeeArrayList = gson.fromJson(reader, employeeListType);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    } // end readJson()

    public StringBuilder getEmployeeList() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Employee employee : employeeArrayList) {
            stringBuilder.append(employee).append("\n");
        }
        return stringBuilder;
    } // end printEmployeeList()

} // end JSONArrayReader{}
