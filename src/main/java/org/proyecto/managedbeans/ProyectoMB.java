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
import org.proyecto.model.Area;
import org.proyecto.model.Persona;
import org.proyecto.model.Proceso;
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
    
    private List<Area> areas;
    private List<Proceso> procesos;
    private List<Persona> personas;
    
    private Proyecto proyecto;
    
    @PostConstruct
    public void init() {
        proyecto = new Proyecto();
        areas = appService.methodListGET(Constantes.appUrl+ "consultarArea", Area[].class);
        procesos = appService.methodListGET(Constantes.appUrl+ "consultarProceso", Proceso[].class);
        personas = appService.methodListGET(Constantes.appUrl+ "consultarPersona", Persona[].class);
    }

    public List<Area> getAreas() {
        return areas;
    }

    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }

    public List<Proceso> getProcesos() {
        return procesos;
    }

    public void setProcesos(List<Proceso> procesos) {
        this.procesos = procesos;
    }
    
    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

}
