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
public class Pet {
    private int id;
    private String name;
    private String birthday;
    private String gender;
    
    private Services useServices; //field chỉ diễn đạt sd dịch vụ
    
    public Pet(){
        id = 0;
        name = "";
        birthday = "";
        gender = "";
        useServices = new Services();
    }

    public Pet(int id, String name, String birthday, String gender) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
    
    }

    public Pet(int id, String name, String birthday, String gender, Services useServices) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.useServices = useServices;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Services getUseServices() {
        return useServices;
    }

    public void setUseServices(Services useServices) {
        this.useServices = useServices;
    }
    
    public void output(){
        System.out.format("%10d%20s%20s%10s", id, name, birthday, gender);
        useServices.output();
    }
    public void input(){
        
    }
}
