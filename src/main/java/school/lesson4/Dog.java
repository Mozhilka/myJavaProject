package school.lesson4;

//это подкласс Cat супер класса Animal с наследованием extends
class Dog extends Animal {

    public double run;
    public int sweem;



    public Dog(String name, int run, int sweem ) {
        this.name = name;
        this.run = run;
        this.sweem = sweem;
    }
    public void dogInfo() {
        System.out.println("DogName: " + name  + " /RunLimit: " + run+ " meters/" + " /Sweem:" + sweem );
    }
}
