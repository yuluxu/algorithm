package com.yuluxu.algorithm.sort;

import com.yuluxu.algorithm.sort.impl.MergeSort;

public class MergeSortTest extends SortTest
{
	@Override
	protected ISort createSort()
	{
		return new MergeSort();
	}
}
