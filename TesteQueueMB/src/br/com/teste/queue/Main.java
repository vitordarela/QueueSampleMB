package br.com.teste.queue;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.naming.NamingException;
 
public class Main {
	
	public void enviaEconsome() throws NamingException, JMSException {
		SampleQueueReceiver queueReceiver = new SampleQueueReceiver();
        MessageConsumer consumer = queueReceiver.registerSubscriber();
        SampleQueueSender queueSender = new SampleQueueSender();
        queueSender.sendMessages();
        queueReceiver.receiveMessages(consumer);
	}
    
    
    
}