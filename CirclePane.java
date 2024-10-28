import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

public class CirclePane extends Pane{

    Stage stage;
    Button btnEnlarge;
    Button btnShrink;
    Circle circle;

    public CirclePane(Stage primaryStage){
        stage = primaryStage;
    }

    public void viewLayout(){

        btnEnlarge = new Button("Enlarge");
        btnShrink = new Button("Shrink");
        HBox bottomBar = new HBox();
        bottomBar.getChildren().add(btnEnlarge);
        bottomBar.getChildren().add(btnShrink);
        bottomBar.setSpacing(20);
        bottomBar.setAlignment(Pos.CENTER);

        circle = new Circle(50);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.RED);

        BorderPane bPane = new BorderPane();
        bPane.setCenter(circle);
        bPane.setBottom(bottomBar);
        //BorderPane.setAlignment(bottomBar, Pos.CENTER);

        Scene scene = new Scene(bPane, 200, 200);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public void viewController() {
        btnEnlarge.setOnAction(e -> IncreaseRadius());
        btnShrink.setOnAction(e -> DecreaseRadius());
    }

    public void IncreaseRadius() {
        if (circle.getRadius() < 60)
            circle.setRadius(circle.getRadius() + 2);
    }

    public void DecreaseRadius() {
        if (circle.getRadius() > 30)
            circle.setRadius(circle.getRadius() - 2);   
    }    
 
}
