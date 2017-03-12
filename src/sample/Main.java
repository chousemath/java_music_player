package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);

        Text sceneTitle = new Text("Welcome Joseph");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));

        Button btnPlay = new Button();
        btnPlay.setText("Play");
        btnPlay.setOnAction(new EventHandler<ActionEvent>() {
            // performs a compile-time check that the method is indeed being overridden
            @Override
            public void handle(ActionEvent event) {
                double lbsValue = 100d;
                double kgValue = lbsValue * 0.453_592d;
                System.out.println(String.format("%s lbs is %s kgs", lbsValue, kgValue));
            }
        });

        grid.add(sceneTitle, 0, 0, 2, 1);
        grid.add(btnPlay, 0, 2, 2, 1);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(grid, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
