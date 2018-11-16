heap in JAVA ---- PriorityQueue  
How to create PriorityQueue<Map.Entry<>> in JAVA：   
  
1. Just new a Comparator：  
```Java
PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>(
        new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {
                return e1.getValue() - e2.getValue();
            }
        });
```
2. optimize method 1  
```Java
PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>(
        (e1, e2) -> e1.getValue() - e2.getValue());
```
        
3. optimize method 2 
```Java
PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
```

method 3 is the best in JAVA8. You can directly call the static function compareInt in the comparator. Of course, if the comparison type is not Int but String, you can call other methods corresponding.   

The priorityQueue obtained here is Minimum heap. If you need to use the Maximum heap, use e2.getValue()-e1.getValue() in the first two ways.  

Of course, if you simply want to use the normal data type directly, such as the maximum heap of the priorityQueue (type int or String), you can just use new Comparator(...).    

-----------------
PS： PriorityQueue basic function and useage：

new PriorityQueue：
```Java
PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
```
insert：
```Java
priorityQueue.add(1);
```
or
```Java
priorityQueue.offer();
```
In the source code, the priority() method of PriorityQueue directly calls the offer() method, and the return type is boolean.  
View and return the top element of the heap without deleting:
```Java
priorityQueue.peek();
```
or
```Java
priorityQueue.element();
```
delete and return the top element 
```Java
priorityQueue.remove();
```
or
```Java
priorityQueue.poll();
```

Of course, PriorityQueue can also delete specific elements, the return type is boolean
```Java
priorityQueue.remove(1);
```
