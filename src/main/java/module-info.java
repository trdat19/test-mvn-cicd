module example.mvntest {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.slf4j;
    requires jdk.compiler;


    opens example.mvntest to javafx.fxml;
    exports example.mvntest;
}