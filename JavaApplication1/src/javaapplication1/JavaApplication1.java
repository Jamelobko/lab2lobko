/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;



/**
 *
 * @author Student
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count = 0, count1 = 0;
        int i = 0;
        String example  =   "Hello, my name is George. I live in Odessa, and i love this city.";
        char[] glasnoe = {'a','o','u','i','e'};
        char[] chlen = example.toCharArray();
        for(i = 0; i < example.length(); i++){
            for(int j = 0; j<5; j++)
            if(chlen[i] == glasnoe[j]){
                count ++;
            }
            if(chlen[i] == '.'){
                break;
            }
            
}
         System.out.println(count);
        for(;i < example.length(); i++){
            for(int j = 0; j<5; j++)
            if(chlen[i] == glasnoe[j]){
                count1 ++;
            }
             
}
        System.out.println(count1);
        if(count>count1){
        System.out.println("count>count1");          
    }else{
            System.out.println("count<count1"); 
        }
    }
}
