public class Experiment {


    public int num1 = 0;
    public int num2 = 0;

    public Experiment(int x) {
        num2 = x;
        num1++;
    }

    public void print() {
        System.out.println("num1=" + num1 + ", num2=" + num2);
    }

        public static void main(String[] args) {

            Experiment o1 = new Experiment(10);
            o1.print();
            Experiment o2 = new Experiment(20);
            Experiment o3 = new Experiment(30);
            o3.print();
            o1.print();
        }
    }

