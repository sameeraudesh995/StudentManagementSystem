/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

/**
 *
 * @author samee
 */
public class DBconnection {
    StudentsDB<Students>studentsDB= new StudentsDB<>();
    private static DBconnection dBConnection;
    private DBconnection(){
        studentsDB=new StudentsDB();
    }
    public StudentsDB getStudentsDB(){
        return studentsDB;
    }
    public static DBconnection getInstance(){
        if(dBConnection==null){
            dBConnection=new DBconnection();
        }
        return dBConnection;
    }
   
    
}
