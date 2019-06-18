/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Dao.MascotaDao;
import Entidades.Mascota;
import Utilitarios.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Casilda Alvi
 */
public class Ejemplo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       List<Mascota> lista = new ArrayList<>();
       MascotaDao mascotaDao = new MascotaDao();
       Session session = HibernateUtil.getSessionFactory().openSession();
       lista = mascotaDao.listarNombreMascota(session,"Sandor");
       
       for(Mascota mascota : lista){
           System.out.println("Nombre de la Mascota es : "+mascota.getNombreMascota()+(" cuyo dueño(a) es: ")+mascota.getNombreCliente());
           
       }
    }
    
}
