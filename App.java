import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

        @Override
        public void start(Stage primaryStage) {
            
            CirclePane cPane = new CirclePane(primaryStage);
            cPane.viewLayout();
            
            Controller controller = new Controller(cPane);
            controller.performControl();
        }
    public static void main(String[] args)  {
        Application.launch(args);
    }
}
