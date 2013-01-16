package com.yuluxu.algorithm.sort;

public class SortStopwatch implements ISort
{
	ISort sorter;

	public SortStopwatch(ISort sorter)
	{
		this.sorter = sorter;
	}

	@Override
	public void sort(int[] nums)
	{
		long startTime = System.currentTimeMillis();
		sorter.sort(nums);
		long endTime = System.currentTimeMillis();
		System.out.println(String.format("%s cost %s ms", sorter.getClass().getName(), endTime - startTime));
	}
}
