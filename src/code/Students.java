/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.util.Comparator;
/**
 *
 * @author samee
 */
public class Students implements Comparable<Students>{
    
        private String stId;
	private String stName;
	private int prfMarks;
	int dbmsMarks;
    

    public Students() {
    }

    public Students(String stId, String stName, int prfMarks, int dbmsMarks) {
        this.stId = stId;
        this.stName = stName;
        this.prfMarks = prfMarks;
        this.dbmsMarks = dbmsMarks;
    }

    public Students(String text, String text0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getStId() {
        return stId;
    }

    public String getStName() {
        return stName;
    }
    public int getPrfMarks(){
        return prfMarks;
    }
    public int getDbmsMarks() {
        return dbmsMarks;
    }
        
     public boolean equals(String id){
        return this.stId.equals(id);
    }     
     
     public boolean studentIdEquals(Students students){
	return this.stId.equals(students.getStId());
	}		
    String getStudentsName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


        @Override
    public int compareTo(Students stu) {
       return  stu.prfMarks-this.prfMarks;   
    }

}
 

