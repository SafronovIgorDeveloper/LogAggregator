package log.aggregator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Label label = new Label("Hello, JavaFX");
        Scene scene = new Scene(label, 400, 300);
        stage.setScene(scene);
        stage.setTitle("JavaFX Application");
        stage.show();
    }
}
