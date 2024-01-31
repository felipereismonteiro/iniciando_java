package java_source_code_classes.src.br.com.alura.desafios.desafio2;

public class ConversorMoeda implements ConversaoFinanceira{
    @Override
    public double converterDolarParaReal(double dolar) {
        return dolar * 5.4;
    }
}
