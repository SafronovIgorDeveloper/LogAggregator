package log.aggregator.stages;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class SettingsStage {

    public SettingsStage(Stage primaryStage) {
        var settingsStage = new Stage();
        settingsStage.setTitle("Settings");

        var settingsRoot = new BorderPane();
        var settingsScene = new Scene(settingsRoot, 400, 300);
        settingsStage.setScene(settingsScene);
        settingsStage.initOwner(primaryStage);
        settingsStage.show();
    }
}