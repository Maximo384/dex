package com.company;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Maximo384 on 02/06/2016.
 */
public class testMain {
    @Test
    public void testMain(){
        Main.p = "hola";
        Assert.assertEquals("Error",true,Main.nova_lletra('a'));
    }
}
