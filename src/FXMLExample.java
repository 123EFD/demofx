
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;

public class FXMLExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // IMPORTANT: Use getResource() to load the FXML file from the classpath.
        // This is the standard, portable way.
        // It assumes 'hello-world.fxml' is in the same directory as this Java file.
        //URL fxmlUrl = getClass().getResource("hello-world.fxml");

        /*if (fxmlUrl == null) {
            System.err.println("Error: Could not find hello-world.fxml on the classpath.");
            return; // Stop execution if the FXML file is missing
        }
         */

        FXMLLoader loader = new FXMLLoader();
        /*  The path uses forward slashes (/) and starts with file:///.
        You must use the full, absolute path to your file.
        Not recommended for production code, but useful for quick tests.
         */
        loader.setLocation(new URL("file:///C:/Users/Chin Shi Er/OneDrive/Documents/Coding/demofx/src/com/jenkov/javafx/hello-world.fxml"));
        // Load the root container defined in the FXML
        VBox vbox = loader.<VBox>load();

        Scene scene = new Scene(vbox, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("FXML Example (Working!)");

        primaryStage.show();
    }
}