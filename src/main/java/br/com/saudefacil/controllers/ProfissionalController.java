package br.com.saudefacil.controllers;

import java.util.List;

import br.com.saudefacil.dao.ProfissionalDAO;
import br.com.saudefacil.exception.ProfissionalException;
import br.com.saudefacil.models.Profissional;

public class ProfissionalController {
	private ProfissionalDAO profissionaldao = new ProfissionalDAO();
	private static final int PROFISSIONAL_DESATIVADO = 0;
	
	public void create(Profissional profissional) {
		validaProfissional(profissional);
		profissionaldao.create(profissional);
	}
	
	public List<Profissional> getProfissionais(){
		return profissionaldao.getProfissionais();
	}
	
	public Profissional getProfissional(String cpf) {
		return profissionaldao.getProfissional(cpf);
	}
	
	public void update(Profissional profissional) {
		validaProfissional(profissional);
		profissionaldao.update(profissional);
	}
	public void delete(Profissional profissional) {
		profissionaldao.delete(profissional);
	}
	
	public void validaProfissional(Profissional profissional) {
		if(profissional.getAtendeClinica() != 1 && profissional.getAtendeClinica() != 0) {
			throw new ProfissionalException("Digite 1 para SIM ou 0 para NÃO");
		}
		
		if(profissional.getStatusAutonomo() != 1 && profissional.getStatusAutonomo() != 0) {
			throw new ProfissionalException("Digite 1 para SIM ou 0 para NÃO");
		}
	}
	
	public void desativarProfissional(Profissional profissional) {
		if(profissional == null) {
			throw new ProfissionalException("Profissional inexistente");
		}
		if(profissional.getStatusProfissional() == 0) {
			throw new ProfissionalException("Profissional já encontra-se desativado");
		}
		 profissional.setStatusProfissional(PROFISSIONAL_DESATIVADO);
		 profissionaldao.update(profissional);
	}
}