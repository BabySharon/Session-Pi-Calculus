package com.sharon.sessionPiCalculus.dao;

import java.util.List;
import java.util.Map;

// TODO Only able to process branch and select with basic types
public class CompositeType extends BasicType{
    // At a time, only one of the fields will have values
    // branch - multiple entries
    private Map<String, List<BasicType>> branch;
    // select - only one entry
    private Map<String, List<BasicType>> select;

    public CompositeType(String typeString, Types type, Map<String, List<BasicType>> composite) {
        super(typeString, type);
        if(type.equals(Types.BRANCH))
            this.branch = composite;
        else
            this.select = composite;
    }

    public Map<String, List<BasicType>> getBranch() {
        return branch;
    }

    public void setBranch(Map<String, List<BasicType>> branch) {
        this.branch = branch;
    }

    public Map<String, List<BasicType>> getSelect() {
        return select;
    }

    public void setSelect(Map<String, List<BasicType>> select) {
        this.select = select;
    }
}
