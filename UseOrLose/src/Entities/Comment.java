package Entities;

import java.util.ArrayList;

public class Comment {

    private String commentText;
    private int commentID;
    private ArrayList<Reply> Replies;

    public Comment(String commentText, int commentID, ArrayList<Reply> object) {
        this.commentText = commentText;
        this.commentID = commentID;
        this.Replies = object;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
    }

    public int getCommentID() {
        return commentID;
    }

    public void setReplies(ArrayList<Reply> replies) {
        Replies = replies;
    }

    public ArrayList<Reply> getReplies() {
        return Replies;
    }
}
