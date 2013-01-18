package com.yuluxu.algorithm.sort.impl;

import com.yuluxu.algorithm.sort.ISort;

/**
 * 插入排序
 * @author yuluxu
 *
 */
public class InsertionSort implements ISort
{
	@Override
	public void sort(int[] nums)
	{
		for (int i = 1; i < nums.length; i++)
		{
			int key = nums[i];
			int j = i -1;
			while(j >= 0 && nums[j] > key)
			{
				nums[j+1] = nums[j];
				j--;
			}
			nums[j+1] = key;
		}
	}
	
	// testing 代码
}
