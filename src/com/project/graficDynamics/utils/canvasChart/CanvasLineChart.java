package com.project.graficDynamics.utils.canvasChart;

import com.project.graficDynamics.DataSource.DataSource;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class CanvasLineChart {
  
	private GraphicsContext g;
	private Color color;
	private DataSource<Double> dataSource;
	
	public CanvasLineChart(GraphicsContext g, Color color, DataSource<Double> dataSource) {
		super();
		this.g = g;
		this.color = color;
		this.dataSource = dataSource;
	}
	
	
	
}
