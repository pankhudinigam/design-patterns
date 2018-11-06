package main.AdapterPattern

/**
 * Created by pnigam on 10/3/2018
 */
class Client {
    // Has name client as it is the requirement poser!
    public static void main(String[] args) {
        // This class wants to call adaptee's request function(which needs 2 arguments), by providing single arguments only.
        AdapterInterface adapterInstance = new Adapter(new Adaptee()); // Adapt this class for me
        String paramValue = "single param"
        print(String.format("I am a demanding client and I want to call request but with one parameter only. \nString Parameter Passed: %s\n", paramValue))
        adapterInstance.request(paramValue);
    }
}
