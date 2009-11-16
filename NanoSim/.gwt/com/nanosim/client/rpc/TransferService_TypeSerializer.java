package com.nanosim.client.rpc;

import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.rpc.impl.Serializer;

public class TransferService_TypeSerializer implements Serializer {
  private static final JavaScriptObject methodMap = createMethodMap();
  private static final JavaScriptObject signatureMap = createSignatureMap();
  
  @SuppressWarnings("restriction")
  private static native JavaScriptObject createMethodMap() /*-{
    return {
    "com.google.gwt.i18n.client.impl.DateRecord/112389920":[
      @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/i18n/client/impl/DateRecord;),
      @com.google.gwt.i18n.client.impl.DateRecord_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/i18n/client/impl/DateRecord;)
    ],
    "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533":[
      @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;),
      @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;)
    ],
    "com.nanosim.model.Budget/2364880982":[
      @com.nanosim.model.Budget_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.nanosim.model.Budget_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/nanosim/model/Budget;),
      @com.nanosim.model.Budget_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/nanosim/model/Budget;)
    ],
    "java.lang.String/2004016611":[
      @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/String;),
      @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/String;)
    ],
    "java.sql.Date/3996530531":[
      @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Date;),
      @com.google.gwt.user.client.rpc.core.java.sql.Date_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Date;)
    ],
    "java.sql.Time/831929183":[
      @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Time;),
      @com.google.gwt.user.client.rpc.core.java.sql.Time_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Time;)
    ],
    "java.sql.Timestamp/1769758459":[
      @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/sql/Timestamp;),
      @com.google.gwt.user.client.rpc.core.java.sql.Timestamp_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/sql/Timestamp;)
    ],
    "java.util.Date/1659716317":[
      @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
      @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Date;),
      @com.google.gwt.user.client.rpc.core.java.util.Date_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Date;)
    ]
    };
  }-*/;
  
  private static native JavaScriptObject createSignatureMap() /*-{
    return {
    "com.google.gwt.i18n.client.impl.DateRecord":"112389920",
    "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException":"3936916533",
    "com.nanosim.model.Budget":"2364880982",
    "java.lang.String":"2004016611",
    "java.sql.Date":"3996530531",
    "java.sql.Time":"831929183",
    "java.sql.Timestamp":"1769758459",
    "java.util.Date":"1659716317"
    };
  }-*/;
  
  private static void raiseSerializationException(String msg) throws SerializationException {
    throw new SerializationException(msg);
  }
  
  public native void deserialize(SerializationStreamReader streamReader, Object instance, String typeSignature) throws SerializationException /*-{
    var methodTable = @com.nanosim.client.rpc.TransferService_TypeSerializer::methodMap[typeSignature];
    if (!methodTable) {
      @com.nanosim.client.rpc.TransferService_TypeSerializer::raiseSerializationException(Ljava/lang/String;)(typeSignature);
    }
    methodTable[1](streamReader, instance);
  }-*/;
  
  public native String getSerializationSignature(String typeName) /*-{
    return @com.nanosim.client.rpc.TransferService_TypeSerializer::signatureMap[typeName];
  }-*/;
  
  public native Object instantiate(SerializationStreamReader streamReader, String typeSignature) throws SerializationException /*-{
    var methodTable = @com.nanosim.client.rpc.TransferService_TypeSerializer::methodMap[typeSignature];
    if (!methodTable) {
      @com.nanosim.client.rpc.TransferService_TypeSerializer::raiseSerializationException(Ljava/lang/String;)(typeSignature);
    }
    return methodTable[0](streamReader);
  }-*/;
  
  public native void serialize(SerializationStreamWriter streamWriter, Object instance, String typeSignature) throws SerializationException /*-{
    var methodTable = @com.nanosim.client.rpc.TransferService_TypeSerializer::methodMap[typeSignature];
    if (!methodTable) {
      @com.nanosim.client.rpc.TransferService_TypeSerializer::raiseSerializationException(Ljava/lang/String;)(typeSignature);
    }
    methodTable[2](streamWriter, instance);
  }-*/;
  
}
