package br.vendascarro.objetos.services;

import javax.inject.Inject;
import br.vendascarro.objetos.dao.*;
import br.vendascarro.objetos.entidades.*;

public class ClienteService {

  @Inject
  ClienteDao dao;

  public void salva(Cliente cliente) {
    // dao.salva(cliente);
  }

}