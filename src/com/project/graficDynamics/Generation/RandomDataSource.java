package com.project.graficDynamics.Generation;

import java.util.Random;

import com.project.graficDynamics.DataSource.DataSource;

class RandomDataSource implements DataSource<Double> {
	
	public Random random = new Random();
	
	@Override
	public Double getValue() {
       return random.nextDouble(); 		
	}

}
