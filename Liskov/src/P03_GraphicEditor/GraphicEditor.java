package P03_GraphicEditor;

import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by Buro on 3.4.2017 г..
 */
public class GraphicEditor {
//    public static void drawShape(Shape shape) {
//        if (shape instanceof Shape) {
//            System.out.println("I'm Shape");
//        } else if (shape instanceof Circle) {
//            System.out.println("I'm Circle");
//        } else if (shape instanceof Rectangle) {
//            System.out.println("I'm Rectangle");
//        }
//    }

    static void test(Drawable drawable){
        drawable.draw();
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();

        GraphicEditor.test(rectangle);
        GraphicEditor.test(circle);
    }
}
