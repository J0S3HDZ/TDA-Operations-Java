public class Main {

    static void corrimiento(int[]list){
     int ultimo=list[list.length-1];
        for(int ix=list.length-1; ix>0; ix--){
            list[ix]=list[ix-1];
        }
        list[0]=ultimo;
    }

    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
       
         boolean exist = false;
                
        System.out.println("1. Busqueda y Recorrido");
        System.out.println("2. Insercion");
        System.out.println("3. Eliminación");
        System.out.println("4. Invertir");
        System.out.println("5. Corrimiento");
        System.out.println("6. Salir");
        int select = sc.nextInt();
                
        System.out.println("--------------------------");

        switch(select){
            case 1:
              System.out.println("Tamaño del arreglo: ");
              int tam = sc.nextInt();
              System.out.println("--------------------------");

          int n[] = new int[tam];
         
               for(int i = 0; i < n.length;i++){ 
               n[i]= (int)(Math.random()*9+1);
           }
           System.out.println("Valores Ingresados (Recorrido): ");
           for(int o = 0; o < n.length; o++){
               System.out.print("["+n[o]+"] ");
           }
          System.out.println("");
          System.out.println("--------------------------");
                System.out.println("Qué número deseas buscar: ");
                int num = sc.nextInt();
                   
           for(int p = 0;p < n.length;p++){ 
            if(num == n[p]){ 
                int valor = p+1;
                System.out.println("El número está en la columna : "+valor) ;
                exist = true;
            }
           }
           if(exist == false){
               System.out.println("El número no existe.");
           }

                break;
            case 2:
                System.out.println("Tamaño arreglo: ");
                int a2 = sc.nextInt();
                
                System.out.println();
                System.out.println("¿Cuantos espacios se van a incrementar?");
                int incre = sc.nextInt();
                     
                a2 = a2+incre;   
                
               int[]r1 = new int[a2];
               for(int ty = 0 ; ty< (r1.length-incre); ty++){l
                   r1[ty] = (int)(Math.random()*9+1); 
                   System.out.print("["+r1[ty]+"]");
               }
               System.out.println();
             
           for(int k = 0; k < r1.length; k++ ){
               System.out.print("["+r1[k]+"]");
           }
            System.out.println();
                break;
                
            case 3:
            
                System.out.println("Tamaño del arreglo: ");
                int a3 = sc.nextInt();
                
                int []r2 = new int[a3];

                for(int val = 0; val <r2.length; val++){
                    r2[val] = (int)(Math.random()*9+1);
                    System.out.print("["+r2[val]+"]");
                }
                System.out.println();
                System.out.println("---------------------------");
                System.out.println("Posicion a eliminar: ");
                int ee = sc.nextInt();
                ee = ee -1; 
                
                for(int num1 = ee; num1 < (r2.length-1); num1++){
                 r2[num1] = r2[num1+1];      
                    }
                for(int w = 0; w < r2.length-1 ; w++){
                    System.out.print("["+r2[w]+"]");
                }
             System.out.println();
                break;
            case 4:
                System.out.println("Tamaño de arreglo: ");
                int tama = sc.nextInt();
                int[]inv = new int[tama];
           
                for(int most = 0; most < inv.length;most++){
                    inv[most]=(int)(Math.random()*9+1);
                    System.out.print("["+inv[most]+"]");
                }
                
                int auxx;
                
                for(int ii = 0; ii<inv.length/2;ii++){
                    auxx = inv[ii];
                    inv[ii] = inv[inv.length-1-ii];
                    inv[inv.length-1-ii] = auxx;
                }
                System.out.println();
                System.out.println("Arreglo invertido:");
                for(int most1 = 0 ; most1 < inv.length; most1++){
                    System.out.print("["+inv[most1]+"]");
                }
                System.out.println();
          break;
            case 5:
                
                System.out.println("Tamaño del arreglo: ");
                int tamx = sc.nextInt();
                
                int [] corri = new int [tamx];
                
                System.out.println("Arreglo original:");
                for(int cr = 0 ; cr < corri.length; cr++){
                    corri[cr] = (int)(Math.random()*9+1);
                    System.out.print("["+corri[cr]+"]");
                    
                }
                
               corrimiento(corri);
               System.out.println();
               System.out.println("Arreglo con corrimiento a la derecha");
               for(int pp = 0 ; pp < corri.length ; pp ++){
                   System.out.print("["+corri[pp]+"]");
               }
               System.out.println();
                break;
                
            case 6:
                System.err.println("Has salido correctamente.");
                System.exit(0);
            default:
                System.out.println("<No existe la opcion seleccionada>");
        }        


        }}
