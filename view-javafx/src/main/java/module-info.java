module com.sakarya.viewjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.db.eclipslink;
    opens com.sakarya.viewjavafx to javafx.fxml;
    exports com.sakarya.viewjavafx;
}