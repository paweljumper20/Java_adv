package christmasTree;

import java.util.Random;

public class ChristmasTreeImpl implements ChristmasTree {

    @Override
    public String produceChristmasTree(int n) {
        Random r = new Random();
        String bubbles [] = {"@", "O", "o", "*", "*", "*"};
        int bubblesCount [] = {0,0,0,0};
        String christmasTree = "";
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2 * n - 1); j++) {
                if (j <= (n - i)) {
                    christmasTree += " ";
                }
            }
            for (int k = 1; k <= (2 * n - 1); k++) {
                if (i==1 && k==1) {
                    christmasTree += "^";
                }
                else if (k <= (2 * i - 1)) {
                    String bubble = bubbles[r.nextInt(6)];
                    christmasTree += bubble;
                    if(bubble.equals(bubbles[0])){
                        bubblesCount[0]++;
                    } else if(bubble.equals(bubbles[1])){
                        bubblesCount[1]++;
                    } else if(bubble.equals(bubbles[2])){
                        bubblesCount[2]++;
                    } else {
                        bubblesCount[3]++;
                    }
                }
            }
            christmasTree += "\n";
            if(i == n) {
                for (int l = 1; l < (2 * i - 1); l++) {
                    if (l <= (2*n - 1)/2) {
                        christmasTree += " ";
                    }
                }
                christmasTree += "H";
            }
        }
        System.out.println("Christmas Tree Stats");
        int allElements = bubblesCount[0] + bubblesCount[1] + bubblesCount[2] + bubblesCount[3];
        System.out.println("No. elements: " + (2 + allElements));
        System.out.printf("Percent of @: %.2f \n", ((double)bubblesCount[0]/allElements)* 100);
        System.out.printf("Percent of O: %.2f \n", ((double)bubblesCount[1]/allElements)* 100);
        System.out.printf("Percent of o: %.2f \n", ((double)bubblesCount[2]/allElements)* 100);
        System.out.printf("Percent of *: %.2f \n", ((double)bubblesCount[3]/allElements)* 100);

        return christmasTree;
    }

    public static void main(String[] args) {
        ChristmasTree ct = new ChristmasTreeImpl();
        String christmasTree = ct.produceChristmasTree(10);
        System.out.println(christmasTree);
    }
}