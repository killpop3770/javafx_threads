module nexus.alpha {
    requires javafx.controls;
    requires javafx.fxml;

    opens nexus.alpha to javafx.fxml;
    exports nexus.alpha;
}
