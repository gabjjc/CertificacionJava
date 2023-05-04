/*
    File name should be  equals to  Name of the class  (public). 
*/

public class Unidad1{
    public static void main(String args[]){
    System.out.println("Hola Mundo");
    }

}

/*
 File can have other class , but only one public
*/
class Extra{

}

/*   DON`T COMPILE
    public class Extra1{

    }
*/
//Unidad1.java:19: error: class Extra1 is public, should be declared in a file named Extra1.java
