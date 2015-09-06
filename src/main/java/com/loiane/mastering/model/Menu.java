package com.loiane.mastering.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="menu")
public class Menu {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column(name="text", nullable=false)
    private String text;

    @Column(name="iconCls", nullable=false)
    private String iconCls;

    @Column(name="className", nullable=false)
    private String className;

    @Column(name="menu_id", nullable=true)
    private Long menuId;

    @Column(name="routeId", nullable=true)
    private String routeId;

    /*@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="menu_id")
    @JsonIgnore
    private Menu parent;

    @OneToMany(mappedBy = "parent", fetch = FetchType.EAGER)
    private Set<Menu> items;*/

    @Transient
    private List<Menu> children;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Menu> getChildren() {
        return children;
    }

    public void setChildren(List<Menu> children) {
        this.children = children;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }
}
