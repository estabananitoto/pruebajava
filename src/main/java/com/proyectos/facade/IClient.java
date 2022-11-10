package com.proyectos.facade;

import java.util.List;
import java.util.Optional;

import com.proyectos.model.Client;


public interface IClient {

	public List<Client>EncontrarTodo();
	public Optional<Client>getOne(Integer Num_doc);
	public Client findById(Integer Num_doc);
	public void create(Client client);
	public void update(Client client);
	public void delete(Client client);
	
}
