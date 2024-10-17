package log.aggregator.components;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LogTable {
    final TableView<LogEntry> tableView;

    public LogTable() {
        this.tableView = createTableView();
    }

    private TableView<LogEntry> createTableView() {
        TableView<LogEntry> tableView = new TableView<>();

        TableColumn<LogEntry, String> timestampCol = new TableColumn<>("Timestamp");
        timestampCol.setCellValueFactory(new PropertyValueFactory<>("timestamp"));
        timestampCol.setPrefWidth(150);
        timestampCol.setMinWidth(150);
        timestampCol.setMaxWidth(150);

        TableColumn<LogEntry, String> levelCol = new TableColumn<>("Level");
        levelCol.setCellValueFactory(new PropertyValueFactory<>("level"));
        levelCol.setPrefWidth(100);
        levelCol.setMinWidth(100);
        levelCol.setMaxWidth(100);

        TableColumn<LogEntry, String> messageCol = new TableColumn<>("Message");
        messageCol.setCellValueFactory(new PropertyValueFactory<>("message"));
        messageCol.setMinWidth(200);
        messageCol.setMaxWidth(Double.MAX_VALUE);
        messageCol.setResizable(true);

        tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        tableView.getColumns().add(timestampCol);
        tableView.getColumns().add(levelCol);
        tableView.getColumns().add(messageCol);

        return tableView;
    }

    public void addLogEntry(String timestamp, String level, String message) {
        LogEntry entry = new LogEntry(timestamp, level, message);
        tableView.getItems().add(entry);
    }
}