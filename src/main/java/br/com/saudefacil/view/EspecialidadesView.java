package br.com.saudefacil.view;

import java.util.List;

import br.com.saudefacil.controllers.EspecialidadesController;
import br.com.saudefacil.models.Especialidades;

public class EspecialidadesView {

	public void getEspecialidades() {
		EspecialidadesController especialidadesController = new EspecialidadesController();
		List<Especialidades> especialidades = especialidadesController.getEspecialidades();
		especialidades.forEach(System.out::println);
	}

}
