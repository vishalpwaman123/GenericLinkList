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

    @Test
    public void givenSearchItem_WhenSearch_ifAbsent_shouldReturnFalse() {
        LinkList<Integer> linkList = new LinkList();
        linkList.add(1);
        linkList.add(2);
        linkList.add(4);
        Assert.assertFalse(linkList.search(3));
    }

    @Test
    public void givenEmptyList_shouldReturnTrue() {
        LinkList<Integer> linkList = new LinkList<>();
        Assert.assertTrue(linkList.isEmpty());
    }

    @Test
    public void givenFullList_shouldReturnFalse() {
        LinkList<Integer> linkList = new LinkList<>();
        linkList.add(1);
        linkList.add(2);
        Assert.assertFalse(linkList.isEmpty());
    }

    @Test
    public void givenSizeMethod_shouldReturn_numberOfElement() {
        LinkList<Integer> linkList = new LinkList<>();
        linkList.add(6);
        linkList.add(9);
        Assert.assertEquals(2,linkList.size());
    }

    @Test
    public void givenAppendInteger_shouldAdd_elementAtLast() {
        LinkList<Integer> linkList = new LinkList<>();
        linkList.add(1);
        linkList.append(6);
        Assert.assertEquals(2,linkList.size());
    }

    @Test
    public void givenAppendString_shouldAdd_elementAtLast() {
        LinkList<String> linkList = new LinkList();
        linkList.add("Vishal");
        linkList.append("Waman");
        Assert.assertEquals("[ Vishal, Waman ]", linkList.toString());
    }

    @Test
    public void givenIndexInteger_shouldReturn_positionOfElement() {
        LinkList<Integer> linkList = new LinkList<>();
        linkList.add(4);
        linkList.add(3);
        linkList.add(2);
        linkList.add(1);
        Assert.assertEquals(2,linkList.index(2));
    }

    @Test
    public void givenIndexString_shouldReturn_positionOfElement() {
        LinkList<String> linkList = new LinkList();
        linkList.add("Apple");
        linkList.append("Mango");
        linkList.append("Banana");
        linkList.append("Peach");
        Assert.assertEquals(3, linkList.index("Banana"));
    }

    @Test
    public void givenInsert_shouldAdd_elementToSpecificPosition() {
        LinkList<Integer> linkList = new LinkList();
        linkList.add(1);
        linkList.append(2);
        linkList.append(4);
        linkList.insert(3, 3);
        Assert.assertEquals("[ 1, 2, 3, 4 ]", linkList.toString());
    }



}
