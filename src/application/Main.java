package application;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	private Dad game = new Dad();
	
	@Override
	public void start(Stage primaryStage) {
		
		primaryStage.setScene(new Scene(game.getRoot()));
		primaryStage.setTitle("Apples");
		
		game.eventHandler(primaryStage);
		
		primaryStage.show();
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}