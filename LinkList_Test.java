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

    @Test
    public void givenAddString_ShouldAddToLinkList_andReturnThatList() {
        LinkList<String> linkList = new LinkList();
        linkList.add("Vishal");
        linkList.add("Waman");
        Assert.assertEquals("[ Vishal, Waman ]", linkList.toString());
    }
	
    @Test
    public void givenSearchItem_WhenSearch_ifPresent_shouldReturnTrue() {
        LinkList<Integer> linkList = new LinkList();
        linkList.add(1);
        linkList.add(2);
        linkList.add(3);
        Assert.assertTrue(linkList.search(2));
    }

}
