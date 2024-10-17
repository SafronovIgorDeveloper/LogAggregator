package log.aggregator.stages;

import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import log.aggregator.components.LogTable;
import log.aggregator.util.Constants;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class MainStage {

    public MainStage(Stage stage) {
        if (stage == null) {
            throw new IllegalArgumentException("Stage must not be null");
        }
        setupStage(stage);
    }

    private void setupStage(Stage stage) {
        var root = createRootPane(stage);
        var scene = new Scene(root, 800, 600);

        stage.setTitle(Constants.APPLICATION_TITLE);
        stage.setScene(scene);
        stage.show();
    }

    private BorderPane createRootPane(Stage stage) {
        var root = new BorderPane();
        var logTable = new LogTable();

        logTable.addLogEntry("2023-10-21 10:15:30",
                "INFO",
                "This is a test log message");
        logTable.addLogEntry("2023-10-21 10:15:35",
                "ERROR",
                "This is a test log message");

        root.setTop(createMenuBar(stage));
        root.setCenter(logTable.getTableView());

        return root;
    }

    private MenuBar createMenuBar(Stage stage) {
        var menuBar = new MenuBar();
        var settingsMenu = new Menu("Log Aggregator");
        var openSettingsItem = new MenuItem("Settings");

        openSettingsItem.setOnAction(e -> new SettingsStage(stage));
        settingsMenu.getItems().add(openSettingsItem);
        menuBar.getMenus().add(settingsMenu);

        return menuBar;
    }
}