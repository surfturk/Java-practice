

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Practice {

    public static void main(String[] args) {
        byte age = 34;
        Date now = new Date();

        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;

        //string manipulation
        String message = "  Hello World!  " + "Yes!";

        System.out.println(message.replace("!", "*"));
        System.out.println(message.toLowerCase());
        System.out.println(message.trim());
        System.out.println(message);

        // arrays
        int[] numbers = {2, 3, 5 ,1, 4};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        // constant
        final float Pi = 3.14f;


        // operators
        double result = (double)10 / (double)3;
        System.out.println(result);

        //augmented assignment
        int x = 1;
        x += 2;
        System.out.println(x);





    }

}