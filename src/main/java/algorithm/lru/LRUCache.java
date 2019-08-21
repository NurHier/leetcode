package algorithm.lru;

import java.util.HashMap;

/**
 * LRU 算法实现
 */
public class LRUCache {
    private int cap;
    private HashMap<String, Node> map;
    private DoubleList cache;

    public LRUCache(int capacity) {
        // 初始化 LRU cache 的数据
        this.cap = capacity;
        map = new HashMap<>();
        cache = new DoubleList();
    }

    public int get(String key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        int val = map.get(key).val;
        put(key, val);
        return val;
    }

    public void put(String key, int val) {
        Node x = new Node(key, val);
        if (map.containsKey(key)) {
            cache.remove(map.get(key));

        } else if (cap == cache.size()) {
            Node last = cache.removeLast();
            map.remove(last.key);
        }
        cache.addFirst(x);
        map.put(key, x);
    }

    public static void main(String[] args) {
        LRUCache obj = new LRUCache(5);
        obj.put("1", 1);
        obj.put("2", 2);
        obj.put("3", 3);
        obj.put("4", 4);
        obj.put("5", 5);
        System.out.println(obj.get("1"));
        obj.put("6", 6);
        obj.put("7", 7);
        System.out.println(obj.get("2"));
        System.out.println(obj.get("3"));
        System.out.println(obj.get("4"));
        System.out.println(obj.get("5"));
        System.out.println(obj.get("6"));
        System.out.println(obj.get("7"));
    }
}

class DoubleList {
    private Node head, tail;
    private int size;

    public DoubleList() {
        head = new Node("0", 0);
        tail = new Node("0", 0);
        head.next = tail;
        tail.prev = head;
        size = 0;
    }

    /**
     * 在链表头部添加节点 x
     */
    public void addFirst(Node x) {
        x.next = head.next;
        x.prev = head;
        head.next.prev = x;
        head.next = x;
        size++;
    }

    /**
     * 删除链表中的 x 节点（x 一定存在）
     */
    public void remove(Node x) {
        x.prev.next = x.next;
        x.next.prev = x.prev;
        size--;

    }

    /**
     * 删除链表中最后一个节点，并返回该节点
     */
    public Node removeLast() {
        if (tail.prev == head) {
            return null;
        }
        Node last = tail.prev;
        remove(last);
        return last;
    }

    /**
     * 返回链表长度
     */
    public int size() {
        return size;
    }
}

class Node {
    String key;
    int val;
    Node prev, next;

    public Node(String key, int val) {
        this.key = key;
        this.val = val;
    }
}
