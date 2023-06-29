class Person {


  int c = 10;
  int f = 1;

  void rec(int n) {
    if (n > 0){
      n = n - 1;
      print(n + c);
      rec(n - 1);
    };
  }

  void start(int n){
    c = n;

  }

  void fact(){

  }

  void main() {
    int n = 24 - 18 * (7 - 6) + 1;
    Person person = Person();
    person.start(n);
    person.rec(n);


  }

}

