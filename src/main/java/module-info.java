module sample {
    requires javafx.controls;
    requires javafx.fxml;
    requires jnativehook;

    opens sample to javafx.fxml;
    exports sample;
}