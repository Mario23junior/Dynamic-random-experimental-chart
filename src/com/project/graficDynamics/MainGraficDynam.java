package com.project.graficDynamics;

import com.project.graficDynamics.Generation.CreateContent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainGraficDynam extends Application{

	@Override
	public void start(Stage stage) throws Exception {
	   CreateContent create = new CreateContent();   
       stage.setScene(new Scene(create.createContent()));
       stage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
