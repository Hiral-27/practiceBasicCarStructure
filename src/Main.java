public class Main {
    public static void main(String[] args) {
        J01BasicStructure audi= new J01BasicStructure();
        audi.color= "black";
        audi.model= "A3";
        audi.power= "5000cc";

        J02Engine X= new J02Engine();
        X.cylinders="8";
        X.size="1234cc";
        X.weight="6453k";


        J03Color color= new J03Color();
        color.colorLights="True";
        color.colorTyre="false";
        color.colorWindow="True";

        J03Lights neon= new J03Lights();
        neon.color="red";
        neon.size="15cm";
        neon.intensity="7675lumi";
        

    }
}