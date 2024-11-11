import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.input.KeyCode;
import javafx.util.Duration;

public class Controller {
    Model model;
    View view;
    Timeline timeline;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        setupGameControls();
    }

    public void setupGameControls() {
        animate();
        setupKeyControls();
        setupCounter();
    }

    public void setupKeyControls() {
        view.setOnKeyPressed(e -> {
            if(e.getCode() == KeyCode.SPACE){
                timeline.pause();
            }

            if(e.getCode() == KeyCode.ENTER){
                timeline.play();
            }

            if(e.getCode() == KeyCode.LEFT){
                model.movePaddle(-1); // left direction
                view.updatePaddlePos(model.getPaddleX(), model.getPaddleY());
            }

            if(e.getCode() == KeyCode.RIGHT){
                model.movePaddle(1); // right direction
                view.updatePaddlePos(model.getPaddleX(), model.getPaddleY());
            }


        });  
    }

    public void animate() {
        timeline = new Timeline(new KeyFrame(Duration.millis(50), e->move()));
        timeline.setCycleCount(timeline.INDEFINITE);
    }

    public void move() {
        model.moveBall(view.getSceneWidth(), view.getSceneHeight(), view.getBall(), view.getPaddle());
        view.updatePos(model.getCenterX(), model.getCenterY());
    }

    public void start() {
        timeline.play();
    }

    public void setupCounter() {
        model.bounceProperty().addListener(ov -> {
            view.setLabel(model.bounceProperty().getValue());
        });
    }
}
