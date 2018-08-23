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
public class PatriciaDian {
    public static void main(String args[]) {
        EncapPatricia Patricia = new EncapPatricia();
        Patricia.setnamaAyah("Chrysantus");
        Patricia.setnamaIbu("Anastasia");
        Patricia.setnamaSendiri("Patricia");
        Patricia.setnamaSaudara("Karina");
        Patricia.setnAlamat("Mojokerto");
        Patricia.setHobi("Mendengarkan musik");
        Patricia.setCitacita("Guru");
        Patricia.setUmur(16);
        
        System.out.println("Nama Ayah :" + Patricia.getnamaAyah() + "\nNama Ibu : " + Patricia.getnamaIbu()
        + "\nNama sendiri : " + Patricia.getnamaSendiri() + "\nNama Saudara : " + Patricia.getnamaSaudara()
        + "\nAlamat : " + Patricia.getAlamat() + "\nHobi : " + Patricia.getHobi() + "\nCita-cita : " + Patricia.getCitacita()
        + "\nUmur : " + Patricia.getUmur());
    }
}
