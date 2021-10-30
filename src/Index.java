
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        //employee 1
        manager.add("A05", "Tran Quang", 7);
        //employee 2
        manager.add("A03", "Nguyen An", 7);
        //employee 3
        manager.add("A01", "Truong Phung", 5);
        //employee 4
        manager.add("A04", "Pham Thi Lam", 2);
        //employee 5
        manager.add("A02", "Do Trung Ton", 5);
    }

}
