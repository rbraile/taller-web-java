package ar.edu.unlam.tallerweb.controllers;

import java.util.LinkedList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb.domain.Persona;

@Controller
public class inicioController {

	@RequestMapping(value = "/mapa", method = RequestMethod.GET)
	public ModelAndView map() {
		ModelMap miMapa = new ModelMap();
		miMapa.put("nombre", "Juan");
		miMapa.put("apellido", "Perez");
		ModelAndView miVista = new ModelAndView();
		miVista.addAllObjects(miMapa);
		miVista.setViewName("mapa");
		return miVista;
	}
	
	@RequestMapping(value = "/nombre/{nombre}/apellido/{apellido}", method = RequestMethod.GET)
	public ModelAndView holaRest(@PathVariable String nombre, @PathVariable String apellido) {
		ModelMap miMapa = new ModelMap();
		miMapa.addAttribute("nombre", nombre);
		miMapa.addAttribute("apellido", apellido);
		ModelAndView miVista = new ModelAndView();
		miVista.addAllObjects(miMapa);
		miVista.setViewName("mapa");
		return miVista;
	}
	
	@ModelAttribute("persona")
	public Persona createModel() {
	    return new Persona();
	}
	
	@RequestMapping(value = "/formulario", method = RequestMethod.GET)
	public ModelAndView formulario() {
		
		ModelAndView miVista = new ModelAndView();
		miVista.setViewName("formulario");
		return miVista;
	}
	
	@RequestMapping(value = "/formulario2", method = RequestMethod.POST)
	public ModelAndView formulario2(@PathVariable Persona p3) {		
			ModelMap cosa = new ModelMap();
			cosa.addAttribute("Persona", p3);		
			ModelAndView miVista = new ModelAndView();
			miVista.setViewName("formulario2");
			miVista.addAllObjects(cosa);
			return miVista;
	}
	
	
	@RequestMapping(value = "/lista", method = RequestMethod.GET)
	public ModelAndView lista() {		
		ModelMap miMapa = new ModelMap();
		LinkedList<Persona> lista = new LinkedList<Persona>();
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		p1.setNombre("Juan");
		p1.setApellido("Perez");
		p1.setEmail("juan@gmail.com");
		p1.setEdad(30);
		
		p2.setNombre("Sandra");
		p2.setApellido("Sanabria");
		p2.setEmail("sanabria@gmail.com");
		p2.setEdad(25);
		lista.add(p1);
		lista.add(p2);
		miMapa.put("lista", lista);		
		ModelAndView miVista = new ModelAndView();
		miVista.addAllObjects(miMapa);
		miVista.addObject("lista", lista);
		miVista.setViewName("lista");
		return miVista;
	}
	
}
