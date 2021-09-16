package cn.zsk.algorithm.link;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.util.Stack;

/**
 * 链表demo
 *
 * @Author : zsk
 * @CreateTime : 2021-05-31   10:57
 */
@Data
public class Link<T> {
    //头结点
    private Node head;

    public Link() {
        this.head = null;
    }

    @Data
    private static class Node<T> {
        private T val;
        private Node next;

        public Node(T val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node(T val) {
            this(val, null);
        }
    }

    /**
     * 链表头部添加元素
     */
    public void addFirst(T val) {
        Node<T> nodeTemp = new Node<>(val);
        if (this.head == null) {
            this.head = nodeTemp;
            return;
        }
        nodeTemp.next = this.head;
        this.head = nodeTemp;
    }

    /**
     * 向链表尾部插入元素
     */
    public void addLast(T t) {
        this.add(t, this.getLength());
    }

    /**
     * 向链表中间插入元素
     */
    public void add(T t, int index) {
        if (index < 0 || index > this.getLength()) {
            throw new IllegalArgumentException("index is error");
        }
        if (index == 0) {
            this.addFirst(t);
            return;
        }
        Node preNode = this.head;
        //找到要插入节点的前一个节点
        for (int i = 0; i < index - 1; i++) {
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
    public int getLength() {
        //获取长度前，先判断下是否有环
        if (this.checkLoop()){
            throw new RuntimeException("该链表有环，获取长度异常");
        }
        int length = 0;
        Node tmpNode = this.head;
        while (tmpNode != null) {
            length++;
            tmpNode = tmpNode.next;
        }
        return length;
    }

    //正序输出链表的所有内容
    public void displayLinkList() {
        Node node = this.getHead();
        while (node != null) {
            System.out.printf((node.getVal() + "--->"));
            node = node.getNext();
        }
        System.out.printf("null");
        System.out.println("");
    }


    public void createLinkList(Link link) {
        link.addFirst(1);
        link.addFirst(2);
        link.addFirst(3);
        link.addFirst(4);
        link.addFirst(5);
        link.addFirst(6);
        System.out.println("插入数据后：Link:" + JSON.toJSONString(link));
        link.displayLinkList();

        //增加一个环形结构
        this.head.next.next.next.next = this.head.next;

    }


    /**
     * 单向链表逆向
     */
    public void reverseLinkList() {
//        this.reverseLinkList1();
        this.reverseLinkList_Stack();
        System.out.println("翻转后链表：" + JSON.toJSONString(this));
    }

    /**
     * 交换next
     *
     * @throws
     * @return: void
     * @time: 2021-05-31 17:13
     * @author: zsk
     */
    public void reverseLinkList1() {
        if (head == null || head.getNext() == null) {
            //当链表只有一个头节点或者只有一个结点，逆序还是原来的链表，所以直接返回
            return;
        } else {
            Node p = head;
            Node q = head.getNext();
            //将第一个结点的next置为空，否则会出现一个环
            p.setNext(null);
            Node temp = null;
            while (q != null) {
                /**
                 * 其实这里是用的类似于头插法的做法
                 * 首先原来的链表，在第一遍循环时，由于head.next = null 这个时候已经将链表分成了两个了
                 * 一个链表，p一直指向的是头部，随着后面的插入，也是将p变成新插入数据的next（就是头部插入）。
                 * 另一个链表就是temp临时指向的，一次循环后q = temp,q和temp都指向它，开始循环时，首先temp = q.next,不能丢了这个链表，然后把当前q的值，通过头部插入的方式插入到p链表中。
                 * 重复做法，一直到所有的数据都通过头部插入的方式放到新的p指向的链表中后。此时，p指向的链表中有所有已经反转后的数据了，head还保留着自己原来的一个节点的数据，next是null。
                 * 然后将原来的链表head = p。把值还给原来的链表就行了。
                 * */
                temp = q.getNext();
                q.setNext(p);
                p = q;
                q = temp;
            }
            if (q == null) {
                head = p;
            }
        }

    }

    /**
     * 借助栈来实现逆序输出
     * */
    public void reverseLinkList_Stack() {
        Stack<Node> stack = new Stack<Node>();
        Node node = head;
        while (null != node){
            stack.push(node);
            node = node.next;
        }
        while (stack.size() > 0){
            node = stack.pop();
            System.out.print(node.getVal() + "--->");
        }
        // 在最后添加上null作为结束标志
        System.out.println("null");
    }


    /**
     * 获取第k个节点
     * */
    public Object getValByIndex(Integer k){
        if (this.getLength() < k){
            System.out.println("查询的节点超过链表总长度");
            return null;
        }
        Node node = head;
        int i = 1;
        while (null != node){
            if (i == k){
                return node.getVal();
            }
            node = node.getNext();
            i ++;
        }
        return null;
    }

    /**
     * 获取倒数第k个节点-利用栈
     * */
    public Object getValByReverseIndex_stack(Integer k){
        if (this.getLength() < k){
            System.out.println("获取倒数第K个节点失败，总链表长度小于要获取的长度");
            return null;
        }
        //利用栈
        Stack<Node> stack = new Stack<>();
        Node node = head;
        while (null != node){
            stack.push(node);
            node = node.next;
        }
        int i = 1;
        while (stack.size() > 0){
            if (i == k){
                return stack.pop().getVal();
            }
            stack.pop();
            i ++;
        }
        return null;
    }

    /**
     * 获取倒数第k个节点-先后指针
     * */
    public Object getValByReverseIndex(Integer k){
        if (this.getLength() < k){
            System.out.println("获取倒数第K个节点失败，总链表长度小于要获取的长度");
            return null;
        }
        //定义两个指针 q和p p比q快k步，然后两个指针同时前进，当p指针为空时，q指针就是对的
        Node q = head;
        Node p = head;
        for (int i = 0; i < k; i ++){
            p = p.next;
        }
        while (null != p){
            q = q.next;
            p = p.next;
        }
        return q.getVal();
    }

    /**
     * 判断是否有环 true-有环，false-无环
     * */
    public boolean checkLoop(){
        Node slow = head;
        Node fast = head;
        while (null != fast && null != fast.next){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                System.out.println("慢指针追上快指针，有环形结构");
                return true;
            }
        }
        return false;
    }

    /**
     * 判断环的入口的值
     * */
    public Object getLoopEntrance(){
        //判断是否有环
        if (!this.checkLoop()){
            System.out.println("没有环结构");
            return 0;
        }
        /**
         * 在环上相遇后，假设起始点到环入口长度为 len1，环入口到相遇点位置为 len2，环长度为R，则：
         * 慢指针： S = len1 + len2
         * 快指针： 2S = len1 + R + len2
         * 所以推到出： len1 = R - len2
         * 即证明了第一次碰撞点Pos到连接点Join的距离=头指针到连接点Join的距离。
         *
         * */

        Node slow = head;
        Node fast = head;
        while (null != fast && null != fast.next){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                System.out.println("慢指针追上快指针，有环形结构.");
                break;
            }
        }

        if(null == fast || null == fast){
            return null;
        }

        //慢指针重新指向头节点
        slow = head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return  slow.val;
    }

    /**
     * 环的长度
     * */
    public int getLoopLength(){
        //判断是否有环
        if (!this.checkLoop()){
            System.out.println("没有环结构");
            return 0;
        }
        /**
         * 快慢指针第一次相遇（超一圈）时开始计数，计数器累加，第二次相遇时停止计数
         * 第二次相遇的时候快指针比慢指针正好又多走了一圈，也就是多走的距离等于环长
         * */
        Node slow = head;
        Node fast = head;
        int slowStep = 0;
        int fastStep = 0;
        boolean again = false;
        boolean begin = false;
        while (null != fast && null != fast.next){
            slow = slow.next;
            fast = fast.next.next;
            //超两圈后停止计数，挑出循环
            if(fast == slow && again == true) {
                break;
            }

            //超一圈后开始计数
            if(fast == slow && again == false) {
                begin = true;
                again = true;
            }

            //计数 +1
            if(begin == true) {
                fastStep  = fastStep +2;
                slowStep ++;
            }
        }
       return fastStep - slowStep;
    }

    /**
     * 排序
     * */
    public void sort(){

    }

    public static void main(String[] args) {
        Link link = new Link();
        link.createLinkList(link);

//        link.reverseLinkList();
//
//        link.displayLinkList();

//        System.out.println("第K个节点的值:" + link.getValByIndex(2));
//
//        System.out.println("倒数第K个节点的值:" + link.getValByReverseIndex(2));
//
//        System.out.println("倒数第K个节点的值:" + link.getValByReverseIndex(2));

//        System.out.println("判断是否有环形结构。结果：" + link.checkLoop());

        System.out.println("获取环形的入口值。结果：" + link.getLoopEntrance());

        System.out.println("计算环形长度。结果：" + link.getLoopLength());
    }
}
