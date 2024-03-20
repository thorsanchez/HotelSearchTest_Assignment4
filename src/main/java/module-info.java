module com.example.hotelsearchtest_assignment4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hotelsearchtest_assignment4 to javafx.fxml;
    exports com.example.hotelsearchtest_assignment4;
}
