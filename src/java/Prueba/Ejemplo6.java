/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Dao.MascotaDao;
import Utilitarios.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Casilda Alvi
 */
public class Ejemplo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        MascotaDao mascotaDao = new MascotaDao();
        Session session = HibernateUtil.getSessionFactory().openSession();
        int cantidadMascota = mascotaDao.ContarMascota(session);
        
        System.out.println("Cantidad de Mascotas es :"+ cantidadMascota);
    }
    
}
