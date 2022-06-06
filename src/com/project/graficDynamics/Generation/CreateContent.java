package com.project.graficDynamics.Generation;

import javafx.animation.AnimationTimer;
import javafx.scene.Parent;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;

public class CreateContent {
   
	public Parent createContent() {
		Pane root = new Pane();
		root.setPrefSize(900, 600);
		
		Canvas canvas = new Canvas();
		GraphicsContext ImageComander = canvas.getGraphicsContext2D();
		
		AnimationTimer timer = new AnimationTimer() {
			
			@Override
			public void handle(long arg0) {
				// TODO Auto-generated method stub
				
			}
		};
		root.getChildren().add(canvas);
		return root;
 	}
}
