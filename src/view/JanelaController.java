package view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import view.util.Restricoes;

public class JanelaController implements Initializable{
	
	
	@FXML
	private Button btN1;
	
	@FXML
	private Button btN2;
	
	@FXML
	private Button btN3;
	
	@FXML
	private Button btN4;
	
	@FXML
	private Button btN5;
	
	@FXML
	private Button btN6;

	@FXML
	private Button btN7;
	
	@FXML
	private Button btN8;
	
	@FXML
	private Button btN9;
	
	@FXML
	private Button btN0;
	
	@FXML
	private Button btSoma;
	
	@FXML
	private Button btSubtrair;
	
	@FXML
	private Button btMulti;
	
	@FXML
	private Button btDiv;
	
	@FXML
	private Button btIgual;
	
	@FXML
	private Button btLimpa;
	
	@FXML
	private TextField txtVisor;
	
	@FXML 
	private Label txtDetalhe;
	
	Double n1=0.0 , n2=0.0;
	String o = "";
	
	
	@FXML
	public void onClick01(){
		String valor = txtVisor.getText();
		txtVisor.setText(valor + btN1.getText());
		
	}
	
	@FXML
	public void onClick02(){
		String valor = txtVisor.getText();
		txtVisor.setText(valor + btN2.getText());	
	}
	
	@FXML
	public void onClick03(){
		String valor = txtVisor.getText();
		txtVisor.setText(valor + btN3.getText());	
	}
	
	@FXML
	public void onClick04(){
		String valor = txtVisor.getText();
		txtVisor.setText(valor + btN4.getText());	
	}
	
	@FXML
	public void onClick05(){
		String valor = txtVisor.getText();
		txtVisor.setText(valor + btN5.getText());	
	}
	
	@FXML
	public void onClick06(){
		String valor = txtVisor.getText();
		txtVisor.setText(valor + btN6.getText());	
	}
	
	@FXML
	public void onClick07(){
		String valor = txtVisor.getText();
		txtVisor.setText(valor + btN7.getText());	
	}
	
	@FXML
	public void onClick08(){
		String valor = txtVisor.getText();
		txtVisor.setText(valor + btN8.getText());	
	}
	
	@FXML
	public void onClick09(){
		String valor = txtVisor.getText();
		txtVisor.setText(valor + btN9.getText());	
	}
	
	@FXML
	public void onClick0(){
		String valor = txtVisor.getText();
		txtVisor.setText(valor + btN0.getText());	
	}
	
	@FXML
	public void onClickSoma() {
		n1 = Double.parseDouble(txtVisor.getText());
		txtDetalhe.setText(txtVisor.getText() + " + ");
		txtVisor.clear();
		o="s";
		
	}
	
	@FXML
	public void onClickSub() {
		n1 = Double.parseDouble(txtVisor.getText());
		txtDetalhe.setText(txtVisor.getText() + " - ");
		txtVisor.clear();
		o = "sub";
	}
	
	@FXML
	public void onClickMulti() {
		n1 = Double.parseDouble(txtVisor.getText());
		txtDetalhe.setText(txtVisor.getText() + " * ");
		txtVisor.clear();
		o = "m";
	}
	
	@FXML
	public void onClickDiv() {
		n1 = Double.parseDouble(txtVisor.getText());
		txtDetalhe.setText(txtVisor.getText() + " / ");
		txtVisor.clear();
		o = "d";
	}
	
	public void onClickIgual() {
		n2 = Double.parseDouble(txtVisor.getText());
		Double result = 0.0;
		
		if(o == "s") {
			txtDetalhe.setText(txtDetalhe.getText() + txtVisor.getText() + " = ");
			result = n1 + n2;
			Integer i = result.intValue();
			txtVisor.setText(i.toString());
		}
		if(o == "sub") {
			txtDetalhe.setText(txtDetalhe.getText() + txtVisor.getText() + " = ");
			result = n1 - n2;
			Integer i = result.intValue();
			txtVisor.setText(i.toString());
		}
		if(o == "m") {
			txtDetalhe.setText(txtDetalhe.getText() + txtVisor.getText() + " = ");
			result = n1 * n2;
			txtVisor.setText(result.toString());
		}
		if(o == "d") {
			txtDetalhe.setText(txtDetalhe.getText() + txtVisor.getText() + " = ");
			result = n1 / n2;
			txtVisor.setText(result.toString());
		}
		
	}
	
	public void onClickLimpa() {
		
		txtVisor.clear();
		n1 = 0.0;
		n2 = 0.0;
		txtDetalhe.setText("");
		
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		Restricoes.setTextFieldDouble(txtVisor);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
