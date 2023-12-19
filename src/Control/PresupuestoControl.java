/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Datos.FichaDao;
import Datos.PresupuestoDao;
import java.util.ArrayList;

/**
 *
 * @author Marcelo
 */
public class PresupuestoControl {

    public ArrayList listar(String condicion) {
        return new PresupuestoDao().listar(condicion);
    }

    public void insertar(Object obj) {
        new PresupuestoDao().insertar(obj);
    }

    public void modificar(Object obj) {
        new PresupuestoDao().modificar(obj);
    }

    public void eliminar(Object obj) {
        new PresupuestoDao().eliminar(obj);
    }
}
