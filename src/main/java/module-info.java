module com.mycompany.desglosededinero {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.desglosededinero to javafx.fxml;
    exports com.mycompany.desglosededinero;
}
