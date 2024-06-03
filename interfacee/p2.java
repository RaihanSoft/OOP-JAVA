package interfacee;

public class p2 {
    interface Drawable {
        void draw();
    }

    interface Colorable {
        void setColor(String color);
    }

    // A class implementing multiple interfaces
    class ColoredCircle implements Drawable, Colorable {
        private String color;

        @Override
        public void draw() {
            System.out.println("Drawing a colored circle.");
        }

        @Override
        public void setColor(String color) {
            this.color = color;
        }
    }

}
