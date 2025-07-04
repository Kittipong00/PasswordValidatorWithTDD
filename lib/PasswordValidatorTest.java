package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        String pw = "123";
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        PasswordStrength result1 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 "+pw+"Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 "+pw+"FAILED: Expected INVALID but got " + result1);
        }
        // Test case 2 : รหัสผ่านที่ควรจะ weak
        pw = "abcdefgh" ;
         PasswordStrength result2 = PasswordValidator.validate(pw);
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 "+pw+"Passed: Short password is WEAK.");
        } else {
            System.out.println("Test Case 2"+pw+" FAILED: Expected WEAK but got " + result2);
        }
        // Test case 3 : รหัสผ่านที่ควรจะ Medium
        pw = "Abcdefg123" ;
         PasswordStrength result3 = PasswordValidator.validate(pw);
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3"+pw+" Passed: Short password is Medium.");
        } else {
            System.out.println("Test Case 3"+pw+" FAILED: Expected Medium but got " + result3);
        }
        // Test case 4 : รหัสผ่านที่ควรจะ Strong
        pw = "ABcfg@1 2" ;
         PasswordStrength result4 = PasswordValidator.validate(pw);
        if (result4 == PasswordStrength.STRONG) {
            System.out.println("Test Case 4 "+pw+"Passed: Short password is STRONG.");
        } else {
            System.out.println("Test Case 4 "+pw+"FAILED: Expected STRONG but got " + result4);
        }
        // --- เขียน Test Case อื่นๆ ต่อ ---

        System.out.println("--------------------------------");
    }
}
