import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JSONReader {
    public static void main(String[] args) {
        try {
            Gson gson = new Gson();
            BufferedReader reader = new BufferedReader(new FileReader("product.json"));

            Product product = gson.fromJson(reader, Product.class);

            System.out.println(product);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
