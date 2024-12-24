package controlStatement.looping.forloop;

public class Demo12 {
    public static void main(String[] args) {
        int count = 0;
        for(int i=100;i<=500;i=i+5) {
            System.out.println(i);
            count++;
        }
        System.out.println("number of iteration"+count);
    }
  }

