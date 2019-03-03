package FaCade;

public class FacadeMaster {
    Circle circle ;
    Rectangle rectangle ;

    public FacadeMaster() {
        circle = new Circle();
        rectangle = new Rectangle();
    }

    void drawCircle(){
        circle.draw();
    }

    void drawRectangle(){
        rectangle.draw();
    }
}
