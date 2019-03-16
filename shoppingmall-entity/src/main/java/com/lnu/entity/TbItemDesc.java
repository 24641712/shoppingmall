package com.lnu.entity;

import java.util.Date;

/**
 * 商品描述实体
 * @Author：ccl
 * @Date：19-3-4
 */
public class TbItemDesc {

    private Long itemId;//商品ID

    private Date created;//创建时间

    private Date updated;//修改时间

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "TbItemDesc{" +
                "itemId=" + itemId +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
