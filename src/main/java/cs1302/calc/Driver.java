package cs1302.calc;

import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.control.Button;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Driver extends Application {

   
    
    public static void main(String[] args){
	launch(args);
	    }
    
    @Override
    public void start(Stage primaryStage) {

	Parent root = null;
	try {
	    root = FXMLLoader.load(getClass().getResource("/calc.fxml"));
	} catch (IOException e) {
	    System.out.println(e);
	    System.exit(1);
	} // try

        primaryStage.setTitle("CalcFX!");
	primaryStage.setScene(new Scene(root, 640, 480));
        primaryStage.show();

    } // start
} // Driver


