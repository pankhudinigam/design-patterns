package main.AdapterPattern

/**
 * Created by pnigam on 10/3/2018
 */
class Adaptee {
    public void request(String a, int num) {
        print(String.format("PS: This call needs 2 arguments: one string and one num. \nString Supplied: %s \nNum Supplied: %s\n", a, num))
    }

    public static staticRequest(String a, int num) {
        print(String.format("Static: PS: This call needs 2 arguments: one string and one num. \nString Supplied: %s \nNum Supplied: %s\n", a, num))
    }
}
