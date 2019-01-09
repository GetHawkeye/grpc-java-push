package cn.com.hawkeye.device;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: device_manager.proto")
public final class DeviceManagerGrpc {

  private DeviceManagerGrpc() {}

  public static final String SERVICE_NAME = "device.DeviceManager";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<cn.com.hawkeye.device.ClientInfo,
      cn.com.hawkeye.device.Message> getRegisterToServerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "registerToServer",
      requestType = cn.com.hawkeye.device.ClientInfo.class,
      responseType = cn.com.hawkeye.device.Message.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<cn.com.hawkeye.device.ClientInfo,
      cn.com.hawkeye.device.Message> getRegisterToServerMethod() {
    io.grpc.MethodDescriptor<cn.com.hawkeye.device.ClientInfo, cn.com.hawkeye.device.Message> getRegisterToServerMethod;
    if ((getRegisterToServerMethod = DeviceManagerGrpc.getRegisterToServerMethod) == null) {
      synchronized (DeviceManagerGrpc.class) {
        if ((getRegisterToServerMethod = DeviceManagerGrpc.getRegisterToServerMethod) == null) {
          DeviceManagerGrpc.getRegisterToServerMethod = getRegisterToServerMethod = 
              io.grpc.MethodDescriptor.<cn.com.hawkeye.device.ClientInfo, cn.com.hawkeye.device.Message>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "device.DeviceManager", "registerToServer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.com.hawkeye.device.ClientInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.com.hawkeye.device.Message.getDefaultInstance()))
                  .setSchemaDescriptor(new DeviceManagerMethodDescriptorSupplier("registerToServer"))
                  .build();
          }
        }
     }
     return getRegisterToServerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<cn.com.hawkeye.device.Message,
      cn.com.hawkeye.device.ErrorInfo> getSendMsgMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendMsg",
      requestType = cn.com.hawkeye.device.Message.class,
      responseType = cn.com.hawkeye.device.ErrorInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<cn.com.hawkeye.device.Message,
      cn.com.hawkeye.device.ErrorInfo> getSendMsgMethod() {
    io.grpc.MethodDescriptor<cn.com.hawkeye.device.Message, cn.com.hawkeye.device.ErrorInfo> getSendMsgMethod;
    if ((getSendMsgMethod = DeviceManagerGrpc.getSendMsgMethod) == null) {
      synchronized (DeviceManagerGrpc.class) {
        if ((getSendMsgMethod = DeviceManagerGrpc.getSendMsgMethod) == null) {
          DeviceManagerGrpc.getSendMsgMethod = getSendMsgMethod = 
              io.grpc.MethodDescriptor.<cn.com.hawkeye.device.Message, cn.com.hawkeye.device.ErrorInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "device.DeviceManager", "sendMsg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.com.hawkeye.device.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  cn.com.hawkeye.device.ErrorInfo.getDefaultInstance()))
                  .setSchemaDescriptor(new DeviceManagerMethodDescriptorSupplier("sendMsg"))
                  .build();
          }
        }
     }
     return getSendMsgMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeviceManagerStub newStub(io.grpc.Channel channel) {
    return new DeviceManagerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeviceManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DeviceManagerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DeviceManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DeviceManagerFutureStub(channel);
  }

  /**
   */
  public static abstract class DeviceManagerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *register
     * </pre>
     */
    public void registerToServer(cn.com.hawkeye.device.ClientInfo request,
        io.grpc.stub.StreamObserver<cn.com.hawkeye.device.Message> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterToServerMethod(), responseObserver);
    }

    /**
     * <pre>
     *send message
     * </pre>
     */
    public void sendMsg(cn.com.hawkeye.device.Message request,
        io.grpc.stub.StreamObserver<cn.com.hawkeye.device.ErrorInfo> responseObserver) {
      asyncUnimplementedUnaryCall(getSendMsgMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterToServerMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                cn.com.hawkeye.device.ClientInfo,
                cn.com.hawkeye.device.Message>(
                  this, METHODID_REGISTER_TO_SERVER)))
          .addMethod(
            getSendMsgMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                cn.com.hawkeye.device.Message,
                cn.com.hawkeye.device.ErrorInfo>(
                  this, METHODID_SEND_MSG)))
          .build();
    }
  }

  /**
   */
  public static final class DeviceManagerStub extends io.grpc.stub.AbstractStub<DeviceManagerStub> {
    private DeviceManagerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeviceManagerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceManagerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeviceManagerStub(channel, callOptions);
    }

    /**
     * <pre>
     *register
     * </pre>
     */
    public void registerToServer(cn.com.hawkeye.device.ClientInfo request,
        io.grpc.stub.StreamObserver<cn.com.hawkeye.device.Message> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getRegisterToServerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *send message
     * </pre>
     */
    public void sendMsg(cn.com.hawkeye.device.Message request,
        io.grpc.stub.StreamObserver<cn.com.hawkeye.device.ErrorInfo> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendMsgMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DeviceManagerBlockingStub extends io.grpc.stub.AbstractStub<DeviceManagerBlockingStub> {
    private DeviceManagerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeviceManagerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceManagerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeviceManagerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *register
     * </pre>
     */
    public java.util.Iterator<cn.com.hawkeye.device.Message> registerToServer(
        cn.com.hawkeye.device.ClientInfo request) {
      return blockingServerStreamingCall(
          getChannel(), getRegisterToServerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *send message
     * </pre>
     */
    public cn.com.hawkeye.device.ErrorInfo sendMsg(cn.com.hawkeye.device.Message request) {
      return blockingUnaryCall(
          getChannel(), getSendMsgMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DeviceManagerFutureStub extends io.grpc.stub.AbstractStub<DeviceManagerFutureStub> {
    private DeviceManagerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeviceManagerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceManagerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeviceManagerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *send message
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<cn.com.hawkeye.device.ErrorInfo> sendMsg(
        cn.com.hawkeye.device.Message request) {
      return futureUnaryCall(
          getChannel().newCall(getSendMsgMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_TO_SERVER = 0;
  private static final int METHODID_SEND_MSG = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DeviceManagerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DeviceManagerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_TO_SERVER:
          serviceImpl.registerToServer((cn.com.hawkeye.device.ClientInfo) request,
              (io.grpc.stub.StreamObserver<cn.com.hawkeye.device.Message>) responseObserver);
          break;
        case METHODID_SEND_MSG:
          serviceImpl.sendMsg((cn.com.hawkeye.device.Message) request,
              (io.grpc.stub.StreamObserver<cn.com.hawkeye.device.ErrorInfo>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DeviceManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DeviceManagerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return cn.com.hawkeye.device.DeviceManagerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DeviceManager");
    }
  }

  private static final class DeviceManagerFileDescriptorSupplier
      extends DeviceManagerBaseDescriptorSupplier {
    DeviceManagerFileDescriptorSupplier() {}
  }

  private static final class DeviceManagerMethodDescriptorSupplier
      extends DeviceManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DeviceManagerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DeviceManagerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DeviceManagerFileDescriptorSupplier())
              .addMethod(getRegisterToServerMethod())
              .addMethod(getSendMsgMethod())
              .build();
        }
      }
    }
    return result;
  }
}
