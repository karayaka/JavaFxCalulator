package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainControl {
	@FXML
	private Label sonuc;
	private long nuber1=0;
	private String operator="";
	private boolean start=true;
	private Model model=new Model();	
	

	public MainControl() {		
		
		
	}
	public void processNumbers(ActionEvent evet) {
		if(start) {
			sonuc.setText("");
			start=false;
			
		}
		String deger=((Button)evet.getSource()).getText(); 
		sonuc.setText(sonuc.getText()+deger);
		
		
	}
	
	public void processOperators(ActionEvent evet) {
		String value=((Button)evet.getSource()).getText();
		if(!value.equals("=")) {
			if(!operator.isEmpty()) {
				return;
			}
			operator=value;
			nuber1=Long.parseLong(sonuc.getText());
			sonuc.setText("");
			
		}else {
			if(operator.isEmpty()) {
				return;
			}
			long number2=Long.parseLong(sonuc.getText());
			float output= model.calculate(nuber1, number2, operator);
			sonuc.setText(String.valueOf(output));
		}
		
		
		
	}

}
