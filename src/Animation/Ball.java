package Animation;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;
import com.donttouch.kimin.CatchMe;

/**
 * Created by Ki Min on 10/29/2016.
 */

public class Ball {
    private int ballMovement = 50;
    private int gravity = 3;

    private Vector3 position;
    private Texture ball;

    public Ball() {
        ball = new Texture("ball.png");
        position = new Vector3(CatchMe.WIDTH/2 - (ball.getWidth()/2), CatchMe.HEIGHT + ball.getHeight(), 0);
    }

    public Vector3 getPosition() { return position; }

    public Texture getBall() { return ball; }

    public double getWidth() { return ball.getWidth(); }

    public void moveDown(float dt) { position.y -= ballMovement * dt; }

    public void addGravity() { ballMovement += gravity; }

    public void dispose() { ball.dispose(); }

}
