package com.example.swipemenu;

public class Mail {
    private String senderAvatarUrl;
    private String sender;
    private String subject;
    private String messageBody;
    private String receiveTime;


    public Mail() {
    }

    public Mail(String senderAvatarUrl, String sender, String subject, String messageBody, String receiveTime) {
        this.senderAvatarUrl = senderAvatarUrl;
        this.sender = sender;
        this.subject = subject;
        this.messageBody = messageBody;
        this.receiveTime = receiveTime;
    }

    public String getSenderAvatarUrl() {
        return senderAvatarUrl;
    }

    public void setSenderAvatarUrl(String senderAvatarUrl) {
        this.senderAvatarUrl = senderAvatarUrl;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public String getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(String receiveTime) {
        this.receiveTime = receiveTime;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "senderAvatarUrl='" + senderAvatarUrl + '\'' +
                ", sender='" + sender + '\'' +
                ", subject='" + subject + '\'' +
                ", messageBody='" + messageBody + '\'' +
                ", receiveTime='" + receiveTime + '\'' +
                '}';
    }
}
