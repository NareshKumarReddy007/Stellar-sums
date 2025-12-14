/*A password is called Perfect Password if it satisfies ALL the following conditions:
Length must be exactly 9
It must contain at least one lowercase letter
It must contain at least one uppercase letter
It must contain at least one digit
It must contain at least one special character
Special character means not a letter and not a digit*/


import java.util.*;
class PerfectPassword
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String pwd = sc.next().trim();
        if(pwd.length()!=9){
            System.out.println("Not a Perfect Password");
            return;
        }
        boolean hasLower=false;
        boolean hasUpper=false;
        boolean hasDigit=false;
        boolean hasSpecial=false;

        for(char c : pwd.toCharArray()){
            if(Character.isLowerCase(c)) hasLower=true;
            else if(Character.isUpperCase(c)) hasUpper=true;
            else if(Character.isDigit(c)) hasDigit=true;
            else if(c!=' ') hasSpecial=true;
        }
        if(!hasLower || !hasUpper || !hasDigit || !hasSpecial){
            System.out.println("Not a Perfect Password");
        }
        else{
            System.out.println("Perfect Password");
        }
    }
}
