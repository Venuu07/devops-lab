package com.devops;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Calculator calc = new Calculator();
        System.out.println("🚀 DevOps Calculator App Started...");
        System.out.println("Test Calculation: 10 + 20 = " + calc.add(10, 20));
        
        // This infinite loop keeps the Docker container alive for Kubernetes
        while (true) {
            Thread.sleep(10000); 
        }
    }
}