package com.dem.webcalcui.operations;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/calc")
public class CalculatorOperations {

	@GET
	@Path("/add/{a}/{b}/{c}")
	@Produces(MediaType.TEXT_PLAIN)
	public String add(@PathParam("a") String a, @PathParam("b") String b, @PathParam("c") String sexo) {
		Double imcD =  Double.parseDouble(a) / (Double.parseDouble(b) * Double.parseDouble(b));
		
		String imc = String.format("%.2f", imcD);
		
		if (sexo == "f") {
			if (imcD < 20.7) {
				return "<div class='card-panel red white-text'>IMC: " + imc
						+ " <br><b>Cuidado!</b> Você está abaixo do peso.</div>";
			} else if (imcD < 26.4) {
				return "<div class='card-panel green white-text'>IMC: " + imc
						+ " <br><b>Otimo!</b> Você está no peso normal.</div>";
			} else if (imcD < 27.8) {
				return "<div class='card-panel yellow darken-2 white-text'>IMC: " + imc
						+ " <br><b>Atenção!</b> Você marginalmente acima do peso.</div>";
			} else if (imcD < 31.1) {
				return "<div class='card-panel orange white-text'>IMC: " + imc
						+ " <br><b>Cuidado!</b> Você acima do peso ideal.</div>";
			} else {
				return "<div class='card-panel red white-text'>IMC: " + imc
						+ " <br><b>Cuidado!</b> Você na faixa de obesidade.</div>";
			}
		} else {
			if (imcD < 19.1) {
				return "<div class='card-panel red white-text'>IMC: " + imc
						+ " <br><b>Cuidado!</b> Você está abaixo do peso.</div>";
			} else if (imcD < 25.8) {
				return "<div class='card-panel green white-text'>IMC: " + imc
						+ " <br><b>Otimo!</b> Você está no peso normal.</div>";
			} else if (imcD < 27.3) {
				return "<div class='card-panel yellow darken-2 white-text'>IMC: " + imc
						+ " <br><b>Atenção!</b> Você marginalmente acima do peso.</div>";
			} else if (imcD < 32.3) {
				return "<div class='card-panel orange white-text'>IMC: " + imc
						+ " <br><b>Cuidado!</b> Você acima do peso ideal.</div>";
			} else {
				return "<div class='card-panel red white-text'>IMC: " + imc
						+ " <br><b>Cuidado!</b> Você na faixa de obesidade.</div>";
			}
		}

	
		
		
		
		
		
		

		
	}


}
