import java.util.;
public class RandomStringChooser
{
  / to be implemented in part (a) /
  private String [] values;
  private int valuesRemaining;

  public RandomStringChooser ( String [] vals){
    values = new String [vals.length];

    for ( int i = 0 ; i < values.length; i++){
        values[i] = vals[i];
    }
    valuesRemaining = values.length;
  }
  public String getNext(){
    if (valuesRemaining == 0){
      return "NONE";
    }
    int index = (int) ( Math.random() valuesRemaining);
    String selected = values [index];
    values[index] = values [ valuesRemaining - 1];
    valuesRemaining--;

    return selected;
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
