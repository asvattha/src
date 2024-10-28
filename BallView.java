import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class BallView extends Pane {

    Circle ball;
    int radius;
    double centerX, centerY;
    
    Stage primaryStage;
    Scene scene;

    public BallView(Stage primaryStage, double centerX, double centerY, int radius) {
        this.primaryStage = primaryStage;
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        viewSetup();
    }

    public void viewSetup() {
        ball = new Circle(centerX, centerY, radius);
        getChildren().add(ball);

        scene = new Scene(this, 500, 300);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
    }

    public void updateBallPosition(double centerX, double centerY){
        ball.setCenterX(centerX);
        ball.setCenterY(centerY);
    }

    public void show() {
        primaryStage.show();
        this.requestFocus();
    }

    public double fetchHeight() {
        return scene.getHeight();
    }

    public double fetchWidth() {
        return scene.getWidth();
    }

    public double getCenterX() {
        return centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public int getRadius() {
        return radius;
    }
    
}
