package com.yuluxu.algorithm.sort;

import org.junit.Test;

import junit.framework.TestCase;

public abstract class SortTest extends TestCase
{
	private static final int TEST_SIZE = 10;
	ISort sorter;

	@Test
	public void testSort()
	{
		int[] nums = createNums(TEST_SIZE);
		try
		{
			sorter.sort(nums);
			assertNotNull(nums);
			assertEquals(TEST_SIZE, nums.length);
			for (int i = 1; i < nums.length; i++)
			{
				assertFalse(nums[i] <= nums[i - 1]);
			}
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
			fail();
		}
	}

	public void setUp()
	{
		sorter = createSort();
	}

	protected abstract ISort createSort();

	private int[] createNums(int size)
	{
		int[] nums = new int[size];
		for (int i = 0; i < nums.length; i++)
		{
			nums[i] = size - i;
		}
		return nums;
	}
}
