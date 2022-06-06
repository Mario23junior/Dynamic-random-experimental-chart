package com.project.graficDynamics.utils;

import java.util.Random;

import com.project.graficDynamics.DataSource.DataSource;

class RandomDataSource implements DataSource<Double> {

	private Random random = new Random();

	@Override
	public Double getValue() {
       return random.nextDouble(); 		
	}

}
