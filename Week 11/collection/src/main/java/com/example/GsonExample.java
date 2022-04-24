package com.example;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Fardan
 */
public class GsonExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gson gson = new Gson();
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("hasil.json"));
            Result result = gson.fromJson(br, Result.class);

            if (result != null) {
                for (Ekspedisi t : result.getEkspedisi()) {
                    System.out.println(t.getProductName() + " | " + t.getQuantity()
                            + " | " + t.getWeight() + " | " + t.getCity().getDestination()
                            + " | " + t.getServicePackage().getService() + " | " +
                            t.getServicePackage().getValue() + " | " +
                            (t.getPriceItem() * t.getQuantity() + t.getServicePackage().getValue()));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
