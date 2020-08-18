
package com.loan;

import com.transact.*;

public class LoanAccount {

    
    public static void main(String[] args) {
        
        LoanAccount omg=new LoanAccount();
        double a=Double.parseDouble(args[0]);
        double b=Double.parseDouble(args[1]);
       
        omg.doTransaction(a,b);
        //System.out.println(args.length);
    }
    static void doTransaction(double n,double m){
     Transcation obj=new Transcation();
     System.out.println("amount credited "+obj.credit(n));
     System.out.println("amount debited "+obj.debit(m));
    }
   
}