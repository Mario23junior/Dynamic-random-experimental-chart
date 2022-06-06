package com.project.graficDynamics.utils.canvasChart;

import java.util.ArrayDeque;
import java.util.Deque;

import com.project.graficDynamics.DataSource.DataSource;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class CanvasLineChart {

	private GraphicsContext g;
	private Color color;
	private DataSource<Double> dataSource;
	private Deque<Double> buffer = new ArrayDeque<Double>();

	double oldx = -1;
	double oldy = -1;

	private static final int PIXEL_PER_UNIT = 5;
	private static final int MAX_ITEMS = 800 / PIXEL_PER_UNIT;
	
	public CanvasLineChart(GraphicsContext g, Color color, DataSource<Double> dataSource) {
		super();
		this.g = g;
		this.color = color;
		this.dataSource = dataSource;
	}

	public void updates() {
		double value = dataSource.getValue();

		buffer.addLast(value);
		if (buffer.size() > MAX_ITEMS) {
			buffer.removeFirst();
		}

		// Renderizando
		g.setStroke(color);
		
		buffer.forEach(y -> {
		if (oldy > -1) {
				g.strokeLine(oldx * PIXEL_PER_UNIT, oldy * 600, (oldx + 1) * PIXEL_PER_UNIT , y * 600);
			}
			
			oldx = oldx + 1;
			oldy = y;
		});
		oldx = -1;
		oldy = -1;
	}
}
