
package methodoverriding;


public class Bank_Peoples extends Bank{
    int getInterestRate(){
        return 5;
    }
    double getInterestRate(int x){
        
        return x;
    }
}
