public class CalculadoraOp {
    public double somar(double num1, double num2){
        return num1 + num2;
    }

    public double subtrair(double num1, double num2){
        return num1 - num2;
    }

    public double multiplicar(double num1, double num2){
        return num1 * num2;
    }

    public double dividir(double num1, double num2){
        if(num2 != 0){
            return num1 / num2;
        }else{
            throw new ArithmeticException("Erro: Divisão por 0");
        }
    }

    public double elevar (double num1, double num2){
        return Math.pow(num1,num2);
    }

    public double raiz (double num){
        return Math.sqrt(num);
    }
}
