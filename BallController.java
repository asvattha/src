import javafx.animation.Timeline;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.beans.EventHandler;

import javafx.animation.KeyFrame;
import javafx.util.Duration;


public class BallController {

    BallModel ballModel;
    BallView ballView;
    Timeline animation;

    public BallController(BallModel ballModel, BallView ballView) {
        this.ballModel = ballModel;
        this.ballView = ballView;
        setupGameControls();
    }

    public void setupGameControls() {
        animate();
        ballView.requestFocus();
        System.out.println("ffshs");
        ballView.setOnKeyPressed(e-> setKeyControls(e));
        ballView.setOnMousePressed(e -> pause());
        ballView.setOnMouseReleased(e -> play());
        //ballView.setOnKeyPressed(e-> handleSpeed(e));
    }

    public void animate() {
        double sceneHeight = ballView.fetchHeight();
        double sceneWidth = ballView.fetchWidth();
        KeyFrame myKeyFrame = new KeyFrame(Duration.millis(50), e->move(sceneHeight, sceneWidth));
        animation = new Timeline(myKeyFrame);
        animation.setCycleCount(Timeline.INDEFINITE);
    }

    public void setKeyControls(KeyEvent e) {
            if (e.getCode() == KeyCode.UP) 
                ballModel.accelerate();

            if (e.getCode() == KeyCode.DOWN)
                ballModel.decelerate();

            if (e.getCode() == KeyCode.ENTER)
                start();

            if (e.getCode() == KeyCode.ESCAPE) 
                stop();
        }

    public void pause() {
        if(animation != null)
            animation.pause();
    }

    public void play() {
        if(animation != null)
            animation.play();
    }

    public void stop() {
        if(animation != null) {
            ballView.updateBallPosition(100, 100);
            animation.stop();
        }
        
    }

    public void move(double sceneHeight, double sceneWidth) {
        ballModel.moveBall(sceneHeight, sceneWidth);
        double centerX = ballModel.getCenterX();
        double centerY = ballModel.getCenterY();
        ballView.updateBallPosition(centerX, centerY);
    }

    public void start() { 
        animate();
        animation.play();
    }
    
}
