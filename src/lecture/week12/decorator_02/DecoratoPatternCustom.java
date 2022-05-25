package lecture.week12.decorator_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecoratoPatternCustom {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        DecoratoPatternCustom dec = new DecoratoPatternCustom();
        dec.run();
    }

    public void run() throws IOException {
        int cmd = 0;
        do {
            displayFoodList();
            cmd = Integer.parseInt(br.readLine());

            Food food = null;

            switch (cmd) {
                case 1:
                    food = new VegFood();
                    break;
                case 2:
                    food = new NonVegFood(new VegFood());
                    break;
                case 3:
                    food = new ChineseFood(new NonVegFood(new VegFood()));
                    break;
                case 4:
                    System.out.println("Exit...");
                    continue;
            }
            System.out.println(food.order());
            System.out.println(food.price());

        } while (cmd != 4);
    }

    public void displayFoodList() {
        System.out.println("========= Food Menu ============");
        System.out.println("1. Vegetarian Food.");
        System.out.println("2. Non-Vegetarian Food.");
        System.out.println("3. Chinese Food.");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }
}
