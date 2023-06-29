class Person {


  int c = 1;
  int f = 0;
  int prev = 1;
  int nextPrev = 1;

  void rec(int n) {
    if (n > 0) {
      n = n - 1;
      print(n + c);
      rec(n - 1);
    };
  }


  void fact() {
    if (c < f) {
      print(prev * c);
      prev = prev * c;
      c = c + 1;
      fact();
    }
  }

  void fib(){
    if (c < f) {
      print(prev + nextPrev);
      int curr = nextPrev;
      nextPrev = prev + nextPrev;
      prev = curr;
      c = c + 1;
      fib();
    }
  }


  void start(int start, int finish) {
    c = start;
    f = finish;
    fact();
    prev = 1;
    nextPrev = 1;
    c = start;
    f = finish;
    fib();
  }



  void main() {
    int n = 24 - 18 * (7 - 6) + 1;
    int b = 24 - 18 * (7 - 6) + 5;
    Person person = Person();
    person.start(1, 10);
    person.rec(n);


  }

}

