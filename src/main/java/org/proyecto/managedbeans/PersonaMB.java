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
import org.proyecto.model.Persona;
import org.proyecto.services.interfaces.AppServices;

/**
 *
 * @author jose0
 */
@ViewScoped
@Named
public class PersonaMB implements Serializable{
    
    @Inject
    private AppServices appService;
    
    private List<Persona> personas;
    
    @PostConstruct
    public void init () {
        personas = appService.methodListGET(Constantes.appUrl+ "consultarPersona", Persona[].class);
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
        
}
