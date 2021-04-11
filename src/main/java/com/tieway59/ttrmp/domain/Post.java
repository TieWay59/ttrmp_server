package com.tieway59.ttrmp.domain;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * null
 * @TableName post
 */
@Data
public class Post implements Serializable {
    /**
     * 
     */
    private Integer postId;

    /**
     * 
     */
    private String postTitle;

    /**
     * 
     */
    private Date postDate;

    /**
     * 
     */
    private String postText;

    /**
     * 
     */
    private Integer postCreator;

    /**
     * 
     */
    private Integer postCate;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Post other = (Post) that;
        return (this.getPostId() == null ? other.getPostId() == null : this.getPostId().equals(other.getPostId()))
            && (this.getPostTitle() == null ? other.getPostTitle() == null : this.getPostTitle().equals(other.getPostTitle()))
            && (this.getPostDate() == null ? other.getPostDate() == null : this.getPostDate().equals(other.getPostDate()))
            && (this.getPostText() == null ? other.getPostText() == null : this.getPostText().equals(other.getPostText()))
            && (this.getPostCreator() == null ? other.getPostCreator() == null : this.getPostCreator().equals(other.getPostCreator()))
            && (this.getPostCate() == null ? other.getPostCate() == null : this.getPostCate().equals(other.getPostCate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPostId() == null) ? 0 : getPostId().hashCode());
        result = prime * result + ((getPostTitle() == null) ? 0 : getPostTitle().hashCode());
        result = prime * result + ((getPostDate() == null) ? 0 : getPostDate().hashCode());
        result = prime * result + ((getPostText() == null) ? 0 : getPostText().hashCode());
        result = prime * result + ((getPostCreator() == null) ? 0 : getPostCreator().hashCode());
        result = prime * result + ((getPostCate() == null) ? 0 : getPostCate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", postId=").append(postId);
        sb.append(", postTitle=").append(postTitle);
        sb.append(", postDate=").append(postDate);
        sb.append(", postText=").append(postText);
        sb.append(", postCreator=").append(postCreator);
        sb.append(", postCate=").append(postCate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}