package komplexezahl;

/**
 * name : KomplexeZahl
 *
 * @author: konstantin
 * date : 22.11.2014
 *
 * brief : Klasse zur Darstellung einer komplexen Zahl
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
     * @param c complex number
     *
     * @return complex number
     */
    public KomplexeZahl add(KomplexeZahl c)
    {
        return add(c.getReal(), c.getImag());
    }

    /**
     *
     * @param real RealTeil
     * @param imag ImaginaerTeil
     *
     * @return complex number
     */
    public KomplexeZahl add(double real, double imag)
    {
        KomplexeZahl c = new KomplexeZahl();
        c.im = this.im + imag;
        c.re = this.re + real;

        return c;
    }

    /**
     * subtrahiert eine komplexe Zahl von der akktuellen
     *
     * @param c complex number
     *
     * @return KomplexeZahl
     */
    public KomplexeZahl sub(KomplexeZahl c)
    {
        return sub(c.getReal(), c.getImag());
    }

    /**
     * subtrahiert eine komplexe Zahl von der akktuellen
     *
     * @param real RealTeil
     * @param imag ImagTeil
     *
     * @return KomplexeZahl
     */
    public KomplexeZahl sub(double real, double imag)
    {
        KomplexeZahl c = new KomplexeZahl();
        c.im = this.im - imag;
        c.re = this.re - real;

        return c;
    }

    /**
     *
     * @param a complex number
     *
     * @return KomplexeZahl
     */
    public KomplexeZahl multi(KomplexeZahl a)
    {
        double real;
        double imag;

        real = this.getReal() * a.getReal() - this.getImag() * a.getImag();
        imag = this.getReal() * a.getImag() + this.getImag() * a.getReal();

        return new KomplexeZahl(real, imag);
    }

    /**
     *
     * @param re
     * @param im
     *
     * @return KomplexeZahl
     */
    public KomplexeZahl multi(double re, double im)
    {
        return this.multi(new KomplexeZahl(re, im));
    }

    /**
     * dividieren zwei komplexer zahlen
     *
     * @param a complex number
     *
     * @return KomplexeZahl
     */
    public KomplexeZahl div(KomplexeZahl a)
    {
        KomplexeZahl c = new KomplexeZahl();

        c.setReal((this.getReal() * a.getReal() + this.getImag() * a.getImag())
                / (Math.pow(a.getReal(), 2) + Math.pow(a.getImag(), 2)));

        c.setImag((this.getImag() * a.getReal() - this.getReal() * a.getImag())
                / (Math.pow(a.getReal(), 2) + Math.pow(a.getImag(), 2)));

        return c;
    }

    /**
     * dividieren zwei komplexer zahlen
     *
     * @param re
     * @param im
     *
     * @return KomplexeZahl
     */
    public KomplexeZahl div(double re, double im)
    {
        return this.div(new KomplexeZahl(re, im));
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
     * @return complex number as String (re + im * j)
     */
    public String print()
    {
        StringBuilder msg = new StringBuilder();

        msg.append("(");
        msg.append(getReal());
        if (getImag() >= 0)
        {
            msg.append(" + j * ");
        }
        else
        {
            msg.append(" - j * ");
        }
        msg.append(Math.abs(getImag()));
        msg.append(")");

        return msg.toString();
    }
}
