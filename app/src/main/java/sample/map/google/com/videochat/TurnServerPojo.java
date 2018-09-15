package sample.map.google.com.videochat;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.webrtc.PeerConnection;

import java.util.List;

public class TurnServerPojo {
    @SerializedName("s")
    @Expose
    public Integer s;
    @SerializedName("p")
    @Expose
    public String p;
    @SerializedName("e")
    @Expose
    public Object e;
    @SerializedName("d")
    @Expose
    public IceServerList iceServerList;

    class IceServerList {

        @SerializedName("iceServers")
        @Expose
        public List<PeerConnection.IceServer> iceServers = null;

    }

}
