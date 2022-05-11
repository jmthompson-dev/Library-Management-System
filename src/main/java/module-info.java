module com.jmthompson.system {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jmthompson.system to javafx.fxml;
    exports com.jmthompson.system;
}