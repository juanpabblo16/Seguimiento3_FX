package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import model.Operation;
	
	public class SampleController {
		
	
		
	    @FXML
	    
	    TextField textField;
	    
	    @FXML 
	    
	    TextField result;
	    
	    @FXML
	    
	    Button Button0;
	    
	    @FXML
	    
	    Button Button1;
	    
	    @FXML
	    
	    Button Button2;
	    
	    @FXML
	    
	    Button Button3;
	    
	    @FXML
	    
	    Button Button4;
	    
	    @FXML
	    
	    Button Button5;
	    
	    @FXML
	    
	    Button Button6;
	    
	    @FXML
	    
	    Button Button7;
	    
	    @FXML
	    
	    Button Button8;
	    
	    @FXML
	    
	    Button Button9;
	    
	    @FXML 
	    
	    Button Operation1;
	    
	    @FXML 
	    
	    Button Operation2;
	    
		 @FXML
	
	    Button Operation3;
		 
		 @FXML
		 
		Button Calculate;
	
	    @FXML
	    
	    Button Result;
	    
	    
	    // Normal atributes
	    
	    String ClearChain;
	    
	    String History;
			

	    /*
	     @FXML
	     
	     ListView<String> listview;

	     */	    
		    //java fx methods
	    
	    	
    	
	    
		    @FXML
			public void doSomething() {
				
		    	textField.setPromptText(ClearChain);
				
			}
		    
		    @FXML
		    public void initialize () {
		    	
		    	new Operation();
		    	
		    	new Operation();
		    	
		    	
		    	Button0.setOnAction((ActionEvent e) -> {
		    		System.out.println(0);
		    		
		    		textField.setText(ClearChain = "0");
		    		
		    	});
		    	
		    	Button1.setOnAction((ActionEvent e) -> {
		    		System.out.println(1);
		    		
		    		textField.setText(ClearChain = "1");
		    		
		    	});
		    	
		    	Button2.setOnAction((ActionEvent e) -> {
		    		System.out.println(2);
		    		
		    		textField.setText(ClearChain = "2");
		    	});
		    	
		    	Button3.setOnAction((ActionEvent e) -> {
		    		System.out.println(3);
		    		
		    		textField.setText(ClearChain = "3");
		    	});
	
		    	Button4.setOnAction((ActionEvent e) -> {
		    		System.out.println(4);
		    		
		    		textField.setText(ClearChain = "4");
		    	});
		    	
		    	Button5.setOnAction((ActionEvent e) -> {
		    		System.out.println(5);
		    		
		    		textField.setText(ClearChain = "5");
		    	});
		    	
		    	Button6.setOnAction((ActionEvent e) -> {
		    		System.out.println(6);
		    		
		    		textField.setText(ClearChain = "6");
		    	});
		    	
		    	Button7.setOnAction((ActionEvent e) -> {
		    		System.out.println(7);
		    		
		    		textField.setText(ClearChain = "7");
		    	});
		    	
		    	Button8.setOnAction((ActionEvent e) -> {
		    		System.out.println(8);
		    		
		    		textField.setText(ClearChain = "8");
		    	});
		    	
		    	Button9.setOnAction((ActionEvent e) -> {
		    		System.out.println(9);
		    		
		    		textField.setText(ClearChain = "9");
		    	});
		    	
		    	Operation1.setOnAction((ActionEvent e) -> {
		    		System.out.println("*");
		    		
		    		textField.setText(ClearChain = "*");
		    	});
		    	
		    	Operation2.setOnAction((ActionEvent e) -> {
		    		System.out.println("+");
		    		
		    		textField.setText(ClearChain = "+");
		    	});
		    	
		    	Operation3.setOnAction((ActionEvent e) -> {
		    		System.out.println("-");
		    		
		    		textField.setText(ClearChain = "-");
		    	});
		    	
		    	Calculate.setOnAction((ActionEvent e) -> {
		    		
		    		
		    	});
		    	
		    	Result.setOnAction((ActionEvent e) -> {
		    		
		    	});
		    	
		    }
		    
		}
