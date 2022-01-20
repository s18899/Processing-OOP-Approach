import processing.core.PApplet;

public class FourBalls extends PApplet{


    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    Balls ballW = new Balls(1, HEIGHT/5);
    Balls ballX = new Balls(1,2 * (HEIGHT /5));
    Balls ballY = new Balls(1,3 * (HEIGHT /5));
    Balls ballZ = new Balls(1,4 * (HEIGHT /5));


    public static void main(String[] args) {
        PApplet.main("FourBalls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawCircles();
    }

    private void drawCircles()
    {
        ellipse(ballW.speed, ballW.height, DIAMETER,DIAMETER);
        ballW.speed += 1;

        ellipse(ballX.speed, ballX.height, DIAMETER,DIAMETER);
        ballX.speed += 2;

        ellipse(ballY.speed, ballY.height, DIAMETER,DIAMETER);
        ballY.speed += 3;

        ellipse(ballZ.speed, ballZ.height, DIAMETER,DIAMETER);
        ballZ.speed += 4;
    }

    static class Balls
    {
        int speed;
        int height;

        Balls(int speed, int height)
        {
            this.speed = speed;
            this.height = height;
        }

    }
}