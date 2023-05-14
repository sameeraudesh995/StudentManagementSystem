/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf;

import code.Students;
import java.util.Comparator;

/**
 *
 * @author samee
 */
class DmbsComparator implements Comparator<Students> {

    @Override
    public int compare(Students st1, Students st2) {
        return st2.getDbmsMarks()-st1.getDbmsMarks();
    }
}
   
