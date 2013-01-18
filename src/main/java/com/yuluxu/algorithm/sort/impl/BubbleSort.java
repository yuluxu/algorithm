package com.yuluxu.algorithm.sort.impl;

import com.yuluxu.algorithm.sort.ISort;

/**
 * 冒泡排序
 * 
 * @author yuluxu
 * 
 */
public class BubbleSort implements ISort
{
	// Edit on web
	// Edit on web 2
	@Override
	public void sort(int[] nums)
	{
		// 特性B开发
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
