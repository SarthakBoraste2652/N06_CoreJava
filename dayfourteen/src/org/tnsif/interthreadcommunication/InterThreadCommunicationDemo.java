package org.tnsif.interthreadcommunication;

public class InterThreadCommunicationDemo {

	public static void main(String[] args) {
		
		//shared Resources
		Q obj = new Q();
		
		//Producer Thread
		Producer producerThread = new Producer(obj);
		//Consumer Thread
		Consumer consumerThread = new Consumer(obj);

		try {
			producerThread.join();
			consumerThread.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("---------End of main()-----------");
	}

}
