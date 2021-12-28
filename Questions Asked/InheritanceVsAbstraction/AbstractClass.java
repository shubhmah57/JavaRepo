abstract class Vehicle{

	Vehicle(){
		System.out.println("Vehicle Started");
	}
	public abstract void setName(String name);
	public void hasHorn(){
	
	System.out.println("Blows Horn");

	}
	
}


class Car extends Vehicle{

	String name;
	
	@Override
	public void setName(String name)
	{
	this.name = name;
	}
	
}

public class AbstractClass {

	public static void main(String[] args){
	
	Vehicle vehicle = new Car();
	vehicle.setName("Hyundai Creta");

	System.out.println("the name:" + ((Car)vehicle).name);
	vehicle.hasHorn();
	}
}
