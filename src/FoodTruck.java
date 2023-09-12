import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Arc;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.control.Label;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import  java.io.File;

/**
 * FoodTruck is an javaFX program that include 2 window.
 * @author Nhat Le
 * @version 1.0
 */
public class FoodTruck extends Application {
    private final int hor = 772;
    private final  int ver = 500;

    private double total = 0;

    private int totalS = 0;
    private int totalR = 0;
    private int totalC = 0;

    private int steakNum;
    private int riceNum;
    private int cakeNum;

    private TextField steak = new TextField("0");
    private TextField rice = new TextField("0");
    private TextField cake = new TextField("0");

    private  Button btn;
    private Button btn2;

    private Label temp = new Label("The total is: $" + total);

    /**
     * start is a method that get override,
     * and contain most of the program functionality.
     * @param primaryStage take in the main stage.
     */
    @Override
    public void start(Stage primaryStage) {

        Circle mid = new Circle(hor / 2, ver / 2, 70);
        mid.setStrokeWidth(4);
        mid.setStyle("-fx-stroke: white");
        mid.setFill(Color.web("#4c8527"));

        Line l1 = new Line(0, 100, 150, 100);
        l1.setStrokeWidth(4);
        l1.setStyle("-fx-stroke: white");
        Line l2 = new Line(0, 400, 150, 400);
        l2.setStrokeWidth(4);
        l2.setStyle("-fx-stroke: white");
        Line v1 = new Line(150, 100, 150, 400);
        v1.setStrokeWidth(4);
        v1.setStyle("-fx-stroke: white");

        Line s1 = new Line(0, 175, 50, 175);
        s1.setStrokeWidth(4);
        s1.setStyle("-fx-stroke: white");
        Line s2 = new Line(0, 325, 50, 325);
        s2.setStrokeWidth(4);
        s2.setStyle("-fx-stroke: white");
        Line b1 = new Line(50, 175, 50, 325);
        b1.setStrokeWidth(4);
        b1.setStyle("-fx-stroke: white");

        Line l3 = new Line(hor, 100, hor - 150, 100);
        l3.setStrokeWidth(4);
        l3.setStyle("-fx-stroke: white");
        Line l4 = new Line(hor, 400, hor - 150, 400);
        l4.setStrokeWidth(4);
        l4.setStyle("-fx-stroke: white");
        Line v2 = new Line(hor - 150, 100, hor - 150, 400);
        v2.setStrokeWidth(4);
        v2.setStyle("-fx-stroke: white");

        Line s3 = new Line(hor, 175, hor - 50, 175);
        s3.setStrokeWidth(4);
        s3.setStyle("-fx-stroke: white");
        Line s4 = new Line(hor, 325, hor - 50, 325);
        s4.setStrokeWidth(4);
        s4.setStyle("-fx-stroke: white");
        Line b2 = new Line(hor - 50, 175, hor - 50, 325);
        b2.setStrokeWidth(4);
        b2.setStyle("-fx-stroke: white");

        Line lMid = new Line(hor / 2, 0, hor / 2, ver);
        lMid.setStrokeWidth(4);
        lMid.setStyle("-fx-stroke: white");

        Line h1Line = new Line(0, 0, hor, 0);
        h1Line.setStrokeWidth(8);
        h1Line.setStyle("-fx-stroke: white");

        Line h2Line = new Line(0, ver, hor, ver);
        h2Line.setStrokeWidth(8);
        h2Line.setStyle("-fx-stroke: white");

        Line v1Line = new Line(0, 0, 0, ver);
        v1Line.setStrokeWidth(8);
        v1Line.setStyle("-fx-stroke: white");

        Line v2Line = new Line(hor, 0, hor, ver);
        v2Line.setStrokeWidth(8);
        v2Line.setStyle("-fx-stroke: white");

        Circle lT = new Circle(0, 0, 30);
        lT.setStrokeWidth(4);
        lT.setStyle("-fx-stroke: white");
        lT.setFill(Color.TRANSPARENT);

        Circle lB = new Circle(0, ver, 30);
        lB.setStrokeWidth(4);
        lB.setStyle("-fx-stroke: white");
        lB.setFill(Color.TRANSPARENT);

        Circle rT = new Circle(hor, ver, 30);
        rT.setStrokeWidth(4);
        rT.setStyle("-fx-stroke: white");
        rT.setFill(Color.TRANSPARENT);

        Circle rB = new Circle(hor, 0, 30);
        rB.setStrokeWidth(4);
        rB.setStyle("-fx-stroke: white");
        rB.setFill(Color.TRANSPARENT);

        Arc arc1 = new Arc(150, ver / 2, 45, 70, 270, 180);
        arc1.setStrokeWidth(4);
        arc1.setStyle("-fx-stroke: white");
        arc1.setFill(Color.TRANSPARENT);

        Arc arc2 = new Arc(hor - 150, ver / 2, 45, 70, 90, 180);
        arc2.setStrokeWidth(4);
        arc2.setStyle("-fx-stroke: white");
        arc2.setFill(Color.TRANSPARENT);

        Rectangle a1 = new Rectangle(175, 50, 175, 33);
        a1.setStroke(Color.web("#74ACDF"));
        a1.setFill(Color.web("#74ACDF"));
        Rectangle a2 = new Rectangle(175, 83, 175, 33);
        a2.setStroke(Color.WHITE);
        a2.setFill(Color.WHITE);
        Rectangle a3 = new Rectangle(175, 116, 175, 33);
        a3.setStroke(Color.web("#74ACDF"));
        a3.setFill(Color.web("#74ACDF"));

        Circle y = new Circle(525 / 2, 100, 10);
        y.setFill(Color.web("#F6B40E"));

        Rectangle g1 = new Rectangle(422, 50, 175, 33);
        g1.setStroke(Color.web("#000000"));
        g1.setFill(Color.web("#000000"));
        Rectangle g2 = new Rectangle(422, 83, 175, 33);
        g2.setStroke(Color.web("#DD0000"));
        g2.setFill(Color.web("#DD0000"));
        Rectangle g3 = new Rectangle(422, 116, 175, 33);
        g3.setStroke(Color.web("#FFCC00"));
        g3.setFill(Color.web("#FFCC00"));

        Text personal = new Text("Nhat Le\nnimh6@gatech.edu");
        personal.setFont(Font.font("Impact", FontWeight.BOLD, 15));
        HBox initial = new HBox();
        initial.getChildren().add(personal);

        Group bestRoot = new Group();
        bestRoot.getChildren().addAll(l1, l2, v1, mid, l3, l4, v2, s1, s2,
                b1, s3, s4, b2, lMid, h1Line, h2Line, v1Line, v2Line, lT,
                lB, rT, rB, arc1, arc2, a1, a2, a3, g1, g2, g3, y, initial);

        BorderPane border = new BorderPane();
        GridPane grid = new GridPane();

        Image imageS = new Image("steak.jpeg");
        ImageView sPics = new ImageView(imageS);
        sPics.setFitHeight(45);
        sPics.setFitWidth(45);
        grid.add(sPics, 2, 0);

        Image imageR = new Image("rice.jpeg");
        ImageView rPics = new ImageView(imageR);
        rPics.setFitHeight(45);
        rPics.setFitWidth(45);
        grid.add(rPics, 2, 1);

        Image imageC = new Image("cake.jpeg");
        ImageView cPics = new ImageView(imageC);
        cPics.setFitHeight(45);
        cPics.setFitWidth(45);
        grid.add(cPics, 2, 2);

        grid.setAlignment(Pos.CENTER_LEFT);
        grid.setPadding(new Insets(25, 30, 35, 40));
        grid.setVgap(20);
        grid.setHgap(20);

        Text textS = new Text("Steak($35)");
        textS.setFont(Font.font("Impact", FontWeight.BOLD, 20));

        Text textR = new Text("Fried Rice($14)");
        textR.setFont(Font.font("Impact", FontWeight.BOLD, 20));

        Text textC = new Text("Cake($25)");
        textC.setFont(Font.font("Impact", FontWeight.BOLD, 20));

        grid.add(steak, 3, 0);
        grid.add(textS, 4, 0);
        grid.add(rice, 3, 1);
        grid.add(textR, 4, 1);
        grid.add(cake, 3, 2);
        grid.add(textC, 4, 2);

        btn = new Button("Purchase");
        btn.setFont(Font.font("Impact", FontWeight.BLACK, 13));
        btn.setStyle("-fx-background-color: orange");
        grid.add(btn, 4, 5);
        btn.setOnAction(
                new EventHandler<ActionEvent>() {
                    /**
                     * handle is an anonymous clas that act as an event handler.
                     * @param actionEvent take in an action event to handle.
                     */
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        boolean toSee = false;
                        double tax = total * 0.04;
                        double fTotal = total + tax;
                        try {
                            File file = new File("order.txt");
                            PrintWriter write = new PrintWriter(file);

                            if (isDigit(steak.getText()) && isDigit(rice.getText()) && isDigit(cake.getText())) {
                                if (steakNum > 0) {
                                    toSee = true;
                                    write.println(steakNum + " steak");
                                }
                                if (riceNum > 0) {
                                    toSee = true;
                                    write.println(riceNum + " rice");
                                }
                                if (cakeNum > 0) {
                                    toSee = true;
                                    write.println(cakeNum + " rice");
                                }
                            }

                            if (toSee) {
                                write.println("Total before tax: $" + total);
                                write.println("Tax: $" + tax);
                                write.println("Final total: $" + fTotal);
                                write.close();
                            } else {
                                write.println("An error has occurs with purchasing process.");
                                write.close();
                            }
                        } catch (FileNotFoundException b) {
                            System.out.println("Sorry, no receipt at this time.");
                        }
                    }
                }
        );

        btn.setOnMouseEntered(e -> {
            btn.setStyle("-fx-background-color: green");
        });
        btn.setOnMouseExited(e -> {
            btn.setStyle("-fx-background-color: orange");
        });

        btn2 = new Button("Clear");
        btn2.setFont(Font.font("Impact", FontWeight.BLACK, 13));
        btn2.setStyle("-fx-background-color: orange");
        grid.add(btn2, 2, 5);
        TypeValue handy = new TypeValue();
        btn2.setOnAction(handy);

        btn2.setOnMouseEntered(e -> {
            btn2.setStyle("-fx-background-color: green");
        });
        btn2.setOnMouseExited(e -> {
            btn2.setStyle("-fx-background-color: orange");
        });

        grid.add(temp, 3, 3);

        border.setTop(getHBox());
        StackPane root = new StackPane();
        Scene scene2 = new Scene(root, hor, ver);
        root.getChildren().addAll(border, grid);

        Stage foodTruck = new Stage();
        foodTruck.setScene(scene2);
        foodTruck.show();

        Scene scene = new Scene(bestRoot, hor, ver, Color.web("#4c8527"));
        primaryStage.setTitle("WORLD CUP 2022 FINAL PREDICTION");
        primaryStage.setScene(scene);
        primaryStage.show();

        steak.setOnKeyTyped(e -> {

            boolean check = false;
            if (!(steak.getText().equals(""))) {
                try {
                    Integer.valueOf(steak.getText());
                } catch (Exception x) {
                    check = true;
                }
            }

            try {
                if (check) {
                    throw new IllegalQuantityException(steak.getText());
                }

                int s = Integer.valueOf(steak.getText());
                if (s < 0) {
                    throw new NegativeQuantityException(steak.getText());
                }

                steakNum = s;
                s *= 35;
                totalS = s;
                total = totalS + totalR + totalC;
                temp.setText("The total is: $" + total);
            } catch (NumberFormatException v) {
                totalS = 0;
                total = totalS + totalR + totalC;
                temp.setText("The total is: $" + total);
            } catch (NegativeQuantityException b) {
                temp.setText(b.getMessage());
            } catch (IllegalQuantityException c) {
                temp.setText(c.getMessage());
            }
        });

        rice.setOnKeyTyped(e -> {

            boolean check = false;
            if (!(rice.getText().equals(""))) {
                try {
                    Integer.valueOf(rice.getText());
                } catch (Exception x) {
                    check = true;
                }
            }

            try {
                if (check) {
                    throw new IllegalQuantityException(rice.getText());
                }

                int r = Integer.valueOf(rice.getText());
                if (r < 0) {
                    throw new NegativeQuantityException(rice.getText());
                }
                riceNum = r;
                r *= 14;
                totalR = r;
                total = totalS + totalR + totalC;
                temp.setText("The total is: $" + total);
            } catch (NumberFormatException v) {
                totalR = 0;
                total = totalS + totalR + totalC;
                temp.setText("The total is: $" + total);
            } catch (NegativeQuantityException b) {
                temp.setText(b.getMessage());
            } catch (IllegalQuantityException c) {
                temp.setText(c.getMessage());
            }
        });

        cake.setOnKeyTyped(e -> {
            boolean check = false;
            if (!(cake.getText().equals(""))) {
                try {
                    Integer.valueOf(cake.getText());
                } catch (Exception x) {
                    check = true;
                }
            }

            try {
                if (check) {
                    throw new IllegalQuantityException(cake.getText());
                }

                int c = Integer.valueOf(cake.getText());
                if (c  < 0) {
                    throw new NegativeQuantityException(cake.getText());
                }
                cakeNum = c;
                c *= 25;
                totalC = c;
                total = totalS + totalR + totalC;
                temp.setText("The total is: $" + total);
            } catch (NumberFormatException v) {
                totalC = 0;
                total = totalS + totalR + totalC;
                temp.setText("The total is: $" + total);
            } catch (NegativeQuantityException b) {
                temp.setText(b.getMessage());
            } catch (IllegalQuantityException c) {
                temp.setText(c.getMessage());
            }
        });
    }

    private class TypeValue implements EventHandler<ActionEvent> {
        /**
         * handle is inside inner class to act as an event handler.
         * @param e take in an ActionEvent.
         */
        @Override
        public void handle(ActionEvent e) {
            totalS = 0;
            totalR = 0;
            totalC = 0;
            steak.clear();
            rice.clear();
            cake.clear();
            steak.setText("0");
            rice.setText("0");
            cake.setText("0");
            total = 0;
            temp.setText("The total is: $" + total);
        }
    }

    /**
     * This method is a HBox for the FoodTruck title.
     * @return a HBox.
     */
    private HBox getHBox() {
        Text title = new Text(20, 20, "CS 1331 Food Truck");
        title.setFont(Font.font("Impact", FontWeight.BOLD, 40));
        HBox box = new HBox(50, title);
        box.setPadding(new Insets(25, 25, 25, 235));
        box.setStyle("-fx-background-color: orange");
        return box;
    }

    /**
     * isDigit check whether the String pass in is a number.
     * @param t take in a string.
     * @return a boolean value.
     */
    private static boolean isDigit(String t) {
        try {
            Integer.valueOf(t);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}


