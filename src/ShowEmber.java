import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;

/**
 * Created by hongbo on 17-2-22.
 */
public class ShowEmber extends ImageView implements Show {

    Cartesian position;

    ShowEmber(Cartesian position) {
        this.position = position;
        //showFigure();
    }

    @Override
    public void showFigure() {
        URL url = ShowTreeNoFire.class.getResource(URI_BASE + "ember.png");
        setImage(new Image(url.toString()));
        setFitHeight(SIZE_EMBER);
        setFitWidth(SIZE_EMBER);
        setX(position.x());
        setY(position.y());
        setOpacity(1.0);
    }

    @Override
    public  void hideFigure() {
        setOpacity(0.0);
    }

}

