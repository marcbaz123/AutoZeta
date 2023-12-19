/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Datos.ClientesDao;
import Datos.IDAO;
import java.util.ArrayList;


/**
 *
 * @author marcelo adrian
 */
public class ClientesControl implements IDAO {

    @Override
    public ArrayList listar(String condicion) {
        return new ClientesDao().listar( condicion );
    }

    @Override
    public void insertar(Object obj) {
        new ClientesDao().insertar(obj);
    }

    @Override
    public void modificar(Object obj) {
        new ClientesDao().modificar(obj);
    }

    @Override
    public void eliminar(Object obj) {
        new ClientesDao().eliminar(obj);
    }
}