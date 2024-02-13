
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

    public class BigRectLister {
        public static void main(String[] args) {
            List<Rectangle> rectangles = new ArrayList<>();

            rectangles.add(new Rectangle(2, 3)); // = 10
            rectangles.add(new Rectangle(3, 3)); // = 12
            rectangles.add(new Rectangle(4, 1)); // = 10
            rectangles.add(new Rectangle(1, 5)); // = 12
            rectangles.add(new Rectangle(2, 2)); // = 8
            rectangles.add(new Rectangle(2, 4)); // = 12
            rectangles.add(new Rectangle(3, 4)); // = 14
            rectangles.add(new Rectangle(1, 1)); // = 4
            rectangles.add(new Rectangle(5, 1)); // = 12
            rectangles.add(new Rectangle(3, 5)); // = 16

            Filter aboveTen = new BigRectangleFilter();
            List<Object> bigRectangles = Main.collectAll(rectangles.toArray(), aboveTen);

            System.out.println("The rectangles that have a perimeter above ten are:");
            for (Object rect : bigRectangles) {
                System.out.println(rect);
            }
        }
    }


