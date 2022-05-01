package PIA;

public class TuringMachine {

    public static void main(String[] args) {}
    
    public static char[] reasignar(String cadena){
        char [] banda = new char[cadena.length()+2];
        banda[0] = '-';
        banda[cadena.length()+1] = '-';
        for(int x = 1 ; x<=cadena.length() ; x++){
            banda[x] = cadena.charAt(x-1);
        }
        return banda;
    }
    
    public static boolean validar(char[] banda){
        int p = 0;
        int state = 0;
        while(p!=-1){
            switch(state){
                case 0:
                    state = 1;
                    banda[p] = '-';
                    p++;
                    break;
                case 1:
                    if(banda[p]=='a'){
                        state = 2;
                        banda[p]='-';
                        p++;
                    }else if(banda[p]=='b'){
                        state = 4;
                        banda[p] = '-';
                        p++;
                    }else return false;
                    break;
                case 2:
                     if(banda[p]=='a'){
                        state = 3;
                        banda[p]='-';
                        p++;
                    }else return false;
                    break;
                case 3:
                    if(banda[p]=='a'){
                        state = 2;
                        banda[p]='-';
                        p++;
                    }else if(banda[p]=='b'){
                            state = 4;
                            banda[p] = '-';
                            p++;
                        }else return false;
                    break; 
                case 4:
                     if(banda[p]=='b'){
                        state = 5;
                        banda[p]='-';
                        p++;
                    }else return false;
                    break;
                case 5:
                     if(banda[p]=='b'){
                        state = 6;
                        banda[p]='-';
                        p++;
                    }else return false;
                    break;
                case 6:
                    if(banda[p]=='-'){
                        p = -1;
                    }else return false;
                    break;
            }
        }
        return true;
    }
}