package malaria;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    private CheckBox fever, headache, weakness, chills, vomiting, bodyPain;
    private Label resultLabel;

    @Override
    public void start(Stage stage) {
        fever = new CheckBox("Fever");
        headache = new CheckBox("Headache");
        weakness = new CheckBox("Weakness");
        chills = new CheckBox("Chills");
        vomiting = new CheckBox("Vomiting");
        bodyPain = new CheckBox("Body Pain");

        Button diagnoseButton = new Button("Diagnose");
        resultLabel = new Label();

        diagnoseButton.setOnAction(e -> diagnose());

        VBox root = new VBox(10,
                fever, headache, weakness,
                chills, vomiting, bodyPain,
                diagnoseButton, resultLabel);

        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 400, 400);

        stage.setTitle("Malaria Expert System");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Performs diagnosis based on selected symptoms.
     */
    public void diagnose() {
        try {
            MalariaDiagnosis diagnosis = new MalariaDiagnosis();

            boolean hasMalaria = diagnosis.diagnose(
                    fever.isSelected(),
                    headache.isSelected(),
                    weakness.isSelected(),
                    chills.isSelected(),
                    vomiting.isSelected(),
                    bodyPain.isSelected()
            );

            if (hasMalaria) {
                resultLabel.setText("Likely malaria. Visit a hospital.");
            } else {
                resultLabel.setText("Malaria unlikely based on symptoms.");
            }

        } catch (Exception e) {
            resultLabel.setText("Error during diagnosis.");
        }
    }
}
