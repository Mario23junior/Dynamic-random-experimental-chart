package com.project.graficDynamics.Generation;

import java.util.ArrayList;
import java.util.List;

import com.project.graficDynamics.utils.canvasChart.CanvasLineChart;

import javafx.animation.AnimationTimer;
import javafx.scene.Parent;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class CreateContent {
   
	private List<CanvasLineChart> charts = new ArrayList<>();
	private Double timeRum = 0.0;
	
	public Parent createContent() {
		Pane root = new Pane();
		root.setPrefSize(800, 600);
		
		Canvas canvas = new Canvas(800,600);
		GraphicsContext ImageComander = canvas.getGraphicsContext2D();
		
		charts.add(new CanvasLineChart(ImageComander, Color.RED, new RandomDataSource()));
		charts.add(new CanvasLineChart(ImageComander, Color.GREEN, new RandomDataSource()));
 		charts.add(new CanvasLineChart(ImageComander, Color.BLUE ,() -> Math.random() * 0.3));

		
		AnimationTimer timer = new AnimationTimer() {
			@Override
			public void handle(long arg0) {
				timeRum += 0.16;
				
				if(timeRum > 1) {					
					ImageComander.clearRect(0, 0, 800, 600);
					charts.forEach(charts -> charts.updates());
					
					timeRum = 0.2;
				}
				
			}
		};
		timer.start();
		root.getChildren().add(canvas);
		return root;
 	}
}
