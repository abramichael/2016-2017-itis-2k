package sample;

import com.sun.deploy.uitoolkit.impl.fx.ui.FXMessageDialog;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.FileInputStream;

public class Main extends Application {
    private static final int SCREEN_WIDTH = 800;
    private static final int SCREEN_HEIGHT = 400;
    //private List<Bullet>
    @Override
    public void start(Stage primaryStage) throws Exception{

        Group root = new Group();

        FileInputStream fis = new FileInputStream(
                "1.png"
        );
        Image img = new Image(fis);

        ImageView iv = new ImageView(img);
        iv.setFitWidth(100);
        iv.setFitHeight(100);
        iv.setPreserveRatio(true);
        root.getChildren().add(iv);

        root.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.RIGHT) {
                iv.setScaleX(1);
                iv.setX(iv.getX() + 20);
            }
            if (event.getCode() == KeyCode.DOWN) {
                iv.setY(iv.getY() + 20);
            }
            if (event.getCode() == KeyCode.LEFT) {
                iv.setScaleX(-1);
                iv.setX(iv.getX() - 20);
            }
            if (event.getCode() == KeyCode.UP) {
                iv.setY(iv.getY() - 20);
            }
            if (event.getCode() == KeyCode.SPACE) {
                Circle c = new Circle(iv.getX()+90,iv.getY()+70,10);
                root.getChildren().add(c);
                new AnimationTimer(){
                    long was = 0;
                    int d = (int) iv.getScaleX();
                    @Override
                    public void handle(long now) {
                        if (now - was > 1) {
                            c.setCenterX(c.getCenterX() +d  * 10);
                            was = now;
                        }
                    }

                }.start();
            }
        });
        primaryStage.setTitle("Kotanchiki");
        primaryStage.setScene(new Scene(root, SCREEN_WIDTH, SCREEN_HEIGHT));
        primaryStage.show();
        primaryStage.getScene().getRoot().requestFocus();
    }


    public static void main(String[] args) {
        launch(args);
    }
}




 /*
        Button bt = new Button("Press me");
        bt.setOnMouseClicked(event -> {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Don't press me!");
            a.show();
        });
        bt.setOnMouseMoved(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                Alert a = new Alert(Alert.AlertType.WARNING);
                a.setContentText("Don't press me!");
                a.show();
            }
        });
        root.getChildren().add(bt);
        */
