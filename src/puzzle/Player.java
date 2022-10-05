
package puzzle;

import java.util.LinkedList;

/**
 *
 * @author MRtou
 */
public class Player {
      
      public void action(LinkedList<State> queue ,LinkedList<State> visited, State state){
            State s = new State(); 
            state.copy(s);
            
            int empX=0,empY=0;
            int X =0 ; 
            int Y=0; 
            for(int i=0; i<3; i++){
                 for(int j=0; j<3; j++){
                       if(state.getMat()[i][j]==0){
                             empX =i ; 
                             empY=j; 
                             break ; 
                       }
                 }
            }
            X = empX-1;
            Y= empY ; 
            if(X>=0 && X<3){
                  s.mat[empX][empY]=s.mat[X][Y]; 
                  s.getMat()[X][Y]=0;
                   queue.add(s); 
           }
            s = new State(); 
            state.copy(s);
            X = empX+1;
            Y= empY ;
            if(X>=0 && X<3){
                  s.mat[empX][empY]=s.mat[X][Y]; 
                  s.getMat()[X][Y]=0;
                  queue.add(s); 
             }

            s = new State(); 
            state.copy(s);
            X = empX;
            Y= empY-1 ;
            if(Y>=0 && Y<3) {
                  s.mat[empX][empY]=s.mat[X][Y]; 
                  s.getMat()[X][Y]=0;
                  queue.add(s); 
            }

            s = new State(); 
            state.copy(s);
            X = empX;
            Y= empY+1 ;
            if(Y>=0 && Y<3){
                  s.mat[empX][empY]=s.mat[X][Y]; 
                  s.getMat()[X][Y]=0;
                  queue.add(s); 
          }
      }
}
