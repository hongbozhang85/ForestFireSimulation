/**
 * Created by hongbo on 17-2-22.
 */

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Board extends Application {

    private static final int WIDTH = 1366;
    private static final int HEIGHT = 768;
    Group root = new Group();
    Group items = new Group();
    private Forest theForest = new Forest(new Cartesian(40,40), new Trees(40), new Embers());
    private Embers theEmbers = theForest.getEmbers();
    private Trees theTrees = theForest.getTrees();
    private static int timePlayed = 0;

    /**
     * show all the tree and ember (ImageView)
     */
    public void showAllFigures() {
        root.getChildren().clear();
        for (Tree t : theForest.getTrees().getTreesArray() ) {
            t.getDrawTree().showFigure();
            root.getChildren().add((ImageView) t.getDrawTree());
        }
        for (Ember e : theForest.getEmbers().getEmberArray()) {
            e.getDrawEmber().showFigure();
            root.getChildren().add(e.getDrawEmber());
        }
    }

    @Override
    public void start(Stage primaryStage) {


        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(1000),
                ae -> {
                    theEmbers.generate(theForest,timePlayed);
                    theTrees.changStates(theEmbers);
                    showAllFigures();
                    theEmbers.evolution();
                    timePlayed++;
                }));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();


        //root.getChildren().add(new Circle(WIDTH/2,HEIGHT/2,100, Color.PURPLE));

        Scene scene = new Scene(root, WIDTH, HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Forest Fire Simulation");
        primaryStage.show();
    }
}
