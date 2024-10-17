package log.aggregator;

import javafx.application.Application;
import javafx.stage.Stage;
import log.aggregator.stages.MainStage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        new MainStage(primaryStage);
    }
}
