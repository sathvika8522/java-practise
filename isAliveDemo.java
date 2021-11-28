package abdulbairidemos;

class mt extends Thread
{
	public void run() {
		System.out.println("thread running");
	}
}

public class isAliveDemo {

	public static void main(String[] args) {
		mt t=new mt();
		System.out.println("thread before "+t.isAlive());
		System.out.println("thread before "+t.getState());
	
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("thread after "+t.isAlive());
		System.out.println("thread after "+t.getState());
		

	}

}
