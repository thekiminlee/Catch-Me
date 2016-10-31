package Scene;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.donttouch.kimin.CatchMe;

/**
 * Created by Ki Min on 10/30/2016.
 */

public class GameStage {
    public Viewport viewport;
    public static Stage stage;
    public static Table table;

    public GameStage(SpriteBatch sb){
        viewport = new FitViewport(CatchMe.WIDTH, CatchMe.HEIGHT);
        stage = new Stage(viewport, sb);

        table = new Table();
        table.top();
        table.setFillParent(true);

        stage.addActor(table);
    }
}
