import processing.core.PApplet;

public class FourBallsSketch extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 20;
    int firstBallState = 0;
    int secondBallState = 0;
    int thirdBallState = 0;
    int fourthBallState = 0;

    public static void main(String[] args) {
        PApplet.main("FourBallsSketch", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        drawFirstBall();
        drawSecondBall();
        drawThirdBall();
        drawFourthBall();
    }

    private void drawFourthBall() {
        int fourthBallPosition = HEIGHT * 4 / 5;
        ellipse(fourthBallState, fourthBallPosition, DIAMETER, DIAMETER);
        fourthBallState = fourthBallState + 4;
    }

    private void drawThirdBall() {
        int thirdBallPosition = HEIGHT * 3 / 5;
        ellipse(thirdBallState, thirdBallPosition, DIAMETER, DIAMETER);
        thirdBallState = thirdBallState + 3;
    }

    private void drawSecondBall() {
        int secondBallPosition = HEIGHT * 2 / 5;
        ellipse(secondBallState, secondBallPosition, DIAMETER, DIAMETER);
        secondBallState = secondBallState + 2;
    }

    private void drawFirstBall() {
        int firstBallPosition = HEIGHT / 5;
        ellipse(firstBallState, firstBallPosition, DIAMETER, DIAMETER);
        firstBallState++;
    }
}
