import javafx.scene.layout.Pane;

public class Controller {
    
    CirclePane pane;

    public Controller(CirclePane pane){
        this.pane = pane;
    }

    public void performControl() {
        pane.viewController();
    }
}
