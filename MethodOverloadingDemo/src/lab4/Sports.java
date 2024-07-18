package lab4;


class Sports1 {
    public void play() {
        System.out.println("Playing generic sport...");
    }
}

class Football extends Sports1 {
    @Override
    public void play() {
        System.out.println("Playing Football: Kick the ball and score goals!");
    }
}

class Basketball extends Sports1 {
    @Override
    public void play() {
        System.out.println("Playing Basketball: Shoot hoops and make baskets!");
    }
}

class Cricket extends Sports1 {
    @Override
    public void play() {
        System.out.println("Playing Cricket: Hit the ball and get the Run!");
    }
}

public class Sports {
    public static void main(String[] args) {
        Sports1 genericSport = new Sports1();
        Football football = new Football();
        Basketball basketball = new Basketball();
        Cricket rugby = new Cricket();

        // Calling play() method for each sport
        genericSport.play();
        football.play();
        basketball.play();
        rugby.play();
    }
}

