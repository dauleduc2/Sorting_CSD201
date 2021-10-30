/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Employee {

    public String ID;
    public String name;
    public int level;

    public Employee() {
    }

    public Employee(String ID, String name, int level) {
        this.ID = ID;
        this.name = name;
        this.level = level;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Employee{" + "ID=" + ID + ", name=" + name + ", level=" + level + '}';
    }

}
