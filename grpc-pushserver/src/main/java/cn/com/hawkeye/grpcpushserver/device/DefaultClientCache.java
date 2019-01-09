package cn.com.hawkeye.grpcpushserver.device;

import cn.com.hawkeye.device.ClientInfo;
import io.grpc.stub.StreamObserver;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;


public class DefaultClientCache<T> implements IClientCache<T> {
	
	private volatile ConcurrentHashMap<String, StreamObserver<T>> cache = new ConcurrentHashMap<String, StreamObserver<T>>();

	public void registerToServer(ClientInfo clientInfo, StreamObserver<T> observer) {
		cache.put(clientInfo.getClientId(), observer);
		System.out.println("clientId="+clientInfo.getClientId()+" Already registered.");

	}

	public void clearErrorObserver() {

	}

	@Override
	public StreamObserver<T> getObserver(ClientInfo clientInfo) {
		return getObserver(clientInfo.getClientId());
	}

	@Override
	public boolean removeErrorObserver(String clientId) {
		cache.remove(clientId);
		return true;
	}

	@Override
	public StreamObserver<T> getObserver(String clientId) {
		return cache.get(clientId);
	}

	@Override
	public void logoutFromServer(ClientInfo clientInfo) {

	}


}
