package it.polito.tdp.Lab01;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.Lab01.model.Parole;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnInserisci;

    @FXML
    private Button btnReset;
    
    @FXML
    private Button btnCancella;
    
    @FXML
    private Label tmpEsecuzione;
    
    @FXML
    private TextField txtParola;

    @FXML
    private TextArea txtResult;

    @FXML
    void doInsert(ActionEvent event) {
    	this.elenco.addParola(txtParola.getText());
    	txtParola.clear();
    	txtResult.clear();
    	for (String s : this.elenco.getElenco()) {
    		txtResult.appendText(s + "\n");
    	};
    	tmpEsecuzione.setText("  " + Long.toString(System.nanoTime()));
    }

    @FXML
    void doReset(ActionEvent event) {
    	this.elenco.getElenco().clear();
    	txtResult.clear();
    	tmpEsecuzione.setText("  " + Long.toString(System.nanoTime()));
    }
    

    @FXML
    void doCancella(ActionEvent event) {
    	this.elenco.removeParola(txtResult.getSelectedText());
    	txtResult.clear();
    	for (String s : this.elenco.getElenco()) {
    		txtResult.appendText(s + "\n");
    	};
    	tmpEsecuzione.setText("  " + Long.toString(System.nanoTime()));
    }

    @FXML
    void initialize() {
    	assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Scene.fxml'.";
    	assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert tmpEsecuzione != null : "fx:id=\"tmpEsecuzione\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        elenco = new Parole() ;
    }

}
