package cn.com.hawkeye.grpcpushserver.device;

import cn.com.hawkeye.device.ClientInfo;
import io.grpc.stub.StreamObserver;

public interface IClientCache<T>{
	
	public void registerToServer(ClientInfo clientInfo, StreamObserver<T> observer);
	
	public boolean removeErrorObserver(String clientId);
	
	public StreamObserver<T> getObserver(String clientId);
	
	public void logoutFromServer(ClientInfo clientInfo);
	
	public StreamObserver<T> getObserver(ClientInfo clientInfo);
	
	public void clearErrorObserver();

}
