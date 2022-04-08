

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class HarmoonilineKeskmine {

    private static final DecimalFormat df = new DecimalFormat("0.000");

    public HarmoonilineKeskmine(ArrayList<Integer> keskmised) {

    }

    static int[] convertToInt(String data) {
        String[] splitArray = data.split("/");
        int[] array = new int[splitArray.length];
        for (int i = 0; i < splitArray.length; i++) {
            array[i] = Integer.parseInt(splitArray[i]);
        }
        return array;
    }

    static int[] convertFromFileToAverageSpeed() {
        ArrayList<Integer> keskmised = new ArrayList<Integer>();
        try {
            File myObj = new File("/Kasutajad/katip/Kati/oo2022/05_kontrolltoo1/kiirus.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                int[] parts = convertToInt(data);
                keskmised.add((parts[0] + parts[1]) / 2);
            }
            myReader.close();
            new HarmoonilineKeskmine(keskmised);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return null;
    }

    public static String harmonicMean(ArrayList<Integer> data) {
        double sum = 0.0;
        for (int i = 0; i < data.size(); i++) {
            sum += 1.0 / data.get(i);
        }
        System.out.println(df.format(data.size() / sum));
        writeToFile(df.format(data.size() / sum));
        return df.format(data.size() / sum);
    }

    public static void writeToFile(String harmonicMean) {
        try {
            FileWriter myWriter = new FileWriter("/Kasutajad/katip/Kati/oo2022/05_kontrolltoo1/kiirus.txt");
            myWriter.write(harmonicMean);
            myWriter.write(System.lineSeparator());
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    ;

    public static void main(String[] args) {
        convertFromFileToAverageSpeed();
    }
}

