import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloWorldController {

    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    public void reactToClick(ActionEvent event) {
        System.out.println("Button clicked!");
        // You can add your custom logic here
        if (label1 != null) {
            label1.setText("Button was clicked!");
        }
    }
}
