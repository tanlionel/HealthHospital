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
public class Owner {
    private int id;
    private String name;
    private String address;
    private Pet animal;
    
    public Owner(){
        id = 0;
        name = "";
        address = "";
        animal = new Pet();
    }

    public Owner(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
        animal = new Pet();
    }

    public Owner(int id, String name, String address, Pet animal) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.animal = animal;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Pet getAnimal() {
        return animal;
    }

    public void setAnimal(Pet animal) {
        this.animal = animal;
    }
    public void output(){
        System.out.println("customer id:" + id);
        System.out.println("customer name" + name);
        System.out.println("address:" + address);
        animal.output();
    }
    public void input(){
        
    }
}
