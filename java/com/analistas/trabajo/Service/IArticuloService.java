/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analistas.trabajo.Service;

import com.analistas.trabajo.Domain.Producto;
import java.util.List;

public interface IArticuloService {
    
    public List<Producto> buscarTodo();
    
    public List<Producto> buscarPor(String texto);
    
    public Producto buscarPorId(Integer id);
    
    public void guardar(Producto articulo);
    
    public void borrar(Integer id);
    
}
