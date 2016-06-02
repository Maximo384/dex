package com.company;

/**
 * Created by Maximo384 on 02/06/2016.
 */
public class nova {
    static protected String[] paraules = {"hola","programació","casa"};
    static protected int index;
    public static final int Longitut = paraules[index].length();
    static protected String p;

    /**
     * Metode bolea que rep una lletra nova i torna si la lletra esta a la paraula o no
     * @param nova Es la nova lletra
     * @return true o false(true en cas de que la lletra estigui a la paraula i false si no)
     */
    static public boolean nova_lletra(char nova) {
        boolean trobada = false;
        String paraula_old = p;
        p = "";
        for (int i=0; i<Longitut; i++) {
            char Caracter = paraules[index].charAt(i);
            if (Caracter == nova) {
                p += Caracter;
                trobada = true;
            }
            else {
                p += paraula_old.charAt(i);
            }
        }
        return trobada;
    }
}
