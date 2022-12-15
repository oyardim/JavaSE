
package logic;

import model.IO;
import model.MetricGewicht;


public class MetricGewichtLogic {
    MetricGewicht g1 = new MetricGewicht();
    
    public MetricGewichtLogic(){
        
    }
     public void kgToG(){
        System.out.println("Wert in kilogram eingeben:");                        
        g1.setInput(IO.getsScan().nextDouble());
        g1.setOutput(g1.getInput() * 1000);
        System.out.println("Wert in g : " +  g1.getOutput() + "\n");
    }
    public void kgToMg(){
        System.out.println("Wert in kilogram eingeben:");                        
        g1.setInput(IO.getsScan().nextDouble());
        g1.setOutput(g1.getInput() * 1000000);
        System.out.println("Wert in mg : " +  g1.getOutput() + "\n"); 
    }      
    public void gToKg(){
        System.out.println("Wert in gram eingeben:");                        
        g1.setInput(IO.getsScan().nextDouble());
        g1.setOutput(g1.getInput() / 1000);
        System.out.println("Wert in kg : " +  g1.getOutput() + "\n"); 
    }
    public void gToMg(){
        System.out.println("Wert in gram eingeben:");                        
        g1.setInput(IO.getsScan().nextDouble());
        g1.setOutput(g1.getInput() * 1000);
        System.out.println("Wert in mg : " +  g1.getOutput() + "\n");
    }
    public void mgToKg(){
        System.out.println("Wert in miligram eingeben:");                        
        g1.setInput(IO.getsScan().nextDouble());
        g1.setOutput(g1.getInput() / 1000000);
        System.out.println("Wert in kg : " +  g1.getOutput() + "\n"); 
    }
    public void mgToG(){
        System.out.println("Wert in miligram eingeben:");                        
        g1.setInput(IO.getsScan().nextDouble());
        g1.setOutput(g1.getInput() / 1000);
        System.out.println("Wert in g : " +  g1.getOutput() + "\n"); 
    }
}
    
