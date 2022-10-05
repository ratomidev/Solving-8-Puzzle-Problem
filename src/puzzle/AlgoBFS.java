/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package puzzle;

import java.io.IOException;
import java.util.*;

/**
 *
 * @author MRtou
 */
public class AlgoBFS {
      public LinkedList<State> queue = new LinkedList<State>();
      public LinkedList<State> visited = new LinkedList<State>();
      public  void algoBegin(Player player,State init,State goal){
        
          this.queue.add(init);
          
          while(!this.queue.isEmpty()){
          
          State first =this.queue.peek();
          if(!exist(first)){
               //  System.out.println("This Parent is Already Visited");
               //  first.display();
                 this.queue.removeFirst(); 
                 continue; 
          }
          this.visited.add(first); 
          //System.out.println("This Is The Parent is ");
          first.display();
          if(State.compare(first, goal)){
                 System.out.println("En Fin , La Solution Est Trouvé");
                 return ; 
          }
    
             
                  player.action(this.queue,this.visited,first);
             
          this.queue.removeFirst(); 
          
           
         }
      }
      public boolean exist(State state){
            for(int i=0; i<this.visited.size(); i++){
                  if(State.compare(this.visited.get(i), state)){
                        return false ; 
                  }
            }
            return true ; 
      }
     
}