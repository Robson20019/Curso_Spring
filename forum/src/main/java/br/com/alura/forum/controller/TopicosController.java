package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

@RestController
public class TopicosController {
	
	@RequestMapping("/topicos")
	public List<TopicoDto> lista() {
		
		Topico topico = new Topico ("Dúvida", "Dúvida com spring", new Curso("Spring", "Programação" ));
	
	return TopicoDto.converter (Arrays.asList(topico, topico, topico ));
=======
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

@Controller
public class TopicosController {
	
	@RequestMapping("/topicos")
	@ResponseBody 
	public List<Topico> lista() {
		
		Topico topico = new Topico ("Duvida", "Duvida com spring", new Curso("Spring", "Programação" ));
	
	return Arrays.asList(topico, topico, topico );
>>>>>>> 52f568219eeab586e3438410d0a1f71b15038f8e
	}
	

}
