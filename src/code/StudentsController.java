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
public class StudentsController {
    public static<T> boolean addStudents(T s){
       StudentsDB studentsDB = DBconnection.getInstance().getStudentsDB();
        studentsDB.add(s);
        return true;
    }
    public static <T> T[] getAllStudents(){
        StudentsDB studentsDB = DBconnection.getInstance().getStudentsDB();
        return (T[]) studentsDB.toArray();
    }

    public static int searchStudents(String id) {
        StudentsDB studentsDB = DBconnection.getInstance().getStudentsDB();
        return  studentsDB.search(id);
    }
      public static int getsStudents(String id) {
        StudentsDB studentsDB = DBconnection.getInstance().getStudentsDB();
        return  studentsDB.getIndex(id);
    }
       public static<T> T removeStudents(int index) {
        StudentsDB studentsDB = DBconnection.getInstance().getStudentsDB();
        return  (T) studentsDB.remove(index);
     }
     public static<T> boolean updateStudent(int index,T s){
       StudentsDB studentsDB = DBconnection.getInstance().getStudentsDB();
        studentsDB.add(index,s);
        return true;
    }
     public static<T> T searchStudent(String id){
       StudentsDB studentsDB = DBconnection.getInstance().getStudentsDB();
        return (T) studentsDB.getStudent(id);
        
    }
}
