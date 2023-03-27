# Assignemnt 3

### Q2

```java
public static Integer max(ArrayList<Integer> list) {
	if (list == null || list.size() == 0)
		return null;
	int maxNum = list.get(0);
	for (Integer integer : list)
		if (integer > maxNum)
			maxNum = integer;
	return maxNum;
}

```

### Q3

```java
public static void sort(ArrayList<Integer> list) {
	Collections.sort(list);
}
```