package br.vendascarro.objetos.bean;

import br.vendascarro.objetos.entidades.Cliente;
import br.vendascarro.objetos.entidades.Seguro;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class seguroBean {

    private Seguro seguro = new Seguro();
    private List<Seguro> seguros = new ArrayList<>();
    Cliente cliente = new Cliente();
    
    public String clienteNome() {
        return (String) FacesContext.getCurrentInstance().getExternalContext().getRequestMap().get("nome");
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    public List<Seguro> getSeguros() {
        return seguros;
    }

    public void setSeguros(List<Seguro> seguros) {
        this.seguros = seguros;
    }

    
}
