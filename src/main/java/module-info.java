module log.aggregator {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;

    opens log.aggregator to javafx.fxml;
    opens log.aggregator.components to javafx.fxml;

    exports log.aggregator;
    exports log.aggregator.util;
    exports log.aggregator.components;
}