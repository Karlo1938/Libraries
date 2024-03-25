package com.karlo.methods;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


//Este algoritmo criptográfico se considera débil, se recomienda usar otros.

public class Md5 {
    public String md5(String input){
        try {
            MessageDigest md = MessageDigest.getInstance("MD5"); //se crea una instancia de un objeto MessageDigest con el algoritmo md5-
            byte [] messageDigest = md.digest(input.getBytes()); //la entrada se convierte en un array de bytes y estos son encriptados gracias al método digest. El resultado es guardado en un array de bytes.
            BigInteger intHash = new BigInteger( 1 , messageDigest); //se crea un objeto BigInteger para almacenar el hash creado y convertido en BigInteger.
            String stringHash = intHash.toString(16); //se pasa el BigInteger a un String hexadecimal, pues el cifrado md5 tiene una longitud constante de 128 bits almacenados en 32 caracteres hexadecimales (32 hexadecimales x 4 bits).  
            //luego, es necesario comprobar si es que se cumplen los 32 carácteres. Si no se cumple se concatenarán ceros al principio del string hasta completar 32 carácteres.
            
            while (stringHash.length()!=32){
                stringHash = "0" + stringHash;
            }
        } 
        catch (NoSuchAlgorithmException e){
            throw new RuntimeException (e); //algoritmo criptográfico no disponible.
        }

        
            
        
        return "";
        
    }
}
