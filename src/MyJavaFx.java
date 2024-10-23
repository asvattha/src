import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MyJavaFx extends Application{

    @Override
    public void start(Stage primaryStage){

        StackPane pane = new StackPane();

        Button btnOk = new Button("OK");
        pane.getChildren().add(btnOk);

        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }
}
