package cr.ac.una.practica;


import  cr.ac.una.practica.util.AppContext;
import cr.ac.una.practica.utilFlowController;
import java.util.Scanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import java.io.IOException;
import static javafx.application.Application.launch;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        FlowController.getInstance().InitializeFlow(stage, null);
        FlowController.getInstance().goViewInWindow("ejemplo");
    }

    public static void main(String[] args) {
        launch();
    }

}