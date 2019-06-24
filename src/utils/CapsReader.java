package utils;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FilterInputStream;

public class CapsReader {

    public CapsReader() {

    }

    public DesiredCapabilities getCapabilities() {
        DesiredCapabilities caps = new DesiredCapabilities();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir")+"/capabs/ioscaps.txt"));
            String line = reader.readLine();
            while (line != null) {
               // System.out.println(line);
                String[] cp = line.split("=");
                caps.setCapability(cp[0], cp[1]);
                line = reader.readLine();
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return caps;
    }

   /* public static void main(String[] args) {
        CapsReader caps = new CapsReader();
        caps.getCapabilities();
    }*/
}
