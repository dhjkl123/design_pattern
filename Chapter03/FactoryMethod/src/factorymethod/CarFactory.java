package factorymethod;

public abstract class CarFactory {

    public abstract Car ceateCar(String name);
    public abstract Car returnCar(String name);

    public void nubering(){
        System.out.println("numbering");
    }

    public void washCar(){
        System.out.println("washCar");
    }


    final public void sellCar(String name){
        nubering();
        ceateCar(name);
        washCar();

    }

}
