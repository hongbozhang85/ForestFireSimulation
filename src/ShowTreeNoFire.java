import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;

/**
 * Created by hongbo on 17-2-22.
 */
public class ShowTreeNoFire extends ImageView implements Show {

    Cartesian position;

    ShowTreeNoFire(Cartesian position) {
        this.position = position;
        //showFigure();
    }

    @Override
    public void showFigure() {
        URL url = ShowTreeNoFire.class.getResource(URI_BASE + "treenofire.png");
        setImage(new Image(url.toString()));
        setFitHeight(SIZE_TREE);
        setFitWidth(SIZE_TREE);
        setX(position.x());
        setY(position.y());
        setOpacity(1.0);
    }

    @Override
    public  void hideFigure() {
        setOpacity(0.0);
    }

}
