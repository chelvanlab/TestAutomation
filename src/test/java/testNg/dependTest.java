package testNg;

import org.testng.annotations.Test;

public class dependTest {

    @Test
    public void login() {
        System.out.println("Login");
    }

    @Test(dependsOnMethods = {"login"})
    public void create() {
        System.out.println("Create");
    }

    @Test(dependsOnMethods = {"login", "create"})
    public void edit() {
        System.out.println("Edit");
    }

    @Test(dependsOnMethods = {"edit"})
    public void delete() {
        System.out.println("Delete");
    }

    @Test(dependsOnMethods={"delete"})
    public void logout() {
        System.out.println("Logout");
    }
}
