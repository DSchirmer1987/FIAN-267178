module com.fian267180.Tag_48_Calculator {
    requires javafx.controls;
    requires javafx.fxml;
	requires java.logging;

    opens com.fian267180.Tag_48_Calculator to javafx.fxml;
    exports com.fian267180.Tag_48_Calculator;
}
