package com.cjava.unidad1;
import com.cjava.unidad1.extras.Unidad1Extra;

/*
    File name should be  equals to  Name of the class  (public). 
*/

public class Unidad1{
    public static void main(String args[]){

        Unidad1Extra extra  = new Unidad1Extra();
        System.out.println("Hola Mundo - " + extra.getStringFromUnidad1Extra() );
    }

}

/*
 File can have other class , but only one public
*/
class Extra{

public String unMetodo(){
    return "Hola Desde Clase extra";
}
}

/*   DON`T COMPILE
    public class Extra1{

    }
*/
//Unidad1.java:19: error: class Extra1 is public, should be declared in a file named Extra1.java
