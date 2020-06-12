package br.com.saudefacil.controllers;

import java.util.List;

import br.com.saudefacil.dao.ProfissionalDAO;
import br.com.saudefacil.models.Profissional;

public class ProfissionalController {
	private ProfissionalDAO profissionaldao = new ProfissionalDAO();
	
	public void create(Profissional profissional) {
		profissionaldao.create(profissional);
	}
	
	public List<Profissional> getProfissionais(){
		return profissionaldao.getProfissionais();
	}
	
	public Profissional getProfissional(String cpf) {
		return profissionaldao.getProfissional(cpf);
	}
	
	public void update(Profissional profissional) {
		profissionaldao.update(profissional);
	}
	public void delete(Profissional profissional) {
		profissionaldao.delete(profissional);
	}
}