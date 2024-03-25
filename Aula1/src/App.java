public class App {

    public int somar(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    
    public int multiplicar(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int dividir(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public int subtrair(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public String selecionaMetodo(int tipoDesejado) {
        int firstNumber = 1;
        int secondNumber = 1;
        String valorFinal = ""; 
        switch (tipoDesejado) {
            case 1:
                valorFinal = Integer.toString(somar(firstNumber, secondNumber));
                return valorFinal;
            case 2:
                valorFinal = Integer.toString(subtrair(firstNumber, secondNumber));
                return valorFinal;
            case 3:
                valorFinal = Integer.toString(multiplicar(firstNumber, secondNumber));
                return valorFinal;
            case 4:
                valorFinal = Integer.toString(dividir(firstNumber, secondNumber));
                return valorFinal;
            default:
                break;
        }
        return valorFinal;
    }
}
