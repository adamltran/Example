package application;

import javafx.animation.AnimationTimer;
import javafx.scene.Parent;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Dad {

	private Pane root;
	private AnimationTimer timer;
	private Keyboard keys = new Keyboard();
	private Circle ryan;
	
	private double speed = 12.00;
	public Dad() {
		set();
	}

	private void set(){
		root = new Pane();
		root.setPrefSize(600, 600); //The size of the window
		
		ryan = new Circle(100, 100, 75,Color.ORANGE);
		
		root.getChildren().add(ryan); //This is how you add things to the world
		
		timer = new AnimationTimer(){ //Updates the world
			@Override
			public void handle(long now){
				onUpdate();
			}

			private void onUpdate(){ //Called every time the screen updates
				if(keys.isA()){
					ryan.setTranslateX(ryan.getTranslateX() - speed);
				}
				if(keys.isD()){
					ryan.setTranslateX(ryan.getTranslateX() + speed);
				}
				if(keys.isW()){
					ryan.setTranslateY(ryan.getTranslateY() - speed);
				}
				if(keys.isS()){
					ryan.setTranslateY(ryan.getTranslateY() + speed);

				}
			}
			
		};
		timer.start();
		//timer.stop();
	}
	
	public Parent getRoot(){
		return root;
	}
	
	private void handleKeyPressed(KeyEvent e){
		switch(e.getCode()){
		case A:
			break;
		case D:
			break;
		case S:
			break;
		case W:
			break;
		default:
			break;
		}
	}
	
	public void eventHandler(Stage stage){ //This is where you tell the world how to handle events
		stage.getScene().setOnKeyPressed(event -> keys.handlePressed(event));
		stage.getScene().setOnKeyReleased(event -> keys.handleReleased(event));
	}
	
}
