package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * @param passsword string ที่ต้องการ
     * @return Invilid , weak , medium , Strong
     */ 
   
    
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength  
        int minLength = 8 ;// TODO: มีอะไรขาดหายไปที่บรรทัดนี้?
        if(password==null || password.length()<8)
        return PasswordStrength.INVALID;
        boolean hasLower = false ;
        boolean hasUpper = false ;
        boolean Special = false ;
        boolean Letter = false;
        boolean Digit = false;
         
        for(char c : password.toCharArray()){
            if(Character.isLowerCase(c))
            hasLower = true ;
            else if (Character.isUpperCase(c))
            hasUpper = true ;
               else if (Character.isLetter(c))
           Letter = true ;
            else if (Character.isDigit(c))
            Digit = true ;
            else Special = true ;
             
        }
        if(hasLower && hasUpper && Digit  && Special ) return PasswordStrength.STRONG;
       if(hasLower && !hasUpper) return PasswordStrength.WEAK;
         if(hasLower && hasUpper || Digit) return PasswordStrength.MEDIUM;
         
        return PasswordStrength.INVALID ;


        
        // ส่วนของ Implementation ที่คุณต้องเขียน
        // ...
        
       
        
        //return null ; // TODO: การคืนค่านี้ถูกต้องหรือไม่?
    }
}