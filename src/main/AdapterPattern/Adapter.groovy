package main.AdapterPattern

/**
 * Created by pnigam on 10/3/2018
 */
class Adapter implements AdapterInterface {
    // This class figures out Client and Adaptee are incompatible pieces, and has code to stitch them together.
    // It makes Adaptee compatible for Client
    Adaptee adapteeObj

    public Adapter(Adaptee adapteeObj) {
        this.adapteeObj = adapteeObj
    }

    public void request(String a) {
        /* Adaptee adapteeObj = new Adaptee();
        print(String.format("I am the adapter and I patch request from Client with 1 argument to Adaptee with 2 arguments.\n"))
        adapteeObj.request(a, 0); */
        print(String.format("I am the adapter and I patch request from Client with 1 argument to Adaptee with 2 arguments.\n"))
        this.adapteeObj.request(a, 0)
    }

    public void staticRequest(String a) {
        Adaptee.staticRequest(a, 0)
    }
}
