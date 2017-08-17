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
class ServiceBook {

    private final int maxLen = 10;
    private String[] serviceRecords;
    private int count;
    private Car car;

    public ServiceBook(Car car) {

        this.car = car;
        count = 0;
        serviceRecords = new String[maxLen];

        car.setServiceBook(this);
    }

    public Car getCar() {
        return this.car;
    }

    public String getServiceRecords() {
        String res = "";
        for (int i = 0; i < count; i++) {
            res += serviceRecords[i] + "\n";
        }
        return res;
    }
    public void addRecord(String record) {
        if (count < maxLen) {
            serviceRecords[count] = record;
            count++;
        }
    }
    @Override
    public String toString() {
    
       return this.getServiceRecords(); 
    }
}
