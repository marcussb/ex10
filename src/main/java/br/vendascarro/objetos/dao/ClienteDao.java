package br.vendascarro.objetos.dao;

import javax.persistence.EntityManager;
import br.vendascarro.objetos.entidades.Cliente;

public class ClienteDao {

  private EntityManager entityManager;

  public ClienteDao(EntityManager entityManager) {
    this.entityManager = entityManager;
  }

  public Cliente salvar(Cliente cliente) throws Exception {     
    
    if (cliente.getId() == null) {
      this.entityManager.persist(cliente);
    } else {
      if (!this.entityManager.contains(cliente)) {
        if (consultarPorId(cliente.getId()) == null) {
          throw new Exception("Cliente nao existe!");
        }
      }
    }

    return entityManager.merge(cliente);
  }


  public Cliente consultarPorId(Long id) {
    return entityManager.find(Cliente.class, id);
  }
  
}