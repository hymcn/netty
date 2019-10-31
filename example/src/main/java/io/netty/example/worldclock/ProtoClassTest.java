package io.netty.example.worldclock;


/**
 * @author Administrator
 * @date 2019/10/31.
 */
public class ProtoClassTest {

    // proto is google protocol buffe
    // protocol buffers are a flexible, efficient, automated mechanism for serializing structrured data
    // thinking XML, but smaller, faster, ans simpler.
    public static void main(String[] args){
        HelloProtocol.Hello.Builder builder = HelloProtocol.Hello.newBuilder();
        builder.setMsg("hello");

        HelloProtocol.Hello hello = builder.build();
        System.out.println(hello);
    }
}
