

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();

        int areaGarden = A*B;
        int areaRoad = (A + B) - 1;

        int area = areaGarden - areaRoad;

        System.out.println(area);



    }
}
