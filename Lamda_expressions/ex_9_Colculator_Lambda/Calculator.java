package Lamda_expressions.ex_9_Colculator_Lambda;

import lombok.Getter;

@Getter
public class Calculator {
     static class CalculatorMethod {
        public double sum(double a, double b) {
            return a + b;
        }

        public double minus(double a, double b) {
            return a - b;
        }

        public double calc(MyExecutor myExecutor, double a, double b) {
            return myExecutor.calc(a, b);
        }
    }
}
