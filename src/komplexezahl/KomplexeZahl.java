
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
     * @param real
     * @param imag
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
     * @return 
     */
    public KomplexeZahl subKomplex(double real, double imag)
    {
        KomplexeZahl c = new KomplexeZahl();
        c.im = this.im - imag;
        c.re = this.re - real;
        
        return c;
    }
    
    public KomplexeZahl multi(KomplexeZahl a, KomplexeZahl b)
    {
      double real;
      double im;
      real = a.getReal() * b.getReal() - a.getImag() * b.getImag();
      im = a.getReal() * b.getImag() + a.getImag() * b.getReal();
      return new KomplexeZahl(real,im);
    }
    //Kommentar
    public KomplexeZahl div(KomplexeZahl a, KomplexeZahl b)
    {
      double real;
      real = (a.getReal()*b.getReal() + a.getImag()*b.getImag())/
             (java.lang.Math.pow(b.getReal(), 2) + java.lang.Math.pow(b.getImag(), 2));
      im = (a.getImag()*b.getReal() - a.getReal()*b.getImag())/
           (java.lang.Math.pow(b.getReal(), 2) + java.lang.Math.pow(b.getImag(), 2));
      return new KomplexeZahl(real,im);     
    }

  /**
   * @param re the re to set
   */
  public void setRe(double re)
  {
    this.re = re;
  }

  /**
   * @param im the im to set
   */
  public void setIm(double im)
  {
    this.im = im;
  }
    
}
