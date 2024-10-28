public class BallModel {

    double centerX, centerY;
    int radius;
    int dirX = 1;
    int dirY = 1;
    double speed = 2;

    public BallModel(double centerX, double centerY, int radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
    
    public void bounceBall(double sceneHeight, double sceneWidth) {

        if(centerX < radius || (centerX + radius) >= sceneWidth) {
            dirX *= -1;
        }

        if(centerY < radius || (centerY + radius) >= sceneHeight) {
            dirY *= -1;
        }
    }

    public void moveBall(double sceneHeight, double sceneWidth) {
        bounceBall(sceneHeight, sceneWidth);
        centerX = centerX + dirX * speed;
        centerY = centerY + dirY * speed;
    }

    public double getCenterX() {
        return centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public void accelerate() {
        speed += 0.2*speed;
    }

    public void decelerate() {
        speed -= 0.2*speed;
    }
}
