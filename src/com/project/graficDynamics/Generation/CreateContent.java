package com.project.graficDynamics.Generation;

import java.util.ArrayList;
import java.util.List;

import com.project.graficDynamics.utils.canvasChart.CanvasLineChart;

import javafx.animation.AnimationTimer;
import javafx.scene.Parent;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;

public class CreateContent {
   
	private List<CanvasLineChart> charts = new ArrayList<>();
	
	public Parent createContent() {
		Pane root = new Pane();
		root.setPrefSize(900, 600);
		
		Canvas canvas = new Canvas();
		GraphicsContext ImageComander = canvas.getGraphicsContext2D();
		
		AnimationTimer timer = new AnimationTimer() {
			
			@Override
			public void handle(long arg0) {
				ImageComander.clearRect(0, 0, 900, 600);
			}
		};
		timer.start();
		root.getChildren().add(canvas);
		return root;
 	}
}
