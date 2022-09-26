package tmp.Handler;

import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

/**
 * Handler.MyChannelHandlerPool
 * 通道组池，管理所有websocket连接
 * @author zhengkai.blog.csdn.net
 * @date 2019-06-12
 */
public class MyChannelHandlerPool {

    public MyChannelHandlerPool(){}

    public static ChannelGroup channelGroup = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

}