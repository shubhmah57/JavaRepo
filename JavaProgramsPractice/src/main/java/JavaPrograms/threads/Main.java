package JavaPrograms.threads;

class Main extends Thread{
	public void run(){
		System.out.println("Method"  +Thread.currentThread().getId());
	}
	
	public static void main(String args[]){
		int i = 8;
		for(i = 0; i<8;i++){
			Main obj = new Main();
			obj.start();
		}
	}
} 