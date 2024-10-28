import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class App extends Application {

        @Override
        public void start(Stage primaryStage) {

            BouncingBall myBall = new BouncingBall(primaryStage);
            myBall.viewLayout();
            myBall.animateBall();
        }
    public static void main(String[] args)  {
        Application.launch(args);
    }
}
