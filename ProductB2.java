package absFabrW;

/**
 * Created by User on 05.02.2017.
 */
public class ProductB2 implements AbstractProductB {
    @Override
    public void interact(AbstractProductA a) {
        System.out.println(this.getClass().getName() + " interacts with " + a.getClass().getName());
    }
}
