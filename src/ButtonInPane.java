import javafx.application.Application;
import javafx.application.Preloader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.awt.*;

public class ButtonInPane extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    StackPane p = new StackPane();
    p.setOnKeyPressed(e -> {
      switch(e.getCode()) {
        case T:
          TextField write = new TextField();
          p.getChildren().add(write);
          break;
        case R:
          Rectangle rec = new Rectangle(45, 30, 55, 40);
          break;
        case C:
          Circle cir = new Circle(25, 25, 10);
          p.getChildren().add(cir);
          break;
      }
    });
    Scene scene = new Scene(p, 300, 200);

    primaryStage.setTitle("Button in a pane"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}
