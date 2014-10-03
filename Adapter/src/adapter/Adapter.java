/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author ahmed_000
 */
public class Adapter {
    
    public interface Operations {
        public double calculate(double x, double y, char operation);
    }
    
    public interface AdvancedOperations {
        public double product(double x, double y);
        public double divide(double x, double y);
    }
    
    public static class Scientific implements AdvancedOperations {
        @Override
        public double product(double x, double y) {
            return x * y;
        }
        
        @Override
        public double divide(double x, double y) {
            return x / y;
        }
    }
    
    public static class CalculatorAdapter implements Operations {
        Scientific scientificMode;
        
        public CalculatorAdapter(String mode) {
            if (mode.equals("Scientific")) {
                this.scientificMode = new Scientific();
            }
        }
        
        @Override
        public double calculate(double x, double y, char operation) {
            if (operation == '*') {
                System.out.println("Scientific");
                return this.scientificMode.product(x, y);
            } else if(operation == '/') {
                System.out.println("Scientific");
                return this.scientificMode.divide(x, y);
            } 
            
            return 0.0;
        }
    }
    
    public static class Calculator implements Operations {
        CalculatorAdapter calculatorAdapter;
        
        @Override
        public double calculate(double x, double y, char operation) {
            if (operation == '*' || operation == '/') {
                this.calculatorAdapter = new CalculatorAdapter("Scientific");
                return this.calculatorAdapter.calculate(x, y, operation);
            } else {
                if (operation == '+') {
                    System.out.println("Standard");
                    return x + y; //Standard
                } else if (operation == '-') {
                    System.out.println("Standard");
                    return x - y; // Standard
                }
            }
            
            return 0.0;
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator cal = new Calculator();
        
        System.out.println(cal.calculate(2, 3, '+'));
        System.out.println(cal.calculate(4, 5, '*'));
        System.out.println(cal.calculate(3, 5, '/'));
        System.out.println(cal.calculate(10, 10, '-'));
        
    }
    
}
