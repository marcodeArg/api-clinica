package med.clinica.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicosController {
	
	@PostMapping
	public String registrarMedicos(@RequestBody String datos) {
		return "Registrado con exito";
	}
	
}
