package komplexezahl;

/**
 * @name : KomplexeZahl
 *
 * @author: konstantin
 * @date : 22.11.2014
 *
 * @brief : Klasse zur Darstellung einer komplexen Zahl
 *
 */
public class KomplexeZahl
{
    private double re;
    private double im;

    /**
     * default constructor: init re and im with 0
     */
    public KomplexeZahl()
    {
        this.re = 0;
        this.im = 0;
    }

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

    /**
     *
     * @param real RealTeil
     * @param imag ImaginaerTeil
     *
     * @return
     */
    public KomplexeZahl addKomplex(double real, double imag)
    {
        KomplexeZahl c = new KomplexeZahl();
        c.im = this.im + imag;
        c.re = this.re + real;

        return c;
    }

    /**
     * subtrahiert eine komplexe Zahl von der akktuellen
     *
     * @param real
     * @param imag
     *
     * @return
     */
    public KomplexeZahl subKomplex(double real, double imag)
    {
        KomplexeZahl c = new KomplexeZahl();
        c.im = this.im - imag;
        c.re = this.re - real;

        return c;
    }

    /**
     *
     * @param a 
     * @param b
     *
     * @return
     */
    public KomplexeZahl multi(KomplexeZahl a, KomplexeZahl b)
    {
        double real;
        double imag;
        real = a.getReal() * b.getReal() - a.getImag() * b.getImag();
        imag = a.getReal() * b.getImag() + a.getImag() * b.getReal();
        return new KomplexeZahl(real, imag);
    }

    /**
     *
     * @param a
     * @param b
     *
     * @return
     */
    public KomplexeZahl div(KomplexeZahl a, KomplexeZahl b)
    {
        double real;
        real = (a.getReal() * b.getReal() + a.getImag() * b.getImag())
                / (java.lang.Math.pow(b.getReal(), 2) + java.lang.Math.pow(b.getImag(), 2));
        im = (a.getImag() * b.getReal() - a.getReal() * b.getImag())
                / (java.lang.Math.pow(b.getReal(), 2) + java.lang.Math.pow(b.getImag(), 2));
        return new KomplexeZahl(real, im);
    }

    /**
     * @param re the re to set
     */
    public void setReal(double re)
    {
        this.re = re;
    }

    /**
     * @param im the imag to set
     */
    public void setImag(double im)
    {
        this.im = im;
    }

    /**
     * 
     * @return abs of the complex number
     */
    public double abs()
    {
        double abs = Math.sqrt(Math.pow(getReal(), 2) + Math.pow(getImag(), 2));

        return abs;
    }
    
    /**
     * 
     * @return complex number as String -> (re + im * j)
     */
    public String print()
    {
        StringBuilder msg = new StringBuilder();
        
        msg.append("(");
        msg.append(getReal());
        if(getImag() >= 0)
        {
            msg.append(" + j * ");
        }
        else
        {
            msg.append(" - j * ");
        }
        msg.append(getImag());
        
        return msg.toString();
    }
}
