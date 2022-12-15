package model;

public class MetricLaenge {
    //Attribute
    public double input;       //m
    public double output;      //cm
    
    //Kons
    public MetricLaenge() {
        
    }
    
    //Methoden
    /*
    get: sich holen : zugriff : reinschauen : bekommen : anfordern : zurückgeben -->Datentyp
    set: einsetzen : breitstellen : einstellen : speichern : festlegen -->void
    */
    
    public double getInput(){
        
        return input;
    }
    public void setInput(double input){   
        
        this.input = input;
    }
    public double getOutput(){
        
        return output;
    }
    public void setOutput(double output){
        
        this.output = output;
    }
}
