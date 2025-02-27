package Abstract;

abstract class Shape {
    abstract void draw();
}
//клас кола
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Малюю коло.");
    }
}
// клас прямкутника
    class Rectangle extends Shape {
        @Override
        void draw() {
            System.out.println("Малюю прямокутник.");
        }
    }

    //інтерфейс для зміни розміру
    interface Resizable {
        void resize(double factor);
}

// клас що може змінювати розмір
        class ResizableCircle extends Circle implements Resizable {
             @Override
             public void resize(double factor) {
                    System.out.println("Змінюю розмір кола на " + factor);
    }
}
// головний клас
class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();

        Shape rectangle = new Rectangle();
        rectangle.draw();

        ResizableCircle resizableCircle = new ResizableCircle();
        resizableCircle.draw();
        resizableCircle.resize(2.0);;
    }
}