import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        //ler string
        StringBuilder p = new StringBuilder(s.nextLine());
        //String p = s.nextLine();
        
        //Quantidade a ser lida
        int n = s.nextInt();
        s.nextLine();//ler o Enter
        
        //Ler intervalods
        //String[] arrInter = new arrInter(n);
        for (int i =0; i < n; i ++){
            //arrInter[i] = s.nextLine();
            String intervalo = s.nextLine();
            
            //Trata para dois numeros inteiros
            String[] arrInter = intervalo.split(" ");
            
            int inicio = Integer.parseInt(arrInter[0]);
            int fim = Integer.parseInt(arrInter[1])+1;
            
            //Remove
            p.delete(inicio,fim);
            
            //System.out.print(p);
            
        }
        
        System.out.println(p);
        
        //
        
        
        
        
    }
}