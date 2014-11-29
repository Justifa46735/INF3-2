/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import komplexezahl.KomplexeZahl;

/**
 *
 * @author Fabian
 */
public class Start
{
    private Start()
    {
        KomplexeZahl a = new KomplexeZahl(1, 2);
        KomplexeZahl b = new KomplexeZahl(5, -3);

        System.out.println("a = " + a.print());
        System.out.println("b = " + b.print());
        System.out.println("a + b = " + a.add(b).print());
        System.out.println("a - b = " + a.sub(b).print());
        System.out.println("a * b = " + a.multi(b).print());
        System.out.println("a / b = " + a.div(b).print());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("Start");
        new Start();
        System.out.println("End");
    }

}
