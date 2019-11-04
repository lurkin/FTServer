package com.github.lurkin;
import java.net.ServerSocket;

public class SingleThreadedServer implements Runnable {

	 protected int          serverPort   = 8080;
	    protected ServerSocket serverSocket = null;
	    protected boolean      isStopped    = false;
	    protected Thread       runningThread= null;
	    
	    
	    
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}


}
