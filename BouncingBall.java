import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class BouncingBall extends Pane{

    Stage stage;
    Circle ball;
    int dirX = 1;
    int dirY = 1;
    int speed = 10;
    Scene scene;

    double sceneWidth;
    double sceneHeight;

    public BouncingBall(Stage stage) {
        this.stage = stage;
    }

    public void viewLayout() {
        
        ball = new Circle(100, 100, 30);
        ball.setFill(Color.RED);

        Pane pane = new Pane(ball);

        scene = new Scene(pane, 500, 300);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public void animateBall(){
        KeyFrame myKeyFrame = new KeyFrame(Duration.millis(50), e->moveBall());
        Timeline timeline = new Timeline(myKeyFrame);
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

    }

 
    public void moveBall(){
            if(ball.getCenterX() - ball.getRadius() <= 0) 
                dirX *= -1;
            else if((ball.getCenterX()+ball.getRadius()) >= scene.getWidth())
                dirX *= -1;

            if(ball.getCenterY() - ball.getRadius() <= 0) 
                dirY *= -1;
            else if((ball.getCenterY() + ball.getRadius()) >= scene.getHeight())
                dirY *= -1;
            
            double centerX = ball.getCenterX()  + (dirX * speed);
            ball.setCenterX(centerX);

            double centerY = ball.getCenterY()  + (dirY * speed);
            ball.setCenterY(centerY);

        }
        
    }
    

