/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasEnkapsulasi;

/**
 *
 * @author ASUS
 */
public class EncapPatricia {

    public EncapPatricia() {
    }
    
    
    
    private String namaAyah, namaIbu, namaSendiri, namaSaudara, Alamat, Hobi, Citacita ;
    private int Umur;
    
    public String getnamaAyah(){
        return namaAyah;
    }
    public String getnamaIbu(){
        return namaIbu;
    }
   public String getnamaSendiri(){
        return namaSendiri;
    } 
   public String getnamaSaudara(){
        return namaSaudara;
    }
   public String getAlamat(){
        return Alamat;
    }
   public String getHobi(){
        return Hobi;
    }
   public String getCitacita(){
        return Citacita;
    }
  public int getUmur(){
        return Umur;
    }
   
 
  public void setnamaAyah(String newnamaAyah)
  {
      namaAyah = newnamaAyah;
  }
  public void setnamaIbu(String newnamaIbu)
   {
      namaIbu = newnamaIbu;
    }
  public void setnamaSendiri(String newnamaSendiri)
  {
      namaSendiri = newnamaSendiri;
  }
  public void setnamaSaudara(String newnamaSaudara)
  {
      namaSaudara = newnamaSaudara;
  }
  public void setnAlamat(String newAlamat)
  {
      Alamat = newAlamat;
  }
  public void setHobi(String newHobi)
  {
      Hobi = newHobi;
  }
  public void setCitacita(String newCitacita)
  {
      Citacita = newCitacita;
  }
  public void setUmur(int newUmur)
  {
     Umur = newUmur;
  }

    }

