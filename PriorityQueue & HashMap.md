刷题的时候发现不是很熟悉JAVA 里的 heap(堆) 即 PriorityQueue 的用法，记录一下 PriorityQueue<Map.Entry<>> 的基本用法：  
  
写法一，直接 new 一个Comparator：  
```Java
PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>(
        new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {
                return e1.getValue() - e2.getValue();
            }
        });
```
写法二， 对写法一 优化：  
```Java
PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>(
        (e1, e2) -> e1.getValue() - e2.getValue());
```
        
写法三， 再优化  
```Java
PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
```
写法3 是JAVA 8 里面最好的写法, 可以直接调用 comparator 里面的静态方法 comparingInt, 当然如果比较类型不是Int 而是String的话也可以调用相应的其他方法。  

这里的写法最终得到的 priorityQueue 都是最小堆， 如果需要使用最大对的话，在前两种写法里面要用e2.getValue()-e1.getValue().  

当然，如果简单的想要直接用普通数据类型，比如 int 或者 String 类型的 priorityQueue 的最大堆， 也可以通过new 一个新的 Comparator 来完成。  

-----------------
附： PriorityQueue 的基本方法：

创建对象：
```Java
PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
```
插入：
```Java
priorityQueue.add(1);
```
或者
```Java
priorityQueue.offer();
```
在源码里，PriorityQueue 的add() 方法直接调用了offer() 方法，返回类型都是 boolean。

查看堆顶元素，返回堆顶元素但不删除：
```Java
priorityQueue.peek();
```
或者
```Java
priorityQueue.element();
```
删除堆顶元素并返回：
```Java
priorityQueue.remove();
```
或者
```Java
priorityQueue.poll();
```

当然，PriorityQueue 还可以 删除特定元素，返回值是boolean
```Java
priorityQueue.remove(1);
```
