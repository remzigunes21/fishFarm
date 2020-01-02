/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Depo;
import entity.Yem;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cemr_
 */
public class DepoDao extends Dao{

    public ArrayList<Depo> depoList() {
        ArrayList<Depo> depoList = new ArrayList<>();

        String sorgu = "select * from depo order by id";

        try {
            PreparedStatement pst = this.getConnection().prepareStatement(sorgu);
            ResultSet rs = pst.executeQuery();

            if (true) {
                while (rs.next()) {
                    Depo depo = new Depo();
                    depo.setId(rs.getLong("id"));
                    depo.setYemFirma(rs.getString("yem_firma"));
                    depo.setYemKategori(rs.getString("yem_kategori"));
                    depo.setToplamYemAdet(rs.getString("toplam_yem_adet"));
                    depo.setYemGelmeTarihi(rs.getString("yem_gelme_tarihi"));
                   

                    depoList.add(depo);
                }

            } else {
                System.out.println("////////////////////hata////////////////////////");
            }
            return depoList;

        } catch (SQLException ex) {
            Logger.getLogger(YemDao.class.getName()).log(Level.SEVERE, null, ex);

            return null;
        }
    }

    public void ekleDepo(String firma, String kategori, String adet, String tarih) {
        String sorgu = "insert into depo (yem_firma,yem_kategori,toplam_yem_adet,yem_gelme_tarihi) values(?,?,?,?)";
       
        if (true) {
           try {
               PreparedStatement pst = this.getConnection().prepareStatement(sorgu);
               pst.setString(1, firma);
               pst.setString(2, kategori);
               pst.setString(3, adet);
               pst.setString(4, tarih);
               
               pst.executeUpdate();
               
           } catch (SQLException ex) {
               Logger.getLogger(YemDao.class.getName()).log(Level.SEVERE, null, ex);
           }
        }else{
            System.out.println("////////////Kodda bir hata var////////////");
        }
    }

    public void guncelleDepo(long id, String firma, String kategori, String adet, String tarih) {
        String sorgu = "update depo set yem_firma=?,yem_kategori=?,toplam_yem_adet=?,yem_gelme_tarihi=? where id=?";
       
        if (true) {
           try {
               PreparedStatement pst = this.getConnection().prepareStatement(sorgu);
               pst.setString(1, firma);
               pst.setString(2, kategori);
               pst.setString(3, adet);
               pst.setString(4, tarih);
               pst.setLong(5, id);
               
               pst.executeUpdate();
               
           } catch (SQLException ex) {
               Logger.getLogger(YemDao.class.getName()).log(Level.SEVERE, null, ex);
           }
        }else{
            System.out.println("////////////Kodda bir hata var////////////");
        }
    }

    public void silDepo(long id) {
       String sorgu = "delete from depo where id=?";
      if (true) {
            try {
                PreparedStatement pst = this.getConnection().prepareStatement(sorgu);

                pst.setLong(1, id);

                pst.executeUpdate();

            } catch (SQLException ex) {
                Logger.getLogger(YemDao.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
            }
        }else{
            System.out.println("//////////////////////////hata/////////////////////////");
        }
    }

    public boolean kontrolYap(String firma, String kategori, String adet, String tarih) {
       String sorgu = "select * from depo where yem_firma='" + firma + "' and yem_kategori='" + kategori +
               "' and toplam_yem_adet='"+adet+"' and yem_gelme_tarihi='" +tarih+"'";
       
      
        try {
           Statement st = this.getConnection().createStatement();
             ResultSet rs = st.executeQuery(sorgu);
             
             if (rs.next()) {
               return false;

                   
            }
             
             else{
                 return true;
             } 
        } catch (SQLException ex) {
            Logger.getLogger(DepoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       return true;
    }
    
}
