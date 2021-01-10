import java.util.*;
import java.util.Arrays;
import java.util.Comparator;
/**
CSIS 225 Exam 1 Spring 2020

@author Jim Teresco (starter framework)
@author
 */

class S20Class  implements Comparator<S20Class>{

    protected int courseNum;
    protected String title;
    protected String instructor;
    protected int enrollment;

    public S20Class(int c, String t, String i, int e){

        courseNum = c;
        title = t;
        instructor = i;

        enrollment = e;
    }

    public int getCourseNum() {
        return courseNum;
    }

    public String getTitle() {

        return title;
    }

    public String getInstructor() {

        return instructor;
    }

    public int getEnrollment() {

        return enrollment;
    }

    public String toString() {

        return "CSIS " + courseNum + ": " + title +
        " (" + instructor + ") -> " + enrollment;
    }

    @Override
    public int compare(S20Class a, S20Class b) {
        return a.getTitle().compareTo(b.getTitle());
    }
}
class myComparator implements Comparator<S20Class>{

    @Override
    public int compare(S20Class a, S20Class b) {
        return a.getTitle().compareTo(b.getTitle());
        

    }
}

public class SortIt {

    public static void main(String args[]) {

        S20Class classes[] = new S20Class[5];
        classes[0] = new S20Class(210, "Data Structures", "Liu", 20);
        classes[1] = new S20Class(225, "Advanced Programming", "Teresco", 37);
        classes[2] = new S20Class(355, "Advanced Database", "Vandenberg", 15);
        classes[3] = new S20Class(385, "Algorithms", "Flatland", 41);
        classes[4] = new S20Class(390, "Web App Development", "Lim", 32);
        
        Arrays.sort(classes, new myComparator());
        System.out.println("sorted by increasing alphabetical order course title" );
        System.out.println(Arrays.toString(classes));
        
        Arrays.sort(classes, new Comparator<S20Class>(){
                public int compare(S20Class a, S20Class b) {
                    return b.getEnrollment() - a.getEnrollment();
                }
            });

        

        System.out.println("then sorted from there by enrollment in decreasing order");
        System.out.println(Arrays.toString(classes));

        // once you have your comparators, use groups of lines like this to
        // demonstrate their correctness
        // System.out.println("Ordered by length of instructor name");
        // Arrays.sort(classes, new InstrLenComparator());
        // System.out.println(Arrays.toString(classes));

    }
}
