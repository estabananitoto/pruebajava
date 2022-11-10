package com.proyecto.Controller;

import java.util.Optional;

import javax.management.Query;
import javax.persistence.NamedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.proyect.facadeimp.ClientDao;
import com.proyectos.model.Client;

@Controller
public class ClientController {

	@Autowired
	public ClientDao cliedao;
	
	@RequestMapping({"/Cliente", "/"})
	public String ListClient(Model model){
		
		model.addAttribute("Client", cliedao.EncontrarTodo());
	  
		return "Cliente";
	}

	@RequestMapping({"/getOne"})
	@ResponseBody
	public Optional<Client> getOne(Integer Num_doc){
		return cliedao.getOne(Num_doc);
	}
	
	@PostMapping({"/ClientCrear"})
    public String create(Client client) {
    cliedao.create(client);
    return "redirect:/Cliente";
	}
	
	@RequestMapping(value="/ClientUpdate", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Client client) {
		cliedao.update(client);
		return "redirect:/Cliente";
	}
	  
	@RequestMapping(value="/ClientDelete", method = {RequestMethod.PUT, RequestMethod.GET})
	public String delete(Integer Num_doc) {
		
		Client cli = cliedao.findById(Num_doc);
		cli.setEst("Inactivo");
		
	  this.cliedao.delete(cli);
	  return "redirect:/Cliente";
	}
}
