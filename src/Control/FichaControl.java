/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Datos.FichaDao;
import Datos.IDAO;
import java.util.ArrayList;
/**
 *
 * @author Marcelo
 */
public class FichaControl implements IDAO {
     @Override
    public ArrayList listar(String condicion) {
        return new FichaDao().listar( condicion );
    }

    @Override
    public void insertar(Object obj) {
        new FichaDao().insertar(obj);
    }

    @Override
    public void modificar(Object obj) {
        new FichaDao().modificar(obj);
    }

    @Override
    public void eliminar(Object obj) {
        new FichaDao().eliminar(obj);
    }
    
}
