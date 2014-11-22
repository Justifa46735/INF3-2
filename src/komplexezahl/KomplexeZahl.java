
package komplexezahl;

/**
 * @name : KomplexeZahl
 *
 * @author: konstantin
 * @date : 22.11.2014
 *
 * @brief : Klasse durch Darstellung einer komplexen Zahl
 *
 */
public class KomplexeZahl
{
    private double re;
    private double im;

    /**
     *
     * @param re RealTeil
     * @param im ImaginaerTeil
     */
    public KomplexeZahl(double re, double im)
    {
        this.re = re;
        this.im = im;
    }

    /**
     * 
     * @param c komplexe Zahl
     */
    public KomplexeZahl(KomplexeZahl c)
    {
        if (c != null)
        {
            this.re = c.getReal();
            this.im = c.getImag();
        }
    }

    /**
     * 
     * @return RealTeil dieser komplexen Zahl
     */
    public double getReal()
    {
        return re;
    }

    /**
     * 
     * @return ImaginaerTeil dieser komplexen Zahl
     */
    public double getImag()
    {
        return im;
    }
}
