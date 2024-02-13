import java.awt.Rectangle;
public class BigRectangleFilter implements Filter {
        @Override
        public boolean accept(Object x) {
            if (x instanceof Rectangle) {
                return (2 * (((Rectangle) x).getWidth() + ((Rectangle) x).getHeight())) > 10;
            }
            return false;
        }
    }
