package PKG2;

public class Innova extends Toyota
{public void model()
    {
       System.out.println("Model is Crysta");
    }
public static void main(String[] args)
 {
	System.out.println("Single Level Inheritence\n");
	Innova car= new Innova();
	car.model();
	car.price();
	car.color();

  }
}
