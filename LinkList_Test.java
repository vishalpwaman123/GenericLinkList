package com.singly_link_list;

import org.junit.Assert;
import org.junit.Test;

public class LinkListTest {

    @Test
    public void givenAddInteger_ShouldAddToLinkList_andReturnThatList() {
        LinkList<Integer> linkList = new LinkList();
        linkList.add(5);
        linkList.add(7);
        Assert.assertEquals("[ 5, 7 ]", linkList.toString());
    }

}
