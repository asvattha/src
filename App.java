import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class App extends Application{

    @Override
    public void start(Stage primaryStage) {

        View myGameView = new View(primaryStage, 100, 100, 20);
        myGameView.show();

        Model myGameModel = new Model(myGameView );
        Controller myGameController = new Controller(myGameModel, myGameView);
        myGameController.start();
    }
    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }
}
