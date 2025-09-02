package br.com.tailorkz.controller;

import br.com.tailorkz.domain.Carro;
import br.com.tailorkz.service.ICarroService;

import jakarta.annotation.PostConstruct;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.Collection;

@Named
@ViewScoped
public class CarroController implements Serializable {

    private static final long serialVersionUID = 1L;

    private Carro carro;
    private Collection<Carro> carros;
    private Boolean isUpdate = false;

    @Inject
    private ICarroService service;

    @PostConstruct
    public void init() {
        try {
            this.isUpdate = false;
            this.carro = new Carro();
            this.carros = service.buscarTodos();
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage("growl", new FacesMessage("Erro ao listar os carros"));
        }
    }

    public void cadastrar() {
        try {
            service.cadastrar(carro);
            this.carros = service.buscarTodos();
            cancel();
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage("growl", new FacesMessage("Erro ao cadastrar o carro"));
        }
    }

    public void editar(Carro carro) {
        this.isUpdate = true;
        this.carro = carro;
    }

    public void excluir(Carro carro) {
        try {
            service.excluir(carro);
            carros.remove(carro);
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage("growl", new FacesMessage("Erro ao excluir o carro"));
        }
    }

    public void atualizar() {
        try {
            service.alterar(this.carro);
            cancel();
            FacesContext.getCurrentInstance().addMessage("growl", new FacesMessage("Carro atualizado com sucesso"));
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage("growl", new FacesMessage("Erro ao atualizar o carro"));
        }
    }

    public void cancel() {
        this.isUpdate = false;
        this.carro = new Carro();
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Collection<Carro> getCarros() {
        return carros;
    }

    public void setCarros(Collection<Carro> carros) {
        this.carros = carros;
    }

    public Boolean getIsUpdate() {
        return isUpdate;
    }

    public void setIsUpdate(Boolean isUpdate) {
        this.isUpdate = isUpdate;
    }
}
