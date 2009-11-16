package com.nanosim.client.rpc;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;

public class TransferService_Proxy extends RemoteServiceProxy implements com.nanosim.client.rpc.TransferServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "com.nanosim.client.rpc.TransferService";
  private static final String SERIALIZATION_POLICY ="EDBE0F769BF01C084BECB9E164DC832B";
  private static final com.nanosim.client.rpc.TransferService_TypeSerializer SERIALIZER = new com.nanosim.client.rpc.TransferService_TypeSerializer();
  
  public TransferService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "TransferService", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void insertBudget(com.nanosim.model.Budget b, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    int requestId = getNextRequestId();
    boolean toss = isStatsAvailable() && stats(timeStat("TransferService_Proxy.insertBudget", getRequestId(), "begin"));
    ClientSerializationStreamWriter streamWriter = createStreamWriter();
    // createStreamWriter() prepared the stream
    streamWriter.writeString(REMOTE_SERVICE_INTERFACE_NAME);
    try {
      streamWriter.writeString("insertBudget");
      streamWriter.writeInt(1);
      streamWriter.writeString("com.nanosim.model.Budget");
      streamWriter.writeObject(b);
      String payload = streamWriter.toString();
      toss = isStatsAvailable() && stats(timeStat("TransferService_Proxy.insertBudget", getRequestId(), "requestSerialized"));
      doInvoke(ResponseReader.OBJECT, "TransferService_Proxy.insertBudget", getRequestId(), payload, callback);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
}
