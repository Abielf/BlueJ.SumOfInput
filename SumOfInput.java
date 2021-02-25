/**
 * Write a description of class SumOfInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SumOfInput
{
    // instance variables - replace the example below with your own
    private Integer sum;

    /**
     * Constructor for objects of class SumOfInput
     */
    public SumOfInput()
    {
        // initialise instance variables
        sum = 0;
    }
    
    public Integer oneToNumber(Integer numberToSum){
        //formula to add up even numbers
        sum = ((numberToSum+1)*(numberToSum/2));
        //if statement to catch odd numbers
        if (numberToSum%2==1){
        sum+=(numberToSum/2)+1;
        }
        return sum;
    }

}
