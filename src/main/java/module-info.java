module org.example.demoasd {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.demoasd to javafx.fxml;
    exports org.example.demoasd;
}