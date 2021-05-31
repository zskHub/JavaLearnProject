package cn.zsk.algorithm.link;

import com.alibaba.fastjson.JSON;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * 链表demo
 *
 * @Author : zsk
 * @CreateTime : 2021-05-31   10:57
 */
@Slf4j
@Data
public class Link<T> {
    //头结点
    private Node head;

    public Link(){
        this.head = null;
    }

    @Data
    private static class Node<T>{
        private T val;
        private Node next;
        public Node(T val,Node next){
            this.val = val;
            this.next = next;
        }
        public Node(T val){
            this(val,null);
        }
    }

    /**
     * 链表头部添加元素
     * */
    public void addFirst(T val){
        Node<T> nodeTemp = new Node<>(val);
        if(this.head == null) {
            this.head = nodeTemp;
            return;
        }
        nodeTemp.next = this.head;
        this.head = nodeTemp;
    }

    /**
     * 向链表尾部插入元素
     * */
    public void addLast(T t){
        this.add(t, this.getLength());
    }

    /**
     * 向链表中间插入元素
     * */
    public void add(T t,int index){
        if (index < 0 || index > this.getLength()){
            throw new IllegalArgumentException("index is error");
        }
        if (index == 0){
            this.addFirst(t);
            return;
        }
        Node preNode = this.head;
        //找到要插入节点的前一个节点
        for(int i = 0; i < index - 1; i++){
            preNode = preNode.next;
        }
        Node node = new Node(t);
        //要插入的节点的下一个节点指向preNode节点的下一个节点
        node.next = preNode.next;
        //preNode的下一个节点指向要插入节点node
        preNode.next = node;
    }

    /**
     * 获得本链表的长度
     */
    public int getLength(){
        int length = 0;
        Node tmpNode = this.head;
        while(tmpNode != null){
            length ++;
            tmpNode = tmpNode.next;
        }
        return length;
    }

    //正序输出链表的所有内容
    public void displayLinkList() {
        Node node = this.getHead();
        while (node != null) {
           log.info(node.getVal() + "--->");
            node = node.getNext();
        }
        log.info("null");
    }


    public void createLinkList(Link link){
        link.addFirst(1);
        link.addFirst(2);
        link.addFirst(3);
        log.info("插入数据后：Link:{}", JSON.toJSONString(link));
        link.displayLinkList();

    }


    /**
     * 单向链表逆向
     * */
    public void reverseLinkList(){
        Link link = new Link();
        link.createLinkList(link);

        log.info("原始链表：{}", JSON.toJSONString(link));
    }
    /**
     * 交换next
     * @param link
     * @return: void
     * @throws
     * @time: 2021-05-31 17:13
     * @author: zsk
     */
    public void reverseLinkList1(Link link){
        if (null == link.head || null == link.head.next){
            return;
        }
        Node node = link.head;

        Node cur = node;
        Node next = node.next;



    }

    public static void main(String[] args) {
        Link link = new Link();
        link.createLinkList(link);

        link.displayLinkList();

        link.reverseLinkList();

        link.displayLinkList();
    }
}
