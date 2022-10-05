/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package puzzle;

/**
 *
 * @author MRtou
 */
public class State {
      int[][] mat ;
      int[] tab ; 
      
      public State(int... tab){
            this.tab= tab ; 
            this.mat = new int[3][3];
            int p =0; 
            for(int i=0; i<3; i++){
                  for(int j=0; j<3; j++){
                  if(p<tab.length){
                 this.mat[i][j]=tab[p];
                 p++; 
                  }
                  }
                  
            }
            }
      public int[][] getMat(){
            return this.mat ; 
      }
      
      public void display(){
            System.out.println("{");
            for(int i=0; i<3; i++) {
                  for(int j=0; j<3; j++){
                        System.out.print(this.mat[i][j]+" ");      
                  }
                  if(i==2)
                        System.out.println("\n}");
                  System.out.println("");
    }
}     
     
      public int heuristic(){
            int res=0;
            for(int i =0 ;i<8; i++){
                  if(this.tab[i]==i+1)
                        res++ ; 
            }
            
            return res ; 
      }
    
      public void copy(State s) {
           for(int i=0; i<3; i++) {
                 for(int j=0; j<3; j++) {
                       s.getMat()[i][j]=this.mat[i][j]; 
                 }
           } 
      }    
      public static boolean compare(State s1 , State s2){
            for(int i=0; i<3; i++){
                  for(int j=0; j<3; j++){
                        if(s1.getMat()[i][j]!=s2.getMat()[i][j])
                              return false; 
                  }
                  
            }
            return true ; 
      }
      
}
