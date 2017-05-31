package pl.sda.main;


public class Main {

     public static void main(String[] args) {

          Bucket bucket = new Bucket();
          
          Consument consument = new Consument("consument", bucket);
          Producer producer = new Producer("producer", bucket);
          
          consument.start();
          producer.start();
          
          
     }

}
