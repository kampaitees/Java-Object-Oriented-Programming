public class lab7p2 {
    public static void main(String args[]) {

        Leaf obj1 = new Leaf();
        obj1.turn();
        Page obj2 = new Page();
        obj2.turn();
        Pancake obj3 = new Pancake();
        obj3.turn();
        Prateek obj4 = new Prateek();
        obj4.turn();
        Rahul obj5 = new Rahul();
        obj5.turn();

    }

}


interface  Turning {
    void turn();

}

class Leaf implements Turning {

    public void turn() {
        System.out.println("Changing colors");
    }
}

class Page implements Turning {

    public void turn() {
        System.out.println("Going to next page");
    }
}

class Pancake implements Turning {

    public void turn() {
        System.out.println("Flipping");
    }
}


class Prateek implements Turning {

    public void turn() {
        System.out.println("Prateek going to date");
    }
}

class Rahul implements Turning {

    public void turn() {
        System.out.println("Rahul going to party");
    }
}
