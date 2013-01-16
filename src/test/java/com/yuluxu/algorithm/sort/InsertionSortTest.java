package com.yuluxu.algorithm.sort;

import com.yuluxu.algorithm.sort.impl.InsertionSort;

public class InsertionSortTest extends SortTest
{
	@Override
	protected ISort createSort()
	{
		return new InsertionSort();
	}
}
