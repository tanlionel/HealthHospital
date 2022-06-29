/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

/**
 *
 * @author THIEM LOC
 */
public class Services {
    private int id;
    private String name;
    private int price;

    public Services(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    Services() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public void input(){
       
        Services c =new Services(id, name, price);
        
    }
    public void output(){
        System.out.format("%10d%20s%10d", id, name, price);
        
    }
}
