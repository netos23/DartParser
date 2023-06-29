
public class Simple {


    int c = 10;


    public void show(int n){

            System.out.println(n + c);
            show(n - 1);
            rec();
    }

    public void rec(){
        int n =1;
        if (n != 10){

        }
    }

    public static void main(String[] args) {

        int n = 12 - 18 * (7 - 6) + 1;

        Simple person = new Simple();
        person.show(n);
    }




}
