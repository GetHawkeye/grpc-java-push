// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: device_manager.proto

package cn.com.hawkeye.device;

public interface MessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:device.Message)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 msgId = 1;</code>
   */
  int getMsgId();

  /**
   * <pre>
   *msg receiver
   * </pre>
   *
   * <code>string receiver = 2;</code>
   */
  java.lang.String getReceiver();
  /**
   * <pre>
   *msg receiver
   * </pre>
   *
   * <code>string receiver = 2;</code>
   */
  com.google.protobuf.ByteString
      getReceiverBytes();

  /**
   * <pre>
   *msg content
   * </pre>
   *
   * <code>string content = 3;</code>
   */
  java.lang.String getContent();
  /**
   * <pre>
   *msg content
   * </pre>
   *
   * <code>string content = 3;</code>
   */
  com.google.protobuf.ByteString
      getContentBytes();
}
