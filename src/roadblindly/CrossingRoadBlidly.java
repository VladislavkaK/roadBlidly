package roadblindly;

import java.io.*;

public class CrossingRoadBlidly {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String sT = br.readLine();
        double t = Double.parseDouble(sT);
        t = t % 5;
        if (t >= 0 && t < 3) {
            System.out.println("зелёный");
        } else if (t >= 3 && t < 4) {
            System.out.println("жёлтый");
        } else if (t >= 4 && t < 5) {
            System.out.println("красный");
        }
    }
}
