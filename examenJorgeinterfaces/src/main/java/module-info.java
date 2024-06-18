module com.example.examenjorgeinterfaces {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires jasperreports;
    requires lombok;

    opens com.example.examenjorgeinterfaces to javafx.fxml;
    exports com.example.examenjorgeinterfaces;
}