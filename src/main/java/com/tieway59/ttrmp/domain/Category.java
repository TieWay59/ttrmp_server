package com.tieway59.ttrmp.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * null
 * @TableName category
 */
@Data
public class Category implements Serializable {
    /**
     * 
     */
    private Integer categoryId;

    /**
     * 
     */
    private Integer categoryParent;

    /**
     * 
     */
    private String categoryName;

    /**
     * 
     */
    private Integer categoryLevel;

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
        Category other = (Category) that;
        return (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()))
            && (this.getCategoryParent() == null ? other.getCategoryParent() == null : this.getCategoryParent().equals(other.getCategoryParent()))
            && (this.getCategoryName() == null ? other.getCategoryName() == null : this.getCategoryName().equals(other.getCategoryName()))
            && (this.getCategoryLevel() == null ? other.getCategoryLevel() == null : this.getCategoryLevel().equals(other.getCategoryLevel()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        result = prime * result + ((getCategoryParent() == null) ? 0 : getCategoryParent().hashCode());
        result = prime * result + ((getCategoryName() == null) ? 0 : getCategoryName().hashCode());
        result = prime * result + ((getCategoryLevel() == null) ? 0 : getCategoryLevel().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", categoryId=").append(categoryId);
        sb.append(", categoryParent=").append(categoryParent);
        sb.append(", categoryName=").append(categoryName);
        sb.append(", categoryLevel=").append(categoryLevel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}