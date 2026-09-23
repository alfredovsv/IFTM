import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        //String t = "";
        while (s.hasNextLine()){
             //t += s.nextLine() + "\n";
        
        
            String t = s.nextLine();
            String novo = "";
            boolean maisculo = true;
            
            //Tranformar em dancente
            for (int i = 0; i < t.length(); i++){
                char letra = t.charAt(i);
                
                //Dif tab asc 32
                if(maisculo == true){
                    if (letra == ' ')
                        novo += letra;
                    else if (letra >= 'a' && letra <= 'z'){
                        novo += (char) (letra - 32); //Altera para maisculo
                        maisculo = false;
                    }else {
                        novo += letra;
                        maisculo = false;
                    }
                }else{
                    if (letra == ' ')
                        novo += letra;
                    else if (letra >= 'A' && letra <= 'Z'){
                        novo += (char) (letra + 32); // Altera para minusculo
                        maisculo = true;
                    }else{
                        novo += letra;
                        maisculo = true;
                    }
                }
    
            }
            
            System.out.println(novo);
        }
        
    }
}