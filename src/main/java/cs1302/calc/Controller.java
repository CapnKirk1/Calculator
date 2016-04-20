package cs1302.calc;

import java.math.BigDecimal;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.TextInputControl;
import java.util.Scanner;

public class Controller{
    String text = "";
    @FXML public TextField display;
    @FXML public Label answer;
    @FXML public Button button;    
   
    @FXML public void handleButton0(ActionEvent event){
	text += "0";
	display.setText(text);
	}
    @FXML public void handleButton1(ActionEvent event){
	text += "1";
	display.setText(text);
	}
    @FXML public void handleButton2(ActionEvent event){
	text += "2";
	display.setText(text);
	}
    @FXML public void handleButton3(ActionEvent event){
	text += "3";
	display.setText(text);
	}
    @FXML public void handleButton4(ActionEvent event){
	text += "4";
	display.setText(text);
	}
    @FXML public void handleButton5(ActionEvent event){
	text += "5";
	display.setText(text);
	}
    @FXML public void handleButton6(ActionEvent event){
	text += "6";
	display.setText(text);
	}
    @FXML public void handleButton7(ActionEvent event){
	text += "7";
	display.setText(text);
	}
    @FXML public void handleButton8(ActionEvent event){
	text += "8";
	display.setText(text);
	}
    @FXML public void handleButton9(ActionEvent event){
	text += "9";
	display.setText(text);
	}
    @FXML public void handleButtonDivide(ActionEvent event){
	text += " / ";
	display.setText(text);
	}
    @FXML public void handleButtonMultiply(ActionEvent event){
	text += " * ";
	display.setText(text);
	}
    @FXML public void handleButtonSubtract(ActionEvent event){
	text += " - ";
	display.setText(text);
	}
    @FXML public void handleButtonAdd(ActionEvent event){
	text += " + ";
	display.setText(text);
	}
    @FXML public void handleButtonFactorial(ActionEvent event){
	text += " ! ";
	display.setText(text);
	}
    @FXML public void handleButtonExponential(ActionEvent event){
	text += " ^ ";
	display.setText(text);
	}
    @FXML public void handleButtonLeftShift(ActionEvent event){
	text += " « ";
	display.setText(text);
	}
    @FXML public void handleButtonRightShift(ActionEvent event){
	text += " » ";
	display.setText(text);

	}
    @FXML public void handleButtonEquals(ActionEvent event){
	String input;
	text = "";
	input = display.getText();
	display.setText("");
	System.out.println(input);
	answer.setText("42");
    }
}