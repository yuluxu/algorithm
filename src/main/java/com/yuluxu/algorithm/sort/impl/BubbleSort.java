package com.yuluxu.algorithm.sort.impl;

import com.yuluxu.algorithm.sort.ISort;

public class BubbleSort implements ISort
{
	// Testing分支添加的注释
	@Override
	public void sort(int[] nums)
	{
		for (int i = 0; i < nums.length; i++)
		{
			for (int j = nums.length - 1; j > i; j--)
			{
				if (nums[j - 1] > nums[j])
				{
					int temp = nums[j - 1];
					nums[j - 1] = nums[j];
					nums[j] = temp;
				}
			}
		}
	}
}
