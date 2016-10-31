package Animation;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by Ki Min on 10/29/2016.
 */

public class Brick {
    private static final int Y_COOR = 190;

    private Vector3 position;
    private Texture brick;
    private int movement;

    public Brick(int x){
        position = new Vector3(x, Y_COOR, 0);
        brick = new Texture("brick.png");
    }

    public Vector3 getPosition() { return position; }

    public Texture getBrick() { return brick; }

    public void moveStraight(float dt) { position.x += movement * dt; }

    public void moveBack(float dt) {position.x -= movement * dt; }

    public void setMovement(int movement) { this.movement = movement; }

    public int getWidth() { return brick.getWidth(); }

    public int getHeight() { return brick.getHeight(); }

    public void dispose() { brick.dispose(); }

}
