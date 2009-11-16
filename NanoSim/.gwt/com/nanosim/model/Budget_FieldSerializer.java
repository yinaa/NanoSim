package com.nanosim.model;

public class Budget_FieldSerializer {
  private static native int getBudgetId(com.nanosim.model.Budget instance) /*-{
    return instance.@com.nanosim.model.Budget::budgetId;
  }-*/;
  
  private static native void  setBudgetId(com.nanosim.model.Budget instance, int value) /*-{
    instance.@com.nanosim.model.Budget::budgetId = value;
  }-*/;
  
  private static native double getCredit(com.nanosim.model.Budget instance) /*-{
    return instance.@com.nanosim.model.Budget::credit;
  }-*/;
  
  private static native void  setCredit(com.nanosim.model.Budget instance, double value) /*-{
    instance.@com.nanosim.model.Budget::credit = value;
  }-*/;
  
  private static native int getGroupId(com.nanosim.model.Budget instance) /*-{
    return instance.@com.nanosim.model.Budget::groupId;
  }-*/;
  
  private static native void  setGroupId(com.nanosim.model.Budget instance, int value) /*-{
    instance.@com.nanosim.model.Budget::groupId = value;
  }-*/;
  
  private static native java.lang.String getPurpose(com.nanosim.model.Budget instance) /*-{
    return instance.@com.nanosim.model.Budget::purpose;
  }-*/;
  
  private static native void  setPurpose(com.nanosim.model.Budget instance, java.lang.String value) /*-{
    instance.@com.nanosim.model.Budget::purpose = value;
  }-*/;
  
  private static native java.util.Date getTime(com.nanosim.model.Budget instance) /*-{
    return instance.@com.nanosim.model.Budget::time;
  }-*/;
  
  private static native void  setTime(com.nanosim.model.Budget instance, java.util.Date value) /*-{
    instance.@com.nanosim.model.Budget::time = value;
  }-*/;
  
  private static native double getTotal(com.nanosim.model.Budget instance) /*-{
    return instance.@com.nanosim.model.Budget::total;
  }-*/;
  
  private static native void  setTotal(com.nanosim.model.Budget instance, double value) /*-{
    instance.@com.nanosim.model.Budget::total = value;
  }-*/;
  
  public static void deserialize(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader, com.nanosim.model.Budget instance) throws com.google.gwt.user.client.rpc.SerializationException{
    setBudgetId(instance, streamReader.readInt());
    setCredit(instance, streamReader.readDouble());
    setGroupId(instance, streamReader.readInt());
    setPurpose(instance, streamReader.readString());
    setTime(instance, (java.util.Date) streamReader.readObject());
    setTotal(instance, streamReader.readDouble());
    
  }
  
  public static native com.nanosim.model.Budget instantiate(com.google.gwt.user.client.rpc.SerializationStreamReader streamReader) throws com.google.gwt.user.client.rpc.SerializationException/*-{
    return @com.nanosim.model.Budget::new()();
  }-*/;
  
  public static void serialize(com.google.gwt.user.client.rpc.SerializationStreamWriter streamWriter, com.nanosim.model.Budget instance) throws com.google.gwt.user.client.rpc.SerializationException {
    streamWriter.writeInt(getBudgetId(instance));
    streamWriter.writeDouble(getCredit(instance));
    streamWriter.writeInt(getGroupId(instance));
    streamWriter.writeString(getPurpose(instance));
    streamWriter.writeObject(getTime(instance));
    streamWriter.writeDouble(getTotal(instance));
    
  }
  
}
