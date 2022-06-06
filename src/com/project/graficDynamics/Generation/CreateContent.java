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
	
	public Parent createContent() {
		Pane root = new Pane();
		root.setPrefSize(900, 600);
		
		Canvas canvas = new Canvas(800,600);
		GraphicsContext ImageComander = canvas.getGraphicsContext2D();
		
		charts.add(new CanvasLineChart(ImageComander, Color.LAVENDER, new RandomDataSource()));
		charts.add(new CanvasLineChart(ImageComander, Color.BISQUE, new RandomDataSource()));
		charts.add(new CanvasLineChart(ImageComander, Color.AQUAMARINE, new RandomDataSource()));
		charts.add(new CanvasLineChart(ImageComander, Color.GREEN ,() -> Math.random() * 2.4));

		
		AnimationTimer timer = new AnimationTimer() {
			@Override
			public void handle(long arg0) {
				ImageComander.clearRect(0, 0, 900, 600);
				charts.forEach(charts -> charts.updates());
			}
		};
		timer.start();
		root.getChildren().add(canvas);
		return root;
 	}
}
