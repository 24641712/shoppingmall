package com.lnu.shoppingmallentity;


import javax.persistence.*;

/**
 * @author
 */
@Entity(name = "user") //设置实体名， 在数据库中是表名
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  //设置自动增长
    @Column(name = "id")
    private Integer id;

    @Column(name = "name") //设置数据库字段名
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
