package com.example.view;


import java.time.format.DateTimeFormatter;
import java.util.Date;

import DTO.ClienteDTO;
import DTO.EntregavelDTO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class HelloController {

    @FXML
    private Tab geral;
    
    @FXML
    private MenuItem oi;

    @FXML
    private MenuItem sim;

    @FXML
    private SplitMenuButton splitSegmento;

    @FXML
    private TextField txtCnpj;

    @FXML
    private TextField txtNome;

    @FXML
    private TextArea txtObjNegocio;

    @FXML
    private TextArea txteMinimos;

    @FXML
    private TextArea txtePossiveis;

    @FXML
    private void btnCadastrar(ActionEvent event) {

        if (txtNome.getText().length()==0) {
            Alerts.display("ERRO", "Por favor, insira uma Razão Social");
        }

        if (txtCnpj.getText().length()!=14 && txtNome.getText().length()!=0) {
            Alerts.display("ERRO", "Por favor, insira um CNPJ válido");
        }

        if (txtNome.getText().length()!=0 && txtCnpj.getText().length()==14) {

            String nomeCliente = this.txtNome.getText();
            String cnpjCliente = this.txtCnpj.getText();
            String objCliente = this.txtObjNegocio.getText();
            String eMinimos = this.txteMinimos.getText();
            String ePossiveis = this.txtePossiveis.getText();

            System.out.println("Razao social: "+nomeCliente+ "\nCNPJ: "+cnpjCliente+"\nObjetivo do Negocio: "+objCliente+"\nEntregaveis Minimos: "+eMinimos+"\nEntregaveis Possiveis: "+ePossiveis+"\n\n");


            // Metodos acessores do clienteDTO
            ClienteDTO objclienteDTO = new ClienteDTO();
            objclienteDTO.setCnpj(cnpjCliente);
            objclienteDTO.setNomeCliente(nomeCliente);
            objclienteDTO.setEntregaMin(eMinimos);
            objclienteDTO.setEntregaPossivel(ePossiveis);
            objclienteDTO.setObjetivoNegocio(objCliente);


            // Metodos acessores do entregavelDTO
            EntregavelDTO objentregavelDTO = new EntregavelDTO();
            objentregavelDTO.setEntregaMin(eMinimos);
            objentregavelDTO.setEntregaPossivel(ePossiveis);
            objentregavelDTO.setObjetivoNegocio(objCliente);

            Alerts.display("SUCESSO", "Cliente cadastrado com sucesso");
        }

    }

    @FXML
    void btnSegmento(ActionEvent event) {

	splitSegmento = new SplitMenuButton();
	
	 oi = new MenuItem();
	 sim = new MenuItem();
	
	splitSegmento.getItems().addAll(oi, sim);    
	
	oi.setOnAction((e)->{
		System.out.println("deu certo");
	});

    }

    @FXML
    void btnLimpar(ActionEvent event) {

        txtNome.setText(null);
        txtCnpj.setText(null);
        txtObjNegocio.setText(null);
        txteMinimos.setText(null);
        txtePossiveis.setText(null);

    }

    @FXML
    void btnBuscar(ActionEvent event) {



    }

}