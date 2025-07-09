
package Arrays;
import static Libreria.Operaciones.sumar;

/**
 *
 * @author axel.l
 */
public class Arrays_Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
           int valorA = 5;
           int valorB = 10;
            
          System.out.println("result: " + + sumar(valorA, valorB));
        
        
        int[] arrayAyano;
        
        arrayAyano = new int[5];
        
        arrayAyano[0] = 1994;
        arrayAyano[1] = 2014;
        arrayAyano[2] = 2016;
        arrayAyano[3] = 2021;
        arrayAyano[4] = 2025;
        System.out.println("Label:" + arrayAyano[0]);
        
        for(int i = 0; i < arrayAyano.length; i++){
            System.out.println("Remarkable discogrpahy dates: " + arrayAyano[i]);
        }

        int [] arrayLapices = new int [10]; 
        
        String [] lateAlbum = new String[5];
        
            lateAlbum[0] =  " わたしたちへ	  ";
                        lateAlbum[1] =  "やさしいギター"   ;
                                    lateAlbum[2] = "季節の果物"    ;
                                                lateAlbum[3] =  "気分"   ;
                                                            lateAlbum[4] =  "月明り"   ;
                                                            
                                                            
        for(int i = 0; i < lateAlbum.length; i++){
            System.out.println("Titles " + lateAlbum[i]);
        }
        
        
        //Array Bidimensional:
        
        
        /* Inicialización directa:
        
        
        int[][] albumEras = { {2014, 2015, 2016}, {2017,2018,2019}, {2020, 2021,2023} };
        
        
        */
        
        /*Inicialización y asociación despúes*/
        int [][] albumEras = new int [3][3];
        
        albumEras[0][0] = 2014;
        albumEras[0][1] = 2015;
        albumEras[0][2] = 2016;
                
                
        albumEras[1][0] = 2017; 
        albumEras[1][1] = 2018;
        albumEras[1][2] = 2019;
                
        albumEras[2][0] = 2020;
        albumEras[2][1] = 2021;
        albumEras[2][2] = 2023;
                   
        
//        for(int i = 0; i < albumEras.length; i++ ){
//            
//            System.out.println("かねこあやの Eras: [" + (i + 1)+ "]:");
//            
//            for (int j = 0; j < albumEras[i].length; j++) {
//                System.out.println("Year: " + albumEras[i][j] );
//               
//            }
//        }  

        totalAlbumes(albumEras);
        
        salute("Axel");
//
//        System.out.println("Eras y Albumes de Kaneko: " + albumes);



         
    }
    
    
    public static int [][]totalAlbumes (int[][] calculo){
        
      /*int[][] albumEras = { {2014, 2015, 2016}, {2017,2018,2019}, {2020, 2021,2023} };*/

         for(int i = 0; i < calculo.length; i++ ){
            
            System.out.println("かねこあやの Eras: [" + (i + 1)+ "]:");
            
            for (int j = 0; j < calculo[i].length; j++) {
                System.out.println("Year: " + calculo[i][j] );
               
            }
        } 

            return calculo;


     }
    
    
    public static void salute (String text){
        System.out.println("おはよおうう " + text + " !");
    }
}



    