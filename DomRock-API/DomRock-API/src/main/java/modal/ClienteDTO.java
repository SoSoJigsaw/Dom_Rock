package modal;

import java.sql.Date;

import javafx.collections.ObservableList;

public class ClienteDTO {
	
	private Integer id_cliente;
	private String razao_social;
	private String cnpj;
	private String segmento;
	private String datahora_cadastro;
	
	
	
	public Integer getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getRazao_social() {
		return razao_social;
	}

	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getSegmento() {
		return segmento;
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

	public String getDatahora_cadastro() {
		return datahora_cadastro;
	}

	public void setDatahora_cadastro(String datahora_cadastro) {
		this.datahora_cadastro = datahora_cadastro;
	}

	public static void setItems1(ObservableList<ClienteDTO> observableArrayList) {
		// TODO Auto-generated method stub
		
	}

	public static void setItems(ObservableList<ClienteDTO> observableArrayList) {
		// TODO Auto-generated method stub
		
	}




	

	

}
