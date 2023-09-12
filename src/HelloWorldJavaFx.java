import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.*;
import java.util.concurrent.Flow;

public class HelloWorldJavaFx extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World, STUPIDDDD!");
        Button btn = new Button();
        Rectangle rec = new Rectangle(40, 50, 75, 95);
        btn.setText("Say 'Hello World and shut up'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World! ------------------");
                primaryStage.setTitle("Now Now");
            }
        });
        StackPane root = new StackPane();
        Pane yo = new Pane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 500, 250));
        primaryStage.show();
    }
}
