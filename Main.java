import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.HashMap;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.scene.control.TableRow;

public class Main extends Application {
    Stage window;
    Scene scene_Login;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.window = primaryStage;
        logInMenu();
    }

    public void logInMenu() {
        window.setTitle("Scduler Calclator");

        // LogIn Page Gui

        GridPane loginGridPane = new GridPane();
        loginGridPane.setPadding(new Insets(10, 10, 10, 10));
        loginGridPane.setVgap(8);
        loginGridPane.setHgap(10);

        // lable name
        Label nameLable = new Label("Process Scheduling Algorithms");
        GridPane.setConstraints(nameLable, 2, 0);


        ChoiceBox<String> processScedulingName = new ChoiceBox<>();
        processScedulingName.getItems().addAll("Round Robin with Quantum 3","Preemptive SJF","Non-Preemptive SJF","Preemptive Priority","Non-Preemptive Priority");
        GridPane.setConstraints(processScedulingName, 2, 1);

        Label arivalLable = new Label("Arival Time");
        GridPane.setConstraints( arivalLable, 2, 2);

        // name imput
        TextField namTextField = new TextField();
        namTextField.setPromptText("Eg: 12334567890");
        GridPane.setConstraints(namTextField, 2, 3);

        // Password name
        Label passLable = new Label("Burst Time");
        GridPane.setConstraints(passLable, 2, 4);

        // Password imput

        TextField passTextField = new TextField();
        GridPane.setConstraints(passTextField, 2, 5);

        // Log In Button

        Button loginButton = new Button("Calculate");

        GridPane.setConstraints(loginButton, 2, 6);

        // Passing the Object to the Scene

        loginGridPane.getChildren().addAll(nameLable, namTextField, passLable, passTextField, loginButton,processScedulingName,arivalLable);

        Scene scene_Login = new Scene(loginGridPane, 400, 250);

        window.setScene(scene_Login);

        window.show();

    }
}
