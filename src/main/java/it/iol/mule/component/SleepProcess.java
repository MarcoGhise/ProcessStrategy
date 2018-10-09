package it.iol.mule.component;

public class SleepProcess {

	public String getPayload(String payload) throws InterruptedException
	{
		Thread.sleep(5000);
		return payload;
	}
}
