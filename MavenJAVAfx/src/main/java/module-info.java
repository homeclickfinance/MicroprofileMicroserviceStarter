module com.mycompany.mavenjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.mavenjavafx to javafx.fxml;
    exports com.mycompany.mavenjavafx;
}
