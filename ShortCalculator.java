 


public class ShortCalculator {
        int num1;
        int num2;
        short convert1 ;
        short convert2 ;
    public ShortCalculator(int num1,int num2){
            if (65536 >num1 && num1 > 0 && 65536 >num2 && num2>0 )
        {
        convert1 = (short)(num1);
        convert2 = (short)(num2);

        }
    }
    
        public short add(short convert1,short convert2) {
        
            short sum = (short)(convert1+convert2);
            return sum;

        }
        public short subtract(short convert1,short convert2) {
        
            short subtract = (short)(convert1-convert2);
            return subtract;

        }
         public short multiply(short convert1,short convert2) {
        
            short multiply = (short)(convert1*convert2);
            return multiply;

        }
         public short divide(short convert1,short convert2) {
        
            short divide = (short)(convert1/convert2);
            return divide;

        }
        public short remainder(short convert1,short convert2) {
        
            short remainder = (short)(convert1%convert2);
            return remainder;

        }
        
        
    
    
    
    
}
    

