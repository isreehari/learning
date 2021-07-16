package com.spon.learning.declarationsandmodifiers;

import com.spon.learning.domain.Parent;

public class ParentChildObjectTest extends Parent{
    public ParentChildObjectTest(){        
        System.out.println(this.getClass().getName()+" Class hashcode is : "+ this.hashCode());
    }
}
