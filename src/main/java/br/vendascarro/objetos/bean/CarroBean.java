package br.vendascarro.objetos.bean;

import br.vendascarro.objetos.entidades.Carro;
import br.vendascarro.objetos.entidades.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class CarroBean {

    private Carro carro = new Carro();
    private List<Carro> carros = new ArrayList<>();
    Cliente cliente = new Cliente();
    
    public String clienteNome() {
        return (String) FacesContext.getCurrentInstance().getExternalContext().getRequestMap().get("nome");
    }

    public String adicionar() {
        cliente.setNome(clienteNome());
        
        carros.add(carro);
        carro = new Carro();
        
        return "seguro";
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }
    
}
