import java.util.Iterator;

/**
CSIS 225 Exam 1 Spring 2020

@author Jim Teresco (starter framework)
@author
 */
public class IntArrayBigValsIterator implements Iterator<Integer> {
    /* instance variables to remember the array and the next index to be 
    returned */
    private Integer[] array;
   
    private int count;
    private int val;
    private int current;
    private int n;
    public IntArrayBigValsIterator(Integer a[], int bigVal) {
        array = a;
        count = 0;
        val = bigVal;
        current = 0;
        
        n = 0;
        
    }
    /**
     * @return whether the iterator has more Integers to return
     */
    public boolean hasNext() {
        return current < array.length;
        //return false;
    }

    public Integer next() {
        
        Integer value = array[current];
        while(value<val){
            
            n++;
            //increment index
            current++;
            value = array[current];
        }
        value = array[current];
        current++;
        // if(value > val){
            // //array[count] = value;
            // //current++;
            // newArray[current] = array[count];
            // current++;
        // }
        // value = newArray[1];
        //current += n;
        
        // count++;
        
        return value;
    }

    public static void main(String args[]) {

        Integer a1[] = new Integer[5];
        a1[0] = 8;
        a1[1] = 3;
        a1[2] = 0;
        a1[3] = 10;
        a1[4] = 5;

        Iterator<Integer> i = new IntArrayBigValsIterator(a1, 5);
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        
    }  
}
