/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entidades.Mascota;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Casilda Alvi
 */
public interface IMascota {
    
    public abstract void guardarMascota(Mascota mascota);
    public abstract ArrayList<Mascota> listarMascotas();
    
    public abstract void actualizarMascota(Mascota mascota);
    public abstract boolean EliminarMascota(Mascota mascota);
    
    public abstract List<Mascota> listarRazaMascota(Session sesion)throws Exception;
    public abstract List<Mascota> listarNombreMascota(Session session, String nombreMascota);
    public abstract Integer ContarMascota(Session sesion)throws Exception;
    
}
