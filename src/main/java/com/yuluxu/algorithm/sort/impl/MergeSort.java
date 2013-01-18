package com.yuluxu.algorithm.sort.impl;

import com.yuluxu.algorithm.sort.ISort;

/**
 * 合并排序
 * @author yuluxu
 *
 */
public class MergeSort implements ISort
{
	@Override
	public void sort(int[] nums)
	{
		sort(nums, 0, nums.length - 1);
	}

	private void sort(int[] nums, int p, int r)
	{
		if (r > p)
		{
			int q = (p + r) / 2;
			sort(nums, p, q);
			sort(nums, q + 1, r);
			merge(nums, p, q, r);
		}
	}

	private void merge(int[] nums, int p, int q, int r)
	{
		int[] lArray = getSubArray(nums, p, q);
		int[] rArray = getSubArray(nums, q + 1, r);
		int lLength = lArray.length;
		int rLength = rArray.length;
		int i = 0;
		int j = 0;
		while (i < lLength || j < rLength)
		{
			if (i == lLength)
			{
				nums[p++] = rArray[j++];
			}
			else if (j == rLength)
			{
				nums[p++] = lArray[i++];
			}
			else if (lArray[i] < rArray[j])
			{
				nums[p++] = lArray[i++];
			}
			else
			{
				nums[p++] = rArray[j++];
			}
		}
	}

	private int[] getSubArray(int[] nums, int startIdx, int endIdx)
	{
		int[] subNums = new int[endIdx - startIdx + 1];
		for (int i = 0; i < subNums.length; i++)
		{
			subNums[i] = nums[startIdx++];
		}
		return subNums;
	}
}
