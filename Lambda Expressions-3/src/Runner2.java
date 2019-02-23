
class Runner2 {
	
	public void run(Executable2 e){
		System.out.println("Executing code block ...");
		e.check();
		e.execute();
		e.stop();
	}
}
