package logic;

import model.IO;
import model.MetricLaenge;

public class MetricLaengeLogic {
    //Attr
    MetricLaenge ml = new MetricLaenge();
    
    
    //Kons
    public MetricLaengeLogic(){
        
    }
    
    //Methoden
    public void mToCm(){
        System.out.println("Wert in meter eingeben:");
        ml.setInput(IO.getsScan().nextDouble());
        //this.input = input;
        //this.input = 20;
        ml.setOutput(ml.getInput() * 100);
        System.out.println("Wert in cm : " +  ml.getOutput() + "\n");
    }
    public void mToMM(){
        System.out.println("Wert in meter eingeben:");
        ml.setInput(IO.getsScan().nextDouble());
        //this.input = input;
        //this.input = 20;
        ml.setOutput(ml.getInput() * 1000);
        System.out.println("Wert in mm : " +  ml.getOutput() + "\n"); 
    }      
    public void cmToM(){
        System.out.println("Wert in cm eingeben:");
        ml.setInput(IO.getsScan().nextDouble());
        //this.input = input;
        //this.input = 20;
        ml.setOutput(ml.getInput() / 100);
        System.out.println("Wert in meter : " +  ml.getOutput() + "\n"); 
    }
    public void cmToMm(){
        System.out.println("Wert in cm eingeben:");
        ml.setInput(IO.getsScan().nextDouble());
        //this.input = input;
        //this.input = 20;
        ml.setOutput(ml.getInput() * 10);
        System.out.println("Wert in mm : " +  ml.getOutput() + "\n"); 
    }
    public void mmToM(){
        System.out.println("Wert in mm eingeben:");
        ml.setInput(IO.getsScan().nextDouble());
        //this.input = input;
        //this.input = 20;
        ml.setOutput(ml.getInput() / 100);
        System.out.println("Wert in meter : " +  ml.getOutput() + "\n"); 
    }
    public void mmToCm(){
        System.out.println("Wert in mm eingeben:");
        ml.setInput(IO.getsScan().nextDouble());
        //this.input = input;
        //this.input = 20;
        ml.setOutput(ml.getInput() / 10);
        System.out.println("Wert in cm : " +  ml.getOutput() + "\n"); 
    }
}
