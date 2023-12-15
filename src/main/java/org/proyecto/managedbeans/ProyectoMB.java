/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.proyecto.managedbeans;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.proyecto.config.Constantes;
import org.proyecto.model.Proyecto;
import org.proyecto.services.interfaces.AppServices;

/**
 *
 * @author jose0
 */
@ViewScoped
@Named
public class ProyectoMB implements Serializable {
    
    @Inject
    private AppServices appService;
    
    private List<Proyecto> proyectos;
    
    @PostConstruct
    public void init() {
        proyectos = appService.methodListGET(Constantes.appUrl+ "consultarProyecto", Proyecto[].class);
    }

    public List<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(List<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }
    
    
}
