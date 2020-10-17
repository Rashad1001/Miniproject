class Main {
  public static void main(String[] args) {
   
    Dog George = new Dog("George");
    George.bark();
    George.live();
  }
}

class Dog {
  String name;
  public Dog(String name) {
    this.name = name;

    System.out.println("A dog called "+this.name+" was just created he loves to play!");
  }

  public void bark() {
    System.out.println(this.name+" just said 'Woof that means hes very tired and hungry!'");
  }

  public void live() {
    this.eat();
  }

  private void eat() {
    System.out.println(this.name+" stops and is eating a dog treat what a good dog!");
  }
}