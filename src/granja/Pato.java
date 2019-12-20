
package granja;

/**
 *
 * @author Cesar Fernandez
 */
public class Pato {
    private int Ficha = 2;
    private int Cont;
    private String Habla = "Cua";

    public int getCont() {
        return Cont;
    }

    public void setCont(int Cont) {
        this.Cont = Cont;
    }

    public String getHabla() {
        return Habla;
    }

    public void setHabla(String Habla) {
        this.Habla = Habla;
    }

    public void Hablar() {
        System.out.println(Habla);

    }

    public void SumaCont() {
        Cont = Cont + 1;

    }

    public int getFicha() {
        return Ficha;
    }

    public void setFicha(int Ficha) {
        this.Ficha = Ficha;
    }

}
