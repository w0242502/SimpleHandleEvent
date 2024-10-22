module ca.nscc.simplehandleevent {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ca.nscc.simplehandleevent to javafx.fxml;
    exports ca.nscc.simplehandleevent;
}