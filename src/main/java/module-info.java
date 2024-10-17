module log.aggregator {
    requires javafx.controls;
    requires javafx.fxml;
    opens log.aggregator to javafx.fxml;
    exports log.aggregator;
}