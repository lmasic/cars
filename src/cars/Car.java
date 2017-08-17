/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cars;

/**
 *
 * @author virtuoso
 */
public class Car {

    private String manufacture;
    private String modelName;
    private int year;
    private static int counter = 0;
    private int speed;
    private Engine engine;
    private ServiceBook serviceBook;

    public Car(String manufacture, String modelName, int year, int speed, String engine) {

        this.manufacture = manufacture;
        this.modelName = modelName;
        this.year = year;
        counter++;
        this.speed = speed;
        this.engine = new Engine(engine);
        this.serviceBook = new ServiceBook(this);

    }

    @Override
    public String toString() {

        return "Manufacture: " + manufacture + "\n" + "Model name: " + modelName + "..."
                + "Service records" + this.serviceBook.getServiceRecords();
    }

    public void setServiceBook(ServiceBook serviceBook) {

        this.serviceBook = serviceBook;
    }

    protected void finalize() throws Throwable {
        try {
            counter--;
        } finally {
            super.finalize();
        }
    }
}
