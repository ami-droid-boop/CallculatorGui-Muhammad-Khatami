/**
 * Write a description of class Calculator here.
 *
 * @author Ami
 * @version 0.1
 */
public class Calculator
{
    // instance variables - replace the example below with your own
    private int op1=0,op2=0;

    /**
     * Constructor for objects of class Calculator
     */
    public Calculator()
    {
        // initialise instance variables
        //x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int jumlah(int op1, int op2)
    {
        // put your code here
        return op1 + op2;
    }
    
    public int kurang(int op1, int op2)
    {
        // put your code here
        return op1 - op2;
    }
    
     public int perkalian(int op1, int op2)
    {
        // put your code here
        return op1 * op2;
    }
    
    public int pembagian(int op1, int op2)
    {
        // put your code here
        return op1 / op2;
    }
}