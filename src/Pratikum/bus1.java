/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum;

/**
 *
 * @author ASUS
 */
public class bus1 {
public double penumpang;
public double maxPenumpang;  
public double penumpangBaru;
public double counter;

public bus1(double maxpenumpang)
{
    this.maxPenumpang = maxpenumpang;
    penumpang = 0;
}

public void addpenumpang(double penumpang)
{
    double temp;
    temp = this.penumpang+penumpang;
    if (temp >= maxPenumpang)
    {
        System.out.println("Penumpang melebihi kuota");
    }
    else 
    {
        this.penumpang=temp;
        counter++;
    }
}      

public void getPenumpang(double password)
{
    if(password)
}
}
