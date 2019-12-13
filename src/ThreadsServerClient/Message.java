package ThreadsServerClient;

import java.io.Serializable;

public class Message implements Serializable {
    private String senderName;
    private String text;
    private long time;
    private String userID;

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public Message(String senderName, String text, long time, String userID) {
        this.senderName = senderName;
        this.text = text;
        this.time = time;
        this.userID = userID;
    }

    @Override
    public String toString() {
        return "Message{" +
                "senderName='" + senderName + '\'' +
                ", text='" + text + '\'' +
                ", time=" + time +
                ", userID='" + userID + '\'' +
                '}';
    }
}
