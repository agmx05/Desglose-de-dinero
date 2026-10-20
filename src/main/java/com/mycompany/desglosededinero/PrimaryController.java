package com.mycompany.desglosededinero;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class PrimaryController {

    @FXML TextField txtdinero;

    @FXML Label b500;
    @FXML Label b200;
    @FXML Label b100;
    @FXML Label b50;
    @FXML Label m20;
    @FXML Label m10;
    @FXML Label m5;
    @FXML Label m2;
    @FXML Label m1;

    @FXML
    private void btnDesglosar_click() {

        int dinero, cantidad;

        dinero = Integer.parseInt(txtdinero.getText());

        cantidad = dinero / 500;
        b500.setText("Billetes de $500: " + cantidad);
        dinero = dinero % 500;

        cantidad = dinero / 200;
        b200.setText("Billetes de $200: " + cantidad);
        dinero = dinero % 200;

        cantidad = dinero / 100;
        b100.setText("Billetes de $100: " + cantidad);
        dinero = dinero % 100;

        cantidad = dinero / 50;
        b50.setText("Billetes de $50: " + cantidad);
        dinero = dinero % 50;

        cantidad = dinero / 20;
        m20.setText("Billetes de $20: " + cantidad);
        dinero = dinero % 20;

        cantidad = dinero / 10;
        m10.setText("Monedas de $10: " + cantidad);
        dinero = dinero % 10;

        cantidad = dinero / 5;
        m5.setText("Monedas de $5: " + cantidad);
        dinero = dinero % 5;

        cantidad = dinero / 2;
        m2.setText("Monedas de $2: " + cantidad);
        dinero = dinero % 2;

        cantidad = dinero;
        m1.setText("Monedas de $1: " + cantidad);
    }

    @FXML
    private void btnEquis_click() {
        txtdinero.clear();

        b500.setText("Billetes de $500: ");
        b200.setText("Billetes de $200: ");
        b100.setText("Billetes de $100: ");
        b50.setText("Billetes de $50: ");
        m20.setText("Billetes de $20: ");
        m10.setText("Monedas de $10: ");
        m5.setText("Monedas de $5: ");
        m2.setText("Monedas de $2: ");
        m1.setText("Monedas de $1: ");
    }
}
