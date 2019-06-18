/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Dao.MascotaDao;
import Entidades.Mascota;
import Utilitarios.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Casilda Alvi
 */
public class Ejemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MascotaDao mascotaDao = new MascotaDao();
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Mascota mimascota = new Mascota(1, "rambo", "casi", "argentina");
        mascotaDao.actualizarMascota(mimascota);
    }
    
}
