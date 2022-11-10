package com.proyect.facadeimp;

import java.util.List;
import java.util.Optional;

import javax.management.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectos.Repository.ClientRepository;
import com.proyectos.facade.IClient;
import com.proyectos.model.Client;

@Service
public class ClientDao implements IClient{

	@Autowired
	private ClientRepository clierepo;
	
	
	@Override
	public List<Client> EncontrarTodo() {
		
		//Query nativeQuery = createNativeQuery("SELECT id, name, email FROM user ORDER BY email DESC");
		
		return clierepo.findAll();
	}

	@Override
	public Optional<Client> getOne(Integer Num_doc) {
		return clierepo.findById(Num_doc);
	}

	@Override
	public Client findById(Integer Num_doc) {
		
		return clierepo.getReferenceById(Num_doc);
	}

	@Override
	public void create(Client client) {
		this.clierepo.save(client);
		
	}

	@Override
	public void update(Client client) {
		this.clierepo.save(client);
		
	}

	@Override
	public void delete(Client client) {
		Client cli = clierepo.getById(client.getNum_doc());
		this.clierepo.save(cli);
		
	}

}
