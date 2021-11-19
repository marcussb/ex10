package br.vendascarro.objetos.bean;

import br.vendascarro.objetos.dao.ClienteDao;
import br.vendascarro.objetos.entidades.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@ManagedBean
@SessionScoped
public class ClienteBean {

    @PersistenceContext(unitName = "vendascarro")
    private EntityManager em;

    private Cliente cliente = new Cliente();
    private List<Cliente> clientes = new ArrayList<>();
    
    public Cliente adicionar() throws Exception {
        FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("nome", cliente.getNome().toString());
        
        ClienteDao dao = new ClienteDao(em);

        return dao.salvar(cliente);
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
}
