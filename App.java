import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class App extends Application {

        @Override
        public void start(Stage primaryStage) {

            BallView ballView = new BallView(primaryStage, 100, 100, 30);
            ballView.show();

            BallModel ballModel = new BallModel(ballView.getCenterX(), ballView.getCenterY(), ballView.getRadius());

            BallController ballController = new BallController(ballModel, ballView);
           
            
            
        }
    public static void main(String[] args)  {
        Application.launch(args);
    }
}
