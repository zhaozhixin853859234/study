package com.java.proxy.proxyTest;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-07-07 15:25
 */
public class Wang implements Singer {
    @Override
    public void orderSong(String songName) {
        System.out.println("演唱歌曲:"+songName);
    }

    @Override
    public void sayGoodBye(String audienceName) {
        System.out.println("再见："+ audienceName);
    }
}
