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
    int ans = 0;
    String finalAnswer;
    String buttonLabel = "Use Recursion";
    String buttonLabel2 = "Hide Binary";
    IterativeMath im = new IterativeMath();
    RecursiveMath rm = new RecursiveMath();
    @FXML public TextField display;
    @FXML public Label answer;
    @FXML public Button button;    
    @FXML public Button useThing;    
    @FXML public Button binary;    
    @FXML public Label bl1;
    @FXML public Label bl2;
    @FXML public Label bl3;
    @FXML public Label bl4;
    @FXML public Label bl5;
    @FXML public Label bl6;
    @FXML public Label bl7;
    @FXML public Label bl8;
    @FXML public Label bl9;
    @FXML public Label bl10;
    @FXML public Label bl11;
    @FXML public Label bl12;
    @FXML public Label bl13;
    @FXML public Label bl14;
    @FXML public Label bl15;
    @FXML public Label bl16;
    @FXML public Label bl17;
    @FXML public Label bl18;
    @FXML public Label bl19;
    @FXML public Label bl20;
    @FXML public Label bl21;
    @FXML public Label bl22;
    @FXML public Label bl23;
    @FXML public Label bl24;
    @FXML public Label bl25;
    @FXML public Label bl26;
    @FXML public Label bl27;
    @FXML public Label bl28;
    @FXML public Label bl29;
    @FXML public Label bl30;
    @FXML public Label bl31;
    public static String copyInput = " ";

    public static String input = "";
   
    @FXML public void label1(){
	if(bl1.getText().equals("0")){
	    bl1.setText("1");
	    int temp = ans + im.pow(2,0);
	    ans = temp;
	    System.out.println(ans);
	}
	else{
	    bl1.setText("0");
	    int temp = ans - im.pow(2,0);
	    ans = temp;
	}
	answer.setText(Integer.toString(ans));
    }
    @FXML public void label2(){
	if(bl2.getText().equals("0")){
	    bl2.setText("1");
	    int temp = ans + im.pow(2,1);
	    ans = temp;
	    System.out.println(ans);
	}
	else{
	    bl2.setText("0");
	    int temp = ans - im.pow(2,1);
	    ans = temp;
	}
	answer.setText(Integer.toString(ans));
    }
    @FXML public void label3(){
	if(bl3.getText().equals("0")){
	    bl3.setText("1");
	    int temp = ans + im.pow(2,2);
	    ans = temp;
	    System.out.println(ans);
	}
	else{
	    bl3.setText("0");
	    int temp = ans - im.pow(2,2);
	    ans = temp;
	}
	answer.setText(Integer.toString(ans));
    }
    @FXML public void label4(){
	if(bl4.getText().equals("0")){
	    bl4.setText("1");
	    int temp = ans + im.pow(2,3);
	    ans = temp;
	    System.out.println(ans);
	}
	else{
	    bl4.setText("0");
	    int temp = ans - im.pow(2,3);
	    ans = temp;
	}
	answer.setText(Integer.toString(ans));
    }
    @FXML public void label5(){
	if(bl5.getText().equals("0")){
	    bl5.setText("1");
	    int temp = ans + im.pow(2,4);
	    ans = temp;
	    System.out.println(ans);
	}
	else{
	    bl5.setText("0");
	    int temp = ans - im.pow(2,4);
	    ans = temp;
	}
	answer.setText(Integer.toString(ans));
    }
    @FXML public void label6(){
	if(bl6.getText().equals("0")){
	    bl6.setText("1");
	    int temp = ans + im.pow(2,5);
	    ans = temp;
	    System.out.println(ans);
	}
	else{
	    bl6.setText("0");
	    int temp = ans - im.pow(2,5);
	    ans = temp;
	}
	answer.setText(Integer.toString(ans));
    }
    @FXML public void label7(){
	if(bl7.getText().equals("0")){
	    bl7.setText("1");
	    int temp = ans + im.pow(2,6);
	    ans = temp;
	    System.out.println(ans);
	}
	else{
	    bl7.setText("0");
	    int temp = ans - im.pow(2,6);
	    ans = temp;
	}
	answer.setText(Integer.toString(ans));
    }
    @FXML public void label8(){
	if(bl8.getText().equals("0")){
	    bl8.setText("1");
	    int temp = ans + im.pow(2,7);
	    ans = temp;
	    System.out.println(ans);
	}
	else{
	    bl8.setText("0");
	    int temp = ans - im.pow(2,7);
	    ans = temp;
	}
	answer.setText(Integer.toString(ans));
    }
    @FXML public void label9(){
	if(bl9.getText().equals("0")){
	    bl9.setText("1");
	    int temp = ans + im.pow(2,8);
	    ans = temp;
	    System.out.println(ans);
	}
	else{
	    bl9.setText("0");
	    int temp = ans - im.pow(2,8);
	    ans = temp;
	}
	answer.setText(Integer.toString(ans));
    }
    @FXML public void label10(){
	if(bl10.getText().equals("0")){
	    bl10.setText("1");
	    int temp = ans + im.pow(2,9);
	    ans = temp;
	    System.out.println(ans);
	}
	else{
	    bl10.setText("0");
	    int temp = ans - im.pow(2,9);
	    ans = temp;
	}
	answer.setText(Integer.toString(ans));
    }
    @FXML public void label11(){
	if(bl11.getText().equals("0")){
	    bl11.setText("1");
	    int temp = ans + im.pow(2,10);
	    ans = temp;
	    System.out.println(ans);
	}
	else{
	    bl11.setText("0");
	    int temp = ans - im.pow(2,10);
	    ans = temp;
	}
	answer.setText(Integer.toString(ans));
    }
    @FXML public void label12(){
	if(bl12.getText().equals("0")){
	    bl12.setText("1");
	    int temp = ans + im.pow(2,11);
	    ans = temp;
	    System.out.println(ans);
	}
	else{
	    bl12.setText("0");
	    int temp = ans - im.pow(2,11);
	    ans = temp;
	}
	answer.setText(Integer.toString(ans));
    }
    @FXML public void label13(){
	if(bl13.getText().equals("0")){
	    bl13.setText("1");
	    int temp = ans + im.pow(2,12);
	    ans = temp;
	    System.out.println(ans);
	}
	else{
	    bl13.setText("0");
	    int temp = ans - im.pow(2,12);
	    ans = temp;
	}
	answer.setText(Integer.toString(ans));
    }
    @FXML public void label14(){
	if(bl14.getText().equals("0")){
	    bl14.setText("1");
	    int temp = ans + im.pow(2,13);
	    ans = temp;
	    System.out.println(ans);
	}
	else{
	    bl14.setText("0");
	    int temp = ans - im.pow(2,13);
	    ans = temp;
	}
	answer.setText(Integer.toString(ans));
    }
    @FXML public void label15(){
	if(bl15.getText().equals("0")){
	    bl15.setText("1");
	    int temp = ans + im.pow(2,14);
	    ans = temp;
	    System.out.println(ans);
	}
	else{
	    bl15.setText("0");
	    int temp = ans - im.pow(2,14);
	    ans = temp;
	}
	answer.setText(Integer.toString(ans));
    }
    @FXML public void label16(){
	if(bl16.getText().equals("0")){
	    bl16.setText("1");
	    int temp = ans + im.pow(2,15);
	    ans = temp;
	    System.out.println(ans);
	}
	else{
	    bl16.setText("0");
	    int temp = ans - im.pow(2,15);
	    ans = temp;
	}
	answer.setText(Integer.toString(ans));
    }
    @FXML public void label17(){
	if(bl17.getText().equals("0")){
	    bl17.setText("1");
	    int temp = ans + im.pow(2,16);
	    ans = temp;
	    System.out.println(ans);
	}
	else{
	    bl17.setText("0");
	    int temp = ans - im.pow(2,16);
	    ans = temp;
	}
	answer.setText(Integer.toString(ans));
    }
    @FXML public void label18(){
	if(bl18.getText().equals("0")){
	    bl18.setText("1");
	    int temp = ans + im.pow(2,17);
	    ans = temp;
	    System.out.println(ans);
	}
	else{
	    bl18.setText("0");
	    int temp = ans - im.pow(2,17);
	    ans = temp;
	}
	answer.setText(Integer.toString(ans));
    }
    @FXML public void label19(){
	if(bl19.getText().equals("0")){
	    bl19.setText("1");
	    int temp = ans + im.pow(2,18);
	    ans = temp;
	    System.out.println(ans);
	}
	else{
	    bl19.setText("0");
	    int temp = ans - im.pow(2,18);
	    ans = temp;
	}
	answer.setText(Integer.toString(ans));
    }
    @FXML public void label20(){
	if(bl20.getText().equals("0")){
	    bl20.setText("1");
	    int temp = ans + im.pow(2,19);
	    ans = temp;
	    System.out.println(ans);
	}
	else{
	    bl20.setText("0");
	    int temp = ans - im.pow(2,19);
	    ans = temp;
	}
	answer.setText(Integer.toString(ans));
    }
    @FXML public void label21(){
	if(bl21.getText().equals("0")){
	    bl21.setText("1");
	    int temp = ans + im.pow(2,20);
	    ans = temp;
	    System.out.println(ans);
	}
	else{
	    bl21.setText("0");
	    int temp = ans - im.pow(2,20);
	    ans = temp;
	}
	answer.setText(Integer.toString(ans));
    }
    @FXML public void label22(){
	if(bl22.getText().equals("0")){
	    bl22.setText("1");
	    int temp = ans + im.pow(2,21);
	    ans = temp;
	    System.out.println(ans);
	}
	else{
	    bl22.setText("0");
	    int temp = ans - im.pow(2,21);
	    ans = temp;
	}
	answer.setText(Integer.toString(ans));
    }
    @FXML public void label23(){
	if(bl23.getText().equals("0")){
	    bl23.setText("1");
	    int temp = ans + im.pow(2,22);
	    ans = temp;
	    System.out.println(ans);
	}
	else{
	    bl23.setText("0");
	    int temp = ans - im.pow(2,22);
	    ans = temp;
	}
	answer.setText(Integer.toString(ans));
    }
    @FXML public void label24(){
	if(bl24.getText().equals("0")){
	    bl24.setText("1");
	    int temp = ans + im.pow(2,23);
	    ans = temp;
	    System.out.println(ans);
	}
	else{
	    bl24.setText("0");
	    int temp = ans - im.pow(2,23);
	    ans = temp;
	}
	answer.setText(Integer.toString(ans));
    }
    @FXML public void label25(){
	if(bl25.getText().equals("0")){
	    bl25.setText("1");
	    int temp = ans + im.pow(2,24);
	    ans = temp;
	    System.out.println(ans);
	}
	else{
	    bl25.setText("0");
	    int temp = ans - im.pow(2,24);
	    ans = temp;
	}
	answer.setText(Integer.toString(ans));
    }
    @FXML public void label26(){
	if(bl26.getText().equals("0")){
	    bl26.setText("1");
	    int temp = ans + im.pow(2,25);
	    ans = temp;
	    System.out.println(ans);
	}
	else{
	    bl26.setText("0");
	    int temp = ans - im.pow(2,25);
	    ans = temp;
	}
	answer.setText(Integer.toString(ans));
    }
    @FXML public void label27(){
	if(bl27.getText().equals("0")){
	    bl27.setText("1");
	    int temp = ans + im.pow(2,26);
	    ans = temp;
	    System.out.println(ans);
	}
	else{
	    bl27.setText("0");
	    int temp = ans - im.pow(2,26);
	    ans = temp;
	}
	answer.setText(Integer.toString(ans));
    }
    @FXML public void label28(){
	if(bl28.getText().equals("0")){
	    bl28.setText("1");
	    int temp = ans + im.pow(2,27);
	    ans = temp;
	    System.out.println(ans);
	}
	else{
	    bl28.setText("0");
	    int temp = ans - im.pow(2,27);
	    ans = temp;
	}
	answer.setText(Integer.toString(ans));
    }
    @FXML public void label29(){
	if(bl29.getText().equals("0")){
	    bl29.setText("1");
	    int temp = ans + im.pow(2,28);
	    ans = temp;
	    System.out.println(ans);
	}
	else{
	    bl29.setText("0");
	    int temp = ans - im.pow(2,28);
	    ans = temp;
	}
	answer.setText(Integer.toString(ans));
    }
    @FXML public void label30(){
	if(bl30.getText().equals("0")){
	    bl30.setText("1");
	    int temp = ans + im.pow(2,29);
	    ans = temp;
	    System.out.println(ans);
	}
	else{
	    bl30.setText("0");
	    int temp = ans - im.pow(2,29);
	    ans = temp;
	}
	answer.setText(Integer.toString(ans));
    }
    @FXML public void label31(){
	if(bl31.getText().equals("0")){
	    bl31.setText("1");
	    int temp = ans + im.pow(2,30);
	    ans = temp;
	    System.out.println(ans);
	}
	else{
	    bl31.setText("0");
	    int temp = ans - im.pow(2,30);
	    ans = temp;
	}
	answer.setText(Integer.toString(ans));
    }
    public void toBi(){
	Label bl[] = {bl1,bl2,bl3,bl4,bl5,bl6,bl7,bl8,bl9,bl10,bl11,bl12,bl13,bl14,bl15,bl16,bl17,bl18,bl19,bl20,bl21,bl22,bl23,bl24,bl25,bl26,bl27,bl28,bl29,bl30,bl31};
     
	System.out.println(Integer.toBinaryString(ans));
	String some = Integer.toBinaryString(ans);
	String reverse = "";
	for (int i = some.length()-1; i >= 0; i--){
	    reverse += some.charAt(i);
	}
	for (int i = 0; i < some.length(); i++){
	    if(reverse.charAt(i) == '1'){
	    bl[i].setText("1");
	    }
	    if(reverse.charAt(i) == '0'){
		bl[i].setText("0");
	    }
	}
    }
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
	text += " !";
	display.setText(text);
	}
    @FXML public void handleButtonExponential(ActionEvent event){
	text += " ^ ";
	display.setText(text);
	}
    @FXML public void handleButtonLeftShift(ActionEvent event){
	text += " << ";
	display.setText(text);
	}
    @FXML public void handleButtonRightShift(ActionEvent event){
	text += " >> ";
	display.setText(text);

	}
    @FXML public void handleButtonBackspace(ActionEvent event){
	text = text.substring(0,text.length()-1);
	display.setText(text);

	}
    @FXML public void handleButtonClear(ActionEvent event){
	text = "";
	display.setText(text);

	}
    @FXML public void handleButtonUse(ActionEvent event){
	if(buttonLabel == "Use Recursion")buttonLabel = "Use Iteration";
	else buttonLabel = "Use Recursion";
	useThing.setText(buttonLabel);
	
	}
    @FXML public void handleButtonBinary(ActionEvent event){
	if(buttonLabel2 == "Hide Binary")buttonLabel2 = "Show Binary";
	else buttonLabel2 = "Hide Binary";
	binary.setText(buttonLabel2);
	
	}
    @FXML public void handleButtonEquals(ActionEvent event){
	text += " ";
	display.setText(text);
	input = display.getText();
	text = "";
	//display.setText(text);
	System.out.println(input);
	//checkErrors(input);
	doMath(input);
	answer.setText(finalAnswer);
	toBi();
    }
    public void checkErrors(String input){
	/*
	int numChars = input.length();
	if(input.charAt(0) == [0-9]){
	    System.out.println("Not a number first!");
	}
	
	for(int i = 0; i < numChars; i++){
	    if(input.charAt(i) == 0){
		
	    }    
	}
	*/
    }
    public void doMath(String input){
	
	// string containing a mathematical expression represented in infix notation
	String expression = display.getText();

	// convert the expression into an array by splitting it by white space
	String infix[] = expression.split(" ");

	// use the ReversePolishNotation class to get an array containing the expression
	// in post-fix notation
	String postfix[] = ReversePolishNotation.infixToPostfix(infix);

	// create an instance of your BasicMath class
	Math iterativeMath = new IterativeMath();
	Math recursiveMath = new RecursiveMath();
	// use the ReversePolishNotation class to evaluate the expression
	int result = 0;
	if(buttonLabel == "Use Recursion"){
	     result = ReversePolishNotation.evaluate(iterativeMath, postfix);
	}
	else{
	    result = ReversePolishNotation.evaluate(recursiveMath, postfix);
	}
	ans = result;
	finalAnswer = Integer.toString(result);
	/*
	try{
	    Scanner textScanner = new Scanner(input);
	    int part2 = 0;
	    boolean isRecursion = useThing.getText().equals("Use Recursion");
	   
	 
	    int part1 = textScanner.nextInt();
        
	    String temp2  =  textScanner.next();
	
	
	 if(temp2.equals("!") && !isRecursion){
	     ans =  im.fac(part1);
	     
	    }
      
         else if(temp2.equals("!") && isRecursion){
		ans =  rm.fac(part1);
		
	    }
	 else{
	     part2 = textScanner.nextInt();
	 }
	
	//ans =  part1 + part2);
	int l = part1;
	int r = part2;
	
	if(!isRecursion){
	   
	    if(temp2.equals("+")){
	  
		ans =  im.add(l,r);
	    }
	    if(temp2.equals("-")){
		ans =  im.sub(l,r);
	    }
	    if(temp2.equals("*")){
		ans =  im.mul(l,r);
	    }
	    if(temp2.equals("/")){
		ans =  im.div(l,r);
	    }
	   
	    if(temp2.equals("^")){
		ans =  im.pow(l,r);
	    }
	    if(temp2.equals("«")){
		
	    }
	    if(temp2.equals("»")){
		
		
	    }
	}//Iteration
	if(isRecursion){
	    
	    if(temp2.equals("+")){
	      
		ans =  rm.add(l,r);
	    }
	    if(temp2.equals("-")){
		ans =  rm.sub(l,r);
	    }
	    if(temp2.equals("*")){
		ans =  rm.mul(l,r);
	    }
	    if(temp2.equals("/")){
		ans =  rm.div(l,r);
	    }
	   
	    if(temp2.equals("^")){
		ans =  rm.pow(l,r);
	    }
		if(temp2.equals("«")){
		    
	    }
		if(temp2.equals("»")){
		
	    }
	}//Recursion    
	    
           
	finalAnswer = Integer.toString(ans);
       	
	}catch(Exception e){
	  System.out.println("Dafuq");
	}
	
	*/

    }//doMath
    
}//Controller
    
