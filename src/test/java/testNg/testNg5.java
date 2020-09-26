package testNg;

import org.testng.annotations.Test;

public class testNg5 {
    @Test(priority = 0)
    public void login() {
        System.out.println("Login");
    }

    @Test(priority = 1)
    public void create() {
        System.out.println("Create");
    }

    @Test(priority = 2)
    public void edit() {
        System.out.println("Edit");
    }

    @Test(priority = 3)
    public void delete() {
        System.out.println("Delete");
    }

    @Test(priority = 4)
    public void logout() {
        System.out.println("Logout");
    }
}
