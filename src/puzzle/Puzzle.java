/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package puzzle;

import java.awt.List;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author MRtou
 */
public class Puzzle {

      /**
       * @param args the command line arguments
       */
      
    
      public static void main(String[] args) {
           
           
            State initState =new State(4,3,6,7,1,8,5,0,2);
            State goalState =new State(1,2,3,4,5,6,7,8,0);
            Player player= new Player();
            AlgoBFS algorithm =new AlgoBFS(); 
            algorithm.algoBegin(player, initState, goalState);
            }
      }
