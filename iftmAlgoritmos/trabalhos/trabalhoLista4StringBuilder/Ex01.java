import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        StringBuilder result = new StringBuilder();
        
        int n = s.nextInt();
        s.nextLine(); //ler o Enter
        
        String entrada = s.nextLine();
        String[] arrEnt = entrada.split(" ");
        n = arrEnt.length;
        
        for (int i = 0; i < n; i++){
            if (arrEnt[i].length() == 3){
                if(arrEnt[i].startsWith("OB")){//Aqui utilizei with
                    arrEnt[i] = "OBI"; //não vi necessidade de utilizar StringBuilder
                }else if(arrEnt[i].startsWith("UR")){//Aqui utilizei starts
                    arrEnt[i] = "URI";
                }
            }
           
            result.append(arrEnt[i]);
            
            //coloca espcaço se não for o ultimo
            if(i < n -1)
                result.append(" ");
        }
        
        System.out.println(result);
    }
}