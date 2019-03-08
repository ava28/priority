package PriorityQueue;

public class main {

    static PriorityQueue<Double> queue = new PriorityQueue<>();

    public static void main(String[] args) {
      queue.Insert(3, 16d);
      queue.Insert(2, 12d);
      queue.Insert(0, 10d);
      queue.Insert(1, 21d);
      queue.Insert(4, 30d);
      
      queue.Insert(3, 14d);
      queue.Insert(1, 17d);
      
//queue.Random();
        queue.Print();
        queue.Remove(0);
        queue.Print();

    }

}
