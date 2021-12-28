class SingleTonClass{

	private SingleTonClass(){
	
	}

	public static SingleTonClass single = null;	
	
	public SingleTonClass getInstance(){

	if(single == null){
		
	single = new SingleTonClass();
	}
	return single;
	}
}

public class DriverClass{

	public static void main(String[] args){
	
	SingleTonClass object=	SingleTonClass.getInstance();
	
	System.out.println(object.hashcode());
	}
	}
	
		





	
