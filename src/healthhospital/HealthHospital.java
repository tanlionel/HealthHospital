/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthhospital;

import basic.Owner;
import basic.Pet;
import basic.Services;
import java.util.Scanner;

/**
 *
 * @author THIEM LOC
 */
public class HealthHospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int c=0;
        Owner customer = null;
        Pet animal = null;
        Services ser1 = null;
        Services ser2 = null;
        
        do{ 
            Scanner s = new Scanner(System.in);
            System.out.println("1.tao 2 services");
            System.out.println("2.tao thong tin khach hang va thu cung cua ho");
            System.out.println("3.chon dich vu su dung");
            System.out.println("4.xuat hoa don");
            System.out.println("nhap 1 so [1-4]");
            c = s.nextInt();
            switch (c){
                case 1:
                    /*ser1 = new Services();
                    ser.input ();*/ //chỉ xài khi có sẵn thư viện
                    
                    ser1 = new Services(1, "spa", 1000);
                    ser2 = new Services(2, "Shower", 900);
                    System.out.println("done");
                    break;
                case 2:
                    /*customer = new Owner(1, "thi no", "Lang Vu Dai");
                    customer.getAnimal().input();*/
                    
                    /*customer = new Owner(1, "thi no", "Lang Vu Dai");
                    animal = new Pet(1, "cho", "1/1/2022", "F");           
                    customer.setAnimal(animal); //con animal này là thú cưng thuộc sơ hữu của customer
                    */
                    
                    animal = new Pet(1, "cho", "1/1 2022", "F");
                    customer = new Owner(1, "thi no", "Lang Vu Dai");
                    
                    break;
                case 3:
                    int c2 = 0;
                    System.out.println("1.Services 1");
                    System.out.println("2.Services 2");
                    System.out.println("chon Service [1-2]");
                    c2 = s.nextInt();
                    switch(c2){
                        case 1:
                            if(ser1!=null && animal!=null)
                            {    
                            animal.setUseServices(ser1);
                            System.out.println("done");
                            }
                            else System.out.println("no data");
                            break;
                        case 2:
                            if(ser1!=null && animal!=null)
                            {  
                            animal.setUseServices(ser2);
                            System.out.println("done");
                            }
                            else System.out.println("no data");
                            break;
                    }
                    break;
                case 4:
                    System.out.format("%-40s\n", "Trung tam Thu Y" );
                    System.out.format("%10s\n", "Lo12, Q9, HCM");
                    if(customer!=null)
                      customer.output();
                    else
                      System.out.println("");
                    
                    break;
               }
            
            
        }while(c<=3);
    }
    
}
