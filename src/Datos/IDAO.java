/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import java.util.ArrayList;
/**
 *
 * @author marcelo adrian
 */

public interface IDAO {  
public  ArrayList listar (String condition);
  public void insertar(Object obj); 
  public void modificar (Object obj);
  public void eliminar (Object obj);
}

