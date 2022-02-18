package application;
	
import java.io.IOException;

import controller.LoginController;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	Stage currentStage;
	
	@Override
	public void start(Stage primaryStage) {
		
		
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/Login.fxml"));
			
			
			
			Pane root = (Pane)loader.load();
			
			LoginController  controller = loader.getController();
			

			controller.setMain(this);
			
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("../ui/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			currentStage = primaryStage;
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void ShowCalculator() {
		
		try {
			
			Stage stage = new Stage();
			
			
			Pane root = (Pane)FXMLLoader.load(getClass().getResource("../ui/Calculator.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("../ui/application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
			currentStage.close();
			currentStage = stage;
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
