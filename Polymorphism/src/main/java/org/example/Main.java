package org.example;

public class Main {
    public static void main(String[] args) {

        for(int i = 1; i< 6; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + ":\n "
                    + "Movie name:" + movie.getName() + ":\n "
                    + "Movie plot:" + movie.plot()

            );
        }

        Car car1 = new Car(true, 2, 4, "Mitsubish");
        System.out.println(car1.startEngine());
        System.out.println(car1.accelerate());
        System.out.println(car1.brake());

        Mitsubishi mitsu = new Mitsubishi(true, 2, 4, "Mitsubishi");
        System.out.println(mitsu.startEngine());
        System.out.println(mitsu.accelerate());
        System.out.println(mitsu.brake());


    }

    public static Movie randomMovie(){
        int randomNum = (int)Math.round(Math.random() * 5)  ;
        System.out.println("random number generated was " + randomNum);

        switch (randomNum){
            case 1:
               return new Brave();
            case 2:
                return  new Encanto();
            case 3:
                return  new SoundOfMusic();
            case 4:
                return new Jaws();
        }
            return null;
    }


}
