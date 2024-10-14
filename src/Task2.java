class Task2 {
    interface Renderer {
        void renderShape(String shape);
    }

    class WindowsRenderer implements Renderer {
        public void renderShape(String shape) {
            System.out.println("Rendering " + shape + " on Windows.");
        }
    }

    class LinuxRenderer implements Renderer {
        public void renderShape(String shape) {
            System.out.println("Rendering " + shape + " on Linux.");
        }
    }
    abstract class Shape {
        protected Renderer renderer;

        Shape(Renderer renderer) {
            this.renderer = renderer;
        }

        abstract void draw();
    }

    class Circle extends Shape {
        Circle(Renderer renderer) {
            super(renderer);
        }

        void draw() {
            renderer.renderShape("Circle");
        }
    }

    class Square extends Shape {
        Square(Renderer renderer) {
            super(renderer);
        }

        void draw() {
            renderer.renderShape("Square");
        }
    }

    public void execute() {
        Renderer windowsRenderer = new WindowsRenderer();
        Renderer linuxRenderer = new LinuxRenderer();

        Shape circle = new Circle(windowsRenderer);
        Shape square = new Square(linuxRenderer);

        circle.draw();
        square.draw();
    }
}
