/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.proyecto.services.ejb;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.net.URI;
import java.util.List;
import java.util.Arrays;
import javax.ejb.Singleton;
import javax.enterprise.context.ApplicationScoped;
import org.proyecto.services.interfaces.AppServices;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author jose0
 */
@Singleton
@ApplicationScoped
public class AppEjb implements AppServices{
    
    private Gson gson;
    private GsonBuilder builder;
    
    public AppEjb() {
        builder = new GsonBuilder();
        gson = builder.create();
    }

    @Override
    public Object methodGET(String url, Class clase) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            URI uri = new URI(url);
            HttpEntity<String> entity = new HttpEntity<String>(headers);
            ResponseEntity<Object> response = restTemplate.exchange(uri, HttpMethod.GET, entity, clase);
            
            if (response != null) {
                return response.getBody();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List methodListGET(String url, Class clase) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            URI uri = new URI(url);
            HttpEntity<String> entity = new HttpEntity<String>(headers);
            ResponseEntity<Object[]> response = restTemplate.exchange(uri, HttpMethod.GET, entity, clase);
            
            if (response != null) {
                return Arrays.asList(response.getBody());
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Object methodPOST(Object data, String url, Class clase) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List methodListPOST(Object data, String url, Class clase) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
