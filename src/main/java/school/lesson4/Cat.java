package school.lesson4;

//это подкласс Cat, супер класса Animal с наследованием extends
class Cat extends Animal {

    protected boolean sweem;
    int run;

//konstruktor Cat

    public Cat(String name, int run, boolean sweem ) {
        this.name = name;
        this.run = run;
        this.sweem = sweem;

    }

    //выводим информацию в консоль
    public void catInfo() {
        System.out.println("CatName: " + name + " /RunLimit: " + run+ " meters/" + " /Sweem:" + sweem );
    }
}
