

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

        String message = "  Hello World!  " + "Yes!";

        System.out.println(message.replace("!", "*"));
        System.out.println(message.toLowerCase());
        System.out.println(message.trim());
        System.out.println(message);

        int[] numbers = {2, 3, 5 ,1, 4};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        final float Pi = 3.14f;



    }

}