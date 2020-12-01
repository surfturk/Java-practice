

import java.awt.*;
import java.util.Date;

public class Practice {

    public static void main(String[] args) {
        byte age = 34;
        Date now = new Date();

        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

    }

}