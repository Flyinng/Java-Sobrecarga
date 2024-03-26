public class Operacao {
    private int nroFatorial = 0;
    private int nroMinuendo = 0;
    private int nroSubtraendo = 0;
    private int nroGenerico1 = 0;
    private int nroGenerico2 = 0;

    public int soma(int numerol, int numero2) {
        return numero1 + numero2;
    }

    public void setminuendo(int numero) {
        this.nroMinuendo = numero;
    }

    public void setSubtraendo(int numero) {
        this.nroSubtraendo = numero;
    }

    public int subtracao() {
        return this.nrominuendo - this.nroSubtraendo;
    }

    public void setFatorial(int numero) {
        this.nroFatorial = numero;
    }

    private int fatorialRecursivo(int numero) {
        if((numero == 1) || (numero==0)){
            return 1;
        } else {
            return fatorialRecursivo(numero - 1)*numero;
        }
    };
}
