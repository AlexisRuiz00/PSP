package ejemplos;

public class TicTac extends Thread {
	
	private String name;

	public TicTac (String name) {
		this.name = name;
	}
	
	public void run() {
		for (int i=0; i<20;i++) {
			System.out.println(name);
				try {
					sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	public static void main(String[] args) {
		TicTac tic = new TicTac("TIC");
		tic.setPriority(2);

		TicTac tac = new TicTac("TAC");
		tac.setPriority(1);
		
		tac.start();
		tic.start();
	}

}
