package States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.donttouch.kimin.CatchMe;

import Animation.Ball;
import Animation.Brick;
import Scene.GameStage;

/**
 * Created by Ki Min on 10/29/2016.
 */

public class PlayState extends State{
    private boolean touch = false;
    private int level = 0;
    private int highScore = 0;

    private Texture background;
    private Ball ball;
    private Brick brickOne;
    private Brick brickTwo;
    private GameStage gameStage;

    public PlayState(GameStateManager gsm){
        super(gsm);
        background = new Texture("background.png");
        ball = new Ball();
        brickOne = new Brick(0);
        brickTwo = new Brick(CatchMe.WIDTH);
        gameStage = new GameStage(CatchMe.batch);
        editStage();
    }

    private void editStage(){
        Label levelLabel = new Label(String.format("%01d", level), new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        Label highScoreLabel = new Label("HIGH SCORE : " + String.format("%01d", highScore), new Label.LabelStyle(new BitmapFont(), Color.WHITE));

        gameStage.table.add(highScoreLabel).expandX().padTop(30);
        gameStage.table.row();
        gameStage.table.add(levelLabel).expandX().padTop(5);

        gameStage.stage.addActor(gameStage.table);
    }

    @Override
    protected void handleInput() {
        if(brickTwo.getPosition().x - brickOne.getPosition().x < 0)
            gsm.set(new EndState(gsm));
        if(Gdx.input.justTouched()){
            touch = true;
            brickOne.setMovement(200);
            brickTwo.setMovement(200);
        }
    }

    @Override
    public void update(float dt) {
        handleInput();
        ball.addGravity();;
        ball.moveDown(dt);

        if(touch == true){
            brickOne.moveStraight(dt);
            brickTwo.moveBack(dt);
        }
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background, 0, 0);
        sb.draw(ball.getBall(), ball.getPosition().x, ball.getPosition().y);
        sb.draw(brickOne.getBrick(), brickOne.getPosition().x - brickOne.getWidth(), CatchMe.HEIGHT/2 - (brickOne.getHeight()*2));
        sb.draw(brickTwo.getBrick(), brickTwo.getPosition().x, CatchMe.HEIGHT/2 - (brickTwo.getHeight()*2));
        sb.end();
        gameStage.stage.draw();
    }

    @Override
    public void dispose() {
        brickOne.dispose();
        brickTwo.dispose();
        ball.dispose();
        background.dispose();

    }
}
