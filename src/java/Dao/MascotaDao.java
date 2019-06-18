/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.Mascota;
import Interfaces.IMascota;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import Utilitarios.HibernateUtil;
import java.util.List;

/**
 *
 * @author Casilda Alvi
 */
public class MascotaDao implements IMascota{

    @Override
    public void guardarMascota(Mascota mascota) {
        //Construir una nueva session y una nueva transaccion
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction transaccion = sesion.beginTransaction();
        
        //Registrar en la base de datos la mascota
        sesion.save(mascota);
        transaccion.commit();
        
        sesion.close();
        
    
    }

    @Override
    public ArrayList<Mascota> listarMascotas() {
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        ArrayList<Mascota> milista = new ArrayList<>();
        //Crear la consulta hacia la base de datos
        Query query = sesion.createQuery("FROM Mascota");
        
        //Ejecutar la consulta y obtener la lista
        milista = (ArrayList<Mascota>)query.list();
        
        return milista;
    
    }

    @Override
    public void actualizarMascota(Mascota mascota) {
         Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = sesion.beginTransaction();
        sesion.update(mascota);
        transaction.commit();
        sesion.close();
    }

    @Override
    public List<Mascota> listarRazaMascota(Session session) throws Exception {
        String mascota = "from Mascota where raza='Pastor Aleman'";
        Query query = session.createQuery(mascota);
        List<Mascota>lista = (List<Mascota>) query.list();
        return lista;
    }

    @Override
    public List<Mascota> listarNombreMascota(Session session, String nombreMascota) {
        String mascota = "from Mascota where nombreMascota='"+nombreMascota+"'";
        Query query = session.createQuery(mascota);
        List<Mascota>lista = (List<Mascota>) query.list();
        return lista;
    }

    @Override
    public Integer ContarMascota(Session session) throws Exception {
        
        String hql = "select count(*) from Mascota";
        Query query = session.createQuery(hql);
        Long FilasTab = (Long) query.uniqueResult();
        Integer cont = FilasTab.intValue();
        return cont;
    }
  
    

    @Override
    public boolean EliminarMascota(Mascota mascota) {
    Session sesion = HibernateUtil.getSessionFactory().openSession();
    Transaction transaction = sesion.beginTransaction();
    try{
        sesion.delete(mascota);
        transaction.commit();
        
         }catch (Exception e){
          sesion.close();
         }
    
    return false;
    }
    }
 

