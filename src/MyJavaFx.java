import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFx extends Application{

    @Override
    public void start(Stage primaryStage){
        Button btnOk = new Button("OK");
        Scene scene = new Scene(btnOk, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.show();

        // Creating custom stage
        // Scenes and Buttons are not shared between stages
        Stage myStage = new Stage();
        myStage.setScene(new Scene(new Button("Cancel"), 200, 200));
        myStage.show();
        myStage.setResizable(false);
    }
    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }
}
