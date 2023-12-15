/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.proyecto.services.interfaces;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jose0
 */
@Local
public interface AppServices {
    
    public Object methodGET(String url, Class clase);
    
    public List methodListGET(String url, Class clase);
    
    public Object methodPOST(Object data, String url, Class clase);
    
    public List methodListPOST(Object data, String url, Class clase);
    
}
