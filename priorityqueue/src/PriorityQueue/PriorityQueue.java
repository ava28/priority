package PriorityQueue;

import Excepciones.IsEmptyException;
import List.DoubleLinkedList;
import java.util.ArrayList;

public class PriorityQueue<T> {

    ArrayList<DoubleLinkedList> queue;
    
   
    public static enum prioridad {muy_alta, alta, media, baja, muy_baja}
    

    public PriorityQueue() {
        
        int size= prioridad.values().length;
        
        queue=new ArrayList<>(size);
        
        for (int i = 0; i < size; i++) {
            queue.add(new DoubleLinkedList());
        }
    }

    public void Print() {
        System.out.println("-----Prioridad-----");

        for (int i = 0; i < queue.size(); i++) {
            try {
                queue.get(i).IsEmpty();
                System.out.print("Prioridad " + prioridad.values()[i] + ": ");
                for (Object d : queue.get(i)) {
                    System.out.print("\t" + d);
                }
                System.out.println("");
            } catch (IsEmptyException e) {
                System.out.println("Prioridad " + prioridad.values()[i] + " vacia.");
            }
        }
        System.out.println("-------------------");

    }

    public void Remove(int priority) {
        if (priority >= 0 && priority < queue.size()) {
            System.out.println("Limpiando la prioridad: " + prioridad.values()[priority]);
            try {
                queue.get(priority).IsEmpty();
                System.out.println(queue.get(priority).RemoveFirst());
            } catch (IsEmptyException e) {
                System.out.println("La prioridad " + prioridad.values()[priority] + " esta vacia.");
            }
        }
    }
     
    public void Insert(int priority, double dato) {
        queue.get(priority).Add(dato);
    }

    public void Random() {
        for (int i = 0; i < 20; i++) {
            int x = (int) (Math.random() * 5);
            double random = (double) (Math.random() * 20) + 1;
            Insert(prioridad.values()[x].ordinal(), random);
        }
    }
    
        
}
