 


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
      int max = 0;
        for (int counter = 0; counter < integers.length; counter++)
      {
     if (integers[counter] > max)
     {
      max = integers[counter];
     }
    }
        return max;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        int max=0;
        for (int counter = 0; counter < integers.length; counter++)
      {
     
       int checkNum = integers[counter];
       max = Math.max(max,checkNum);
     
    }
        return max;
    }
       
    
}
