package com.yuluxu.algorithm.sort;

import com.yuluxu.algorithm.sort.impl.BubbleSort;

public class BubbleSortTest extends SortTest
{
	@Override
	protected ISort createSort()
	{
		return new BubbleSort();
	}
}
