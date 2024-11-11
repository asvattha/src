import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class View extends BorderPane{

    Circle ball;
    Stage stage;
    double sceneWidth = 500, sceneHeight = 200;
    Pane centerPane = new Pane();
    HBox bottomPane = new HBox();
    int bounceCount = 0;

    Rectangle paddle;
    int paddleHeight = 20, paddleWidth=150;
    double paddleX = (sceneWidth - paddleWidth) / 2;
    double paddleY = sceneHeight - paddleHeight;

    public View(Stage stage, double centerX, double centerY, double radius) {
        this.stage = stage;
        displaySetup(centerX, centerY, radius);
        displayPaddle();
    }

    public void displayPaddle() {
        paddle = new Rectangle(paddleX, paddleY, paddleWidth, paddleHeight);
        getChildren().add(paddle);
    }
    
    public void displaySetup(double centerX, double centerY, double radius) {
        ball = new Circle(centerX, centerY, radius);
        centerPane.getChildren().add(ball);

        Label my_label = new Label("Total Bounces: " + bounceCount);
        bottomPane.getChildren().add(my_label);

        setCenter(centerPane);
        setBottom(bottomPane);

        Scene scene = new Scene(this, sceneWidth, sceneHeight);
        stage.setScene(scene);
        stage.setResizable(false);
    }


    public void show() {
        stage.show();
        requestFocus();
    }

    public void updatePos(double centerX, double centerY) {
        ball.setCenterX(centerX);
        ball.setCenterY(centerY);
    }

    public void updatePaddlePos(double paddleX, double paddleY) {
        paddle.setX(paddleX);
        paddle.setY(paddleY);
    }

    public Circle getBall() {
        return ball;
    }

    public Rectangle getPaddle() {
        return paddle;
    }

    public double getPaddleX() {
        return paddleX;
    }

    public double getPaddleY() {
        return paddleX;
    }

    public double getPaddleWidth() {
        return paddleX;
    }

    public double getSceneWidth() {
        return sceneWidth;
    }

    public double getSceneHeight() {
        return sceneHeight;
    }

    public void setLabel(int bounceCount) {
        Label my_label = (Label)bottomPane.getChildren().get(0);
        my_label.setText("Total Bounces: " + bounceCount);

    }


}
