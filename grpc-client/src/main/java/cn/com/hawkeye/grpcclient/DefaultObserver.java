package cn.com.hawkeye.grpcclient;

import cn.com.hawkeye.device.Message;
import io.grpc.stub.StreamObserver;
public class DefaultObserver implements StreamObserver<Message> {

	private TestClient client;
	private String info;
	
	public DefaultObserver(String info, TestClient client){
		this.info = info;
		this.client = client;
	}
	
	@Override
	public void onCompleted() {
		System.out.println(info+"onCompleted");
	}

	@Override
	public void onError(Throwable arg0) {
		System.out.println(info+"onError");
	}

	/**
	 *
	 * Receive server push messages
	 */
	@Override
	public void onNext(Message message) {
		System.out.println("Receive："+message.getContent());
	}

}
